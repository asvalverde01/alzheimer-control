package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultadoActividad {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String nombre;
    private int aciertos;
    private float puntuacion;
    private Fecha fecha;
    private int intento;
    private String etapa;
    private int segundos;


    /*-------------------------------------------------------------
    /Constructor de la clase ResultadoActividad
    /-------------------------------------------------------------*/
    public ResultadoActividad(String nombre, int aciertos, float puntuacion, Fecha fecha, int intento, String etapa, int segundos) {
        this.nombre = nombre;
        this.aciertos = aciertos;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.intento = intento;
        this.etapa = etapa;
        this.segundos = segundos;
    }
    
    /*-------------------------------------------------------------
    /Métodos get y set de la clase ResultadoActividad
    /-------------------------------------------------------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /*-------------------------------------------------------------
    /Métodos  de la clase ResultadoActividad
    /-------------------------------------------------------------*/
    public boolean registrarDataBase() {
        // Guarda los atributos en la tabla actividad en la base de datos
        boolean conectado = Main.crearBaseDatos();
        if (conectado) {
            // En el la tabla usuario de la base de datos registra los datos
            try {
                // Fecha en la cual se realiza la actividad
                int dia = fecha.getDia();
                String mes = fecha.getMesString();
                int anio = fecha.getAnio();

                String SQL = "INSERT INTO actividad (nombre, aciertos, puntuacion, intento, etapa, segundos, dia, mes, anio) VALUES ('" + nombre + "', '" + aciertos + "', '" + puntuacion + "', '" + intento + "', '" + etapa + "', '" + segundos + "' , '" + dia + "', '" + mes + "', '" + anio + "')";
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                st.executeUpdate();
                return true;

            } catch (SQLException ex) {
                // En caso de que no se pueda guardar el usuario elimina la base de datos creada
                Main.eliminarDataBase();
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");

                // Termina el programa
                System.exit(0);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
        return false;
    }

}
