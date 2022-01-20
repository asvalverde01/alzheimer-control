package app.logic;

import app.gui.inicio.MainScreen;
import app.gui.inicio.RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.*;

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


        /*-------------------------------------------------------------
        /Se busca si existe una archivo base de datos
        /-------------------------------------------------------------*/
        File file = new File("appdata.sqlite");

        if (file.exists()) //Verifica si existe el archivo
        {
            // Inicializa la base de datos
            conectado = conectarBaseDatos();
            System.out.println("Base de datos encontrada y conectada");
            System.out.println("paso 1");
            usuario = obtenerUsuarioDataBase();
            System.out.println("Datos del usuario obtenidos");
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Fecha " + usuario.getFechaNacimientoString());
            System.out.println("Etapa: " + usuario.getEtapa());
            usuarioRegistrado = true;
        } else {
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
        }



        /*-------------------------------------------------------------
        /Se busca el archivo que busca al usuario
        /-------------------------------------------------------------
        String archivo = "user.csv";
        String line;
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

         */

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


    public static boolean crearBaseDatos() {
        try {
            connect = DriverManager.getConnection(url);
            // Se crea la tabla con informacion de usuario
            String sql = "CREATE TABLE IF NOT EXISTS usuario (\n"
                    + "	id integer,\n"
                    + "	nombre text,\n"
                    + "	apellido text,\n"
                    + "	dianac integer,\n"
                    + "	mesnac integer,\n"
                    + "	anionac integer,\n"
                    + "	etapa integer\n"
                    + ");";
            PreparedStatement st = connect.prepareStatement(sql);
            st.execute();

            // Se crea la tabla con informacion de actividades
            sql = "CREATE TABLE IF NOT EXISTS actividad (\n"
                    + "	id integer,\n"
                    + "	nombre text\n"
                    + ");";
            st = connect.prepareStatement(sql);
            st.execute();
            System.out.println("Base de datos creada");
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
        }
        return true;
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
            JOptionPane.showMessageDialog(null, x.getMessage());
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
    
    public static boolean eliminarDataBase() {
         try {
                    // closes the database file
                    connect.close();
                    File myObj = new File("appdata.sqlite");
                    if (myObj.delete()) {
                        System.out.println("Deleted the file: " + myObj.getName());
                        return true;
                    } else {
                        System.out.println("Failed to delete the file.");
                    }
                } catch (SQLException ex1) {
                    JOptionPane.showMessageDialog(null, ex1.getMessage());
                }
         return false;
    }

    private static Usuario obtenerUsuarioDataBase() {
        Usuario usuario = new Usuario();
        Fecha nacimiento = new Fecha();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEtapa(rs.getInt("etapa"));

                nacimiento.setDia(rs.getInt("dianac"));
                nacimiento.setMes(rs.getInt("mesnac"));
                nacimiento.setAnio(rs.getInt("anionac"));
                usuario.setFechaNacimiento(nacimiento);
                System.out.println("Usuario obtenido de la base de datos");
                System.out.println("Usuario: " + usuario.getNombre());
                System.out.println("Apellido: " + usuario.getApellido());
                System.out.println("Fecha " + usuario.getFechaNacimientoString());
                System.out.println("Etapa: " + usuario.getEtapa());
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        return usuario;
    }

}
