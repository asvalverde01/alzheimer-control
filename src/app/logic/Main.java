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
        File file = new File("appdata.sqlite");

        /*-------------------------------------------------------------
        /Se busca si existe una archivo base de datos
        /-------------------------------------------------------------*/
        if (file.exists()) //Verifica si existe el archivo
        {
            // Se conecta a la base de datos
            conectado = conectarBaseDatos();
            usuario = obtenerUsuarioDataBase();

            // Inicia el programa mostrando el inicio
            MainScreen main = new MainScreen(usuario);
            main.setVisible(true);
            main.setLocationRelativeTo(null);
        } else {
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
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
                    + "	avatar integer,\n"
                    + "	dianac integer,\n"
                    + "	mesnac integer,\n"
                    + "	anionac integer,\n"
                    + "	etapa integer\n"
                    + ");";
            PreparedStatement st = connect.prepareStatement(sql);
            st.execute();

            // Se crea la tabla con informacion de actividades
            sql = "CREATE TABLE IF NOT EXISTS actividad (\n"
                    + "	nombre text,\n"
                    + "	aciertos integer,\n"
                    + "	puntuacion real,\n"
                    + "	intento integer,\n"
                    + "	etapa integer,\n"
                    + "	segundos integer,\n"
                    + "	dia integer,\n"
                    + "	mes text,\n"
                    + "	anio integer\n"
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
                usuario.setAvatar(rs.getInt("avatar"));
                usuario.setEtapa(rs.getInt("etapa"));

                nacimiento.setDia(rs.getInt("dianac"));
                nacimiento.setMes(rs.getInt("mesnac"));
                nacimiento.setAnio(rs.getInt("anionac"));
                usuario.setFechaNacimiento(nacimiento);
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return usuario;
    }
} // FIN CLASE  
