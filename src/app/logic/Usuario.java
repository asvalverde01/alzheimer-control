package app.logic;

import app.gui.actividades.ActividadColores;
import app.gui.actividades.ActividadComprension;
import app.gui.actividades.ActividadMemoria;
import app.gui.actividades.ActividadSumaResta;
import app.gui.actividades.ActividadIdentificarLetras;
import app.gui.actividades.ActividadReconocerSonido;

public class Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String nombre;
    private String apellido;
    private int avatar;
    public Fecha fechaNacimiento;
    private int etapa;


    /*-------------------------------------------------------------
    /Métodos get y set de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Regresa el nombre del usuario
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del usuario
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del usuario
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del usuario
     *
     * @param apellido String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa el avatar del usuario
     *
     * @return String avatar
     */
    public int getAvatar() {
        return avatar;
    }

    /**
     * Asigna el avatar del usuario
     *
     * @param avatar String
     */
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /**
     * Regresa la fecha de nacimiento del usuario
     *
     * @return Fecha fechaNacimiento
     */
    public String getFechaNacimientoString() {
        return fechaNacimiento.getDia() + "/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAnio();
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del usuario
     *
     * @param fechaNacimiento Fecha
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getEdad() {
        return fechaNacimiento.calcularEdad(fechaNacimiento);
    }

    /**
     * Regresa la etapa del usuario
     *
     * @return int etapa
     */
    public int getEtapa() {
        return etapa;
    }

    public String getEtapaUsuario() {
        switch (etapa) {
            case 0:
                return "Leve";
            case 1:
                return "Moderada";
            case 2:
                return "Avanzada";
            default:
                return "Leve";
        }
    }

    /**
     * Asigna la etapa del usuario
     *
     * @param etapa int
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

   
    /*-------------------------------------------------------------
    /Métodos de la clase
    /-------------------------------------------------------------*/
    public void visualizarInfoUsuario() {
        //Solo modo consola
    }

    public void visualizarRecomendaciones() {
        //Solo modo consola

    }


    /*-------------------------------------------------------------
    /Métodos contenedores de los juegos para el Usuario
    /-------------------------------------------------------------*/
    // Actividades etapa Leve/-------------------------------------------------------------*/
    public void ejecutarSumasRestas() {
        ActividadSumaResta actividadSumaResta = new ActividadSumaResta();
        actividadSumaResta.setVisible(true);
        actividadSumaResta.setLocationRelativeTo(null);

    }

    public void ejecutarComprensionLectora() {
        ActividadComprension actividadComprension = new ActividadComprension();
        actividadComprension.setVisible(true);
        actividadComprension.setLocationRelativeTo(null);
    }

    public void ejecutarMemoria() {
        ActividadMemoria actividadMemoria = new ActividadMemoria();
        actividadMemoria.setVisible(true);
        actividadMemoria.setLocationRelativeTo(null);
    }

    // Actividades etapa Moderada/-------------------------------------------------------------*/
    public void ejecutarIdentificarLetra() {
        ActividadIdentificarLetras identificarLetras = new ActividadIdentificarLetras();
        identificarLetras.setVisible(true);
        identificarLetras.setLocationRelativeTo(null);

    }


    public void ejecutarReconocerSonido() {
        ActividadReconocerSonido actividadReconocerSonido = new ActividadReconocerSonido();
        actividadReconocerSonido.setVisible(true);
        actividadReconocerSonido.setLocationRelativeTo(null);
    }

    public void ejecutarIdentificarColor() {
        ActividadColores actividadActividadColores = new ActividadColores();
        actividadActividadColores.setVisible(true);
        actividadActividadColores.setLocationRelativeTo(null);
    }
}
