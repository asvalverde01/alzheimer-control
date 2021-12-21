package app.logic;

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
    /Métodos complementarios de la clase ResultadoActividad
    /-------------------------------------------------------------*/
    public void calcularPuntuacion(){
        // TODO
    }

    public void setFechaActual(){
        // TODO
    }

    public void visualizarResultados(){
        // TODO
    }
}
