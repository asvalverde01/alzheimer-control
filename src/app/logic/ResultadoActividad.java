package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultadoActividad {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String id;
    private String nombre;
    private int aciertos;
    private float puntuacion;
    private Fecha fecha;
    private String etapa;
    private int segundos;


    /*-------------------------------------------------------------
    /Constructor de la clase ResultadoActividad
    /-------------------------------------------------------------*/
    public ResultadoActividad(String cedula, String nombre, int aciertos, float puntuacion, Fecha fecha, String etapa, int segundos) {
        this.id = cedula;
        this.nombre = nombre;
        this.aciertos = aciertos;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
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
        boolean conectado = Main.isConectado();
        if (conectado) {
            // En el la tabla usuario de la base de datos registra los datos
            try {
                // Fecha en la cual se realiza la actividad
                int dia = fecha.getDia();
                String mes = fecha.getMesString();
                int anio = fecha.getAnio();

                String SQL = "INSERT INTO actividad (id, nombre, aciertos, puntuacion, etapa, segundos, dia, mes, anio) VALUES ('" + id + "','" + nombre + "', '" + aciertos + "', '" + puntuacion + "',  '" + etapa + "', '" + segundos + "' , '" + dia + "', '" + mes + "', '" + anio + "')";
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

    // metodo toString
    @Override
    public String toString() {
        return "ResultadoActividad{" + "id=" + id + ", nombre=" + nombre + ", aciertos=" + aciertos + ", puntuacion=" + puntuacion + ", fecha=" + fecha + ", etapa=" + etapa + ", segundos=" + segundos + '}';
    }

}
