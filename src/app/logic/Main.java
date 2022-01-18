package app.logic;

import app.gui.inicio.MainScreen;
import app.gui.inicio.RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Integer.parseInt;

public class Main {
    // Direccion de la base de datos
    static String url = "jdbc:sqlite:appdata.sqlite";
    // Objeto de conección con la base SQLite
    static Connection connect;
    // Indica si existe coneccion con base de datos
    static boolean conectado = false;

    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos de la clase Main
        /-------------------------------------------------------------*/
        Usuario usuario = new Usuario();
        boolean usuarioRegistrado = false;

        // Inicializa la base de datos
        conectado = conectarBaseDatos();

        /*-------------------------------------------------------------
        /Se busca el archivo que busca al usuario
        /-------------------------------------------------------------*/
        String archivo = "user.csv";
        String line = "";
        try {
            // Se busca el archivo o se crea de ser necesario

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            // Se lee el archivo en busca del usuario
            // En caso de que si existe un usuario registrado
            if ((br.readLine()) != null) {
                usuarioRegistrado = true;
            }

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                // Inicializa los valores del objeto usuario
                try {
                    usuario.setNombre(row[0]);
                    usuario.setApellido(row[1]);
                    usuario.setEtapa(parseInt(row[5]));

                    Fecha nacimiento = new Fecha();
                    nacimiento.setDia(parseInt(row[2]));
                    nacimiento.setMes(parseInt(row[3]));
                    nacimiento.setAnio(parseInt(row[4]));
                    try {
                        usuario.setFechaNacimiento(nacimiento);
                    } catch (Exception e) {
                        System.out.println("Error, en fecha (Posible error en formato)");
                    }
                } catch (Exception e) {
                    System.out.println("Error al asignar");
                }
            }
            // Se cierran los buffers (Muy importante)
            br.close();

            // En caso de que no exista un archivo se crea uno
        } catch (FileNotFoundException ex) {
            // Registra al usuario creando un nuevo documento
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
            return;
        } catch (IOException e) {
            System.out.println("Error al crear y abrir");
        } catch (Exception ne) {
            ne.printStackTrace();
        }

        /*-------------------------------------------------------------
        / Inicio del programa
        /-------------------------------------------------------------*/
        if (usuarioRegistrado) {
            MainScreen main = new MainScreen(usuario);
            main.setVisible(true);
            main.setLocationRelativeTo(null);
        } else {
            System.out.println("Error en main");
        }


    }


    public static String getUrl() {
        return url;
    }

    public static Connection getConnect() {
        return connect;
    }

    public static boolean isConectado() {
        return conectado;
    }
    
    


    public static boolean conectarBaseDatos() {
        try {
            connect = DriverManager.getConnection(url);
            String sql = "CREATE TABLE IF NOT EXISTS actividad (\n"
                    + "	id integer,\n"
                    + "	nombre text\n"
                    + ");";
            PreparedStatement st = connect.prepareStatement(sql);
            st.execute();
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
            return false;

        }
        return true;
    }

    public static void cerrarConexion() {
        try {
            connect.close();
            JOptionPane.showMessageDialog(null, "Cerrado");
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
    }
}
