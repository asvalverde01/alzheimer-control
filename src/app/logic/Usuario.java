package app.logic;

import java.util.StringTokenizer;

public class Usuario {
    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String nombre;
    private String apellido;
    private String avatar;
    public Fecha fechaNacimiento;
    private int etapa;
    private ResultadoActividad[] actividades;


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
    public String getAvatar() {
        return avatar;
    }

    /**
     * Asigna el avatar del usuario
     *
     * @param avatar String
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Regresa la fecha de nacimiento del usuario
     *
     * @return Fecha fechaNacimiento
     */
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

    /**
     * Regresa la etapa del usuario
     *
     * @return int etapa
     */
    public int getEtapa() {
        return etapa;
    }

    /**
     * Asigna la etapa del usuario
     *
     * @param etapa int
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    /**
     * Regresa las actividades del usuario
     *
     * @return ResultadoActividad[] actividades
     */
    public ResultadoActividad[] getActividades() {
        return actividades;
    }

    /**
     * Asigna las actividades del usuario
     *
     * @param actividades ResultadoActividad[]
     */
    public void setActividades(ResultadoActividad[] actividades) {
        this.actividades = actividades;
    }

    /*-------------------------------------------------------------
    /Métodos de la clase
    /-------------------------------------------------------------*/

    public void visualizarInfoUsuario() {

    }

    public void visualizarRecomendaciones() {

    }


    /*-------------------------------------------------------------
    /Métodos contenedores de los juegos para el Usuario
    /-------------------------------------------------------------*/

    public void ejecutarSumasRestas() {

    }

    public void ejecutarComprensionLectora() {
        

    }

    public void ejecutarMemoria() {

    }
    
    

    String[] respuestas = {
      "Perro","Gato","Azul","Rojo","Mamá"
    };
    
    String[] radioR = {
        "1,2,3,4",
        "2,3,4,5",
        "3,4,5,6",
        "4,5,6,7",
        "5,6,7,8",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
    String[] preguntas = {
        "Pregunta 1", "Pregunta 2", "Pregunta 3",
        "Pregunta 4", "Pregunta 5"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}