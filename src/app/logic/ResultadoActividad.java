package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  Programa BrainUP
 *  Clase ResultadoActividad, se encarga de almacenar los resultados de las actividades
 *  Guarda la información de las actividades en la base de datos
 * @author Valverde, Vinueza, Vintimilla
 */
public class ResultadoActividad {

    /*-------------------------------------------------------------
    /Atributos de la clase ResultadoActividad 
    /-------------------------------------------------------------*/
    private final String id;
    private String nombre;
    private int aciertos;
    private Fecha fecha;
    private String etapa;
    private int segundos;


    /*-------------------------------------------------------------
    /Constructor de la clase ResultadoActividad
    /-------------------------------------------------------------*/

    /**
     * Constructor de la clase ResultadoActividad
     *
     * @param cedula   cedula del usuario
     * @param nombre   nombre de la actividad
     * @param aciertos aciertos del usuario
     * @param fecha    fecha de la actividad
     * @param etapa    etapa de la actividad
     * @param segundos segundos de la actividad
     */
    public ResultadoActividad(String cedula, String nombre, int aciertos, Fecha fecha, String etapa, int segundos) {
        this.id = cedula;
        this.nombre = nombre;
        this.aciertos = aciertos;
        this.fecha = fecha;
        this.etapa = etapa;
        this.segundos = segundos;
    }

    /*-------------------------------------------------------------
    /Métodos get  de la clase ResultadoActividad
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
     * Regresa los aciertos de la actividad
     *
     * @return int aciertos
     */
    public int getAciertos() {
        return aciertos;
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
     * Regresa la etapa de la actividad
     *
     * @return String etapa
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Regresa los segundos de la actividad
     *
     * @return int segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /*-------------------------------------------------------------
    /Métodos  de la clase ResultadoActividad
    /-------------------------------------------------------------*/

    /**
     * Registra el resultado de la actividad en la base de datos
     *
     */
    public void registrarDataBase() {
        // Guarda los atributos en la tabla actividad en la base de datos
        boolean conectado = Main.isConectado();
        if (conectado) {
            // En el la tabla actividad de la base de datos registra los datos
            try {
                // Fecha en la cual se realiza la actividad
                int dia = fecha.getDia();
                String mes = fecha.getMesString();
                int anio = fecha.getAnio();

                // Orden SQL para guardar los datos
                String SQL = "INSERT INTO actividad (id, nombre, aciertos, etapa, segundos, dia, mes, anio) VALUES ('" + id + "','" + nombre + "', '" + aciertos + "', '" + etapa + "', '" + segundos + "' , '" + dia + "', '" + mes + "', '" + anio + "')";
                // Prepara el objeto de orden SQL
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                // Ejecuta la orden SQL
                st.executeUpdate();
                // regresa true si se registro correctamente
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                // Imprime el error en consola
                ex.printStackTrace();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                // Imprime el error en consola
                ex.printStackTrace();
            }
        } else {
            // Si no se conecta a la base de datos
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
    }
}
