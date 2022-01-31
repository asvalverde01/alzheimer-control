package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultadoActividad {

    /*-------------------------------------------------------------
    /Atributos de la clase ResultadoActividad 
    /-------------------------------------------------------------*/
    private final String id;
    private String nombre;
    private int aciertos;
    private float puntuacion;
    private Fecha fecha;
    private String etapa;
    private int segundos;


    /*-------------------------------------------------------------
    /Constructor de la clase ResultadoActividad
    /-------------------------------------------------------------*/

    /**
     * Constructor de la clase ResultadoActividad
     *
     * @param cedula     cedula del usuario
     * @param nombre     nombre de la actividad
     * @param aciertos   aciertos del usuario
     * @param puntuacion puntuacion del usuario
     * @param fecha      fecha de la actividad
     * @param etapa      etapa de la actividad
     * @param segundos   segundos de la actividad
     */
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

    /**
     * Regresa el nombre de la actividad
     *
     * @return nombre de la actividad
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Asigna los nombres de la actividad
     *
     * @param nombre String nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa los aciertos de la actividad
     *
     * @return int aciertos
     */
    public int getAciertos() {
        return aciertos;
    }

    /**
     * Asigna los aciertos de la actividad
     *
     * @param aciertos int aciertos
     */
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    /**
     * Regresa la puntuacion usuario
     *
     * @return float puntuacion
     */
    public float getPuntuacion() {
        return puntuacion;
    }

    /**
     * Asigna la puntuacion de la actividad
     *
     * @param puntuacion float puntuacion
     */
    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Regresa la fecha de la actividad
     *
     * @return Fecha fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Asigna la fecha de la actividad
     *
     * @param fecha Fecha fecha
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Regresa la etapa de la actividad
     *
     * @return String etapa
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Asigna la etapa de la actividad
     *
     * @param etapa String etapa
     */
    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    /**
     * Regresa los segundos de la actividad
     *
     * @return int segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Asigna los segundos de la actividad
     *
     * @param segundos int segundos
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /*-------------------------------------------------------------
    /Métodos  de la clase ResultadoActividad
    /-------------------------------------------------------------*/

    /**
     * Registra el resultado de la actividad en la base de datos
     *
     * @return boolean true si se registro correctamente, false si no
     */
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
}
