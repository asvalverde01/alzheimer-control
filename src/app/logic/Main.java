package app.logic;

import app.gui.inicio.InicioForm;
import app.gui.inicio.RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Direccion de la base de datos
    static String url = "jdbc:sqlite:appdata.sqlite";
    // Objeto de conección con la base SQLite
    static Connection connect;
    // Indica si existe coneccion con base de datos
    public static boolean conectado = false;

    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos de la clase Main
        /-------------------------------------------------------------*/
        // Objeto de Usuario
        Usuario usuario = new Usuario();
        // Lista de usuarios registrados
        List<Usuario> usuarios = new ArrayList<>();
        // Objeto del archivo de la base de datos
        File file = new File("appdata.sqlite");


        /*-------------------------------------------------------------
        /Se busca si existe una archivo base de datos
        /-------------------------------------------------------------*/
        if (file.exists()) //Verifica si existe el archivo
        {
            // Se conecta a la base de datos
            conectado = conectarBaseDatos();
            // Saca los usuarios registrados
            usuarios = obtenerUsuarioDataBase(usuarios);

            // Inicia el programa mostrando el inicio
            InicioForm mainInicio = new InicioForm(usuarios);
            mainInicio.setVisible(true);
            mainInicio.setLocationRelativeTo(null);

        } else {
            RegistroUsuario registro = new RegistroUsuario(usuarios);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
        }
    }

    public static void setConectado(boolean conectado) {
        Main.conectado = conectado;
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
            // Guardar la cedula como ID 
            // 
            String sql = "CREATE TABLE IF NOT EXISTS usuario (\n"
                    + "	cedula text,\n"
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
                    + "	id integer,\n"
                    + "	nombre text,\n"
                    + "	aciertos integer,\n"
                    + "	puntuacion real,\n"
                    + "	etapa text,\n"
                    + "	segundos integer,\n"
                    + "	dia integer,\n"
                    + "	mes text,\n"
                    + "	anio integer\n"
                    + ");";
            st = connect.prepareStatement(sql);
            st.execute();
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            return false;
        }
        return true;
    }

    public static boolean conectarBaseDatos() {
        try {
            connect = DriverManager.getConnection(url);
            System.out.println("conectando");
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

    private static List<Usuario> obtenerUsuarioDataBase(List<Usuario> usuariosLista) {

        Fecha nacimiento = new Fecha();
        // Se obtiene la informacion de la tabla usuario en base de datos
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCedula(rs.getString("cedula"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setAvatar(rs.getInt("avatar"));
                usuario.setEtapa(rs.getInt("etapa"));

                nacimiento.setDia(rs.getInt("dianac"));
                nacimiento.setMes(rs.getInt("mesnac"));
                nacimiento.setAnio(rs.getInt("anionac"));
                usuario.setFechaNacimiento(nacimiento);
                // añade el usuario registrado a la lista
                usuariosLista.add(usuario);
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        // Regresa el usuario que se ha guardado
        return usuariosLista;
    }
} // FIN CLASE  

