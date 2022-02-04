package app.logic;

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
    private final String nombre;
    private final int aciertos;
    private final Fecha fecha;
    private final String etapa;
    private final int segundos;


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

    public String getId() {
        return id;
    }

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

    
}
