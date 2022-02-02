package app.logic;

import app.gui.inicio.InicioForm;
import app.gui.inicio.RegistroUsuario;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  Programa BrainUP
 *  Clase Main. Se encarga de empezar el programa verificando si existe una base de datos
 *  Se encarga de las conexiones y administración de la base de datos
 * @author Valverde, Vinueza, Vintimilla
 */
public class Main {

    /*-------------------------------------------------------------
    /Atributos de la clase Main :)
    /-------------------------------------------------------------*/
    // Direccion de la base de datos
    // Atributo publico pues permite a otras clases accceder a la ubicación de la base de datos
    public static String url = "jdbc:sqlite:appdata.sqlite";
    // Objeto de conección con la base SQLite
    // Atributo público pues es usado por otras clases para realizar conexiones y peticiones SQL
    public static Connection connect;
    // Indica si existe coneccion con base de datos
    // Permite a otras clases conocer si la conexión con la base de datos existe
    private static boolean conectado = false;

    /**
     * Inicializa el programa
     * @param args 
     */
    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos 
        /-------------------------------------------------------------*/
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

    
    /*-------------------------------------------------------------
    /Métodos get y set de la clase Main
    /-------------------------------------------------------------*/
    public static void setConectado(boolean conectado) {
        Main.conectado = conectado;
    }

    public static Connection getConnect() {
        return connect;
    }

    public static boolean isConectado() {
        return conectado;
    }

    /**
     * Método que crea una base de datos.
     * Crea la tabla usuario y actividad
     * @return true si se ha podido crear a la base de datos
     */
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

    /**
     *  Método que conecta el programa con la base de datos 
     * @return true si se ha podido conectar a la base de datos
     */
    public static boolean conectarBaseDatos() {
        try {
            // Guarda en cconnect la conexión 
            connect = DriverManager.getConnection(url);
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            return false;

        }
        return true;
    }


    /**
     * Método que elimina toda la base de datos. 
     * Elimina el archivo en el cual se almacena toda la información
     * @return true si se ha eliminado la base de datos
     */
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

    
} // FIN CLASE  

