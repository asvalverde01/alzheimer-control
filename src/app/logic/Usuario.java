package app.logic;

import java.util.StringTokenizer;

public class Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String nombre;
    private String apellido;
    private String avatar;
    private Fecha fechaNacimiento;
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

    //PREGUNTAS 1
    String[] respuestas = {
        "Perro", "Luna", "Pera"
    };

    String[] radioR = {
        "Perro,Gato,Perico",
        "Sol,Luna,Arbol",
        "Manzana,Luz,Pera",};

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    //PREGUNTAS 2
    String[] respuestas2 = {
        "Mercurio", "Marco", "Limon"
    };

    String[] radioR2 = {
        "Mercurio,Venus,Tierra",
        "Luis,Pedro,Marco",
        "Limon,Nuez,Mango",};

    public String getRespuesta2(int posicion) {
        return respuestas2[posicion];
    }

    public String[] setRespuestas2(int posicion) {
        String s1 = radioR2[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    //PREGUNTAS 3
    String[] respuestas3 = {
        "Tres", "Noche", "Pacífico"
    };

    String[] radioR3 = {
        "Uno,Dos ,Tres",
        "Noche ,Dia, Tarde",
        "Pacífico,Atlantico,Artico",};

    public String getRespuesta3(int posicion) {
        return respuestas3[posicion];
    }

    public String[] setRespuestas3(int posicion) {
        String s1 = radioR3[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    //PREGUNTAS 4
    String[] respuestas4 = {
        "Blusa", "a", "Lenovo"
    };

    String[] radioR4 = {
        "Vestido,Falda ,Blusa",
        "a,b,c",
        "HP,Lenovo,Dell",};

    public String getRespuesta4(int posicion) {
        return respuestas4[posicion];

    }

    public String[] setRespuestas4(int posicion) {
        String s1 = radioR4[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    //PREGUNTAS 5
    String[] respuestas5 = {
        "Enero", "Lunes", "Boca"
    };

    String[] radioR5 = {
        "Febrero,Enero,Marzo",
        "Jueves ,Miercoles,Lunes",
        "Ojos,Boca,Nariz",};

    public String getRespuesta5(int posicion) {
        return respuestas5[posicion];
    }

    public String[] setRespuestas5(int posicion) {
        String s1 = radioR5[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    String[] preguntas2 = {
        "Pregunta 2", "Pregunta 2", "Pregunta 2",};
    String[] preguntas3 = {
        "Pregunta 3", "Pregunta 3", "Pregunta 3",};
    String[] preguntas = {
        "Preguntas 1", "Pregunta 1", "Pregunta 1",};
    String[] preguntas4 = {
        "Pregunta 4", "Pregunta 4", "Pregunta 4",};
    String[] preguntas5 = {
        "Pregunta 5", "Pregunta 5", "Pregunta 5",};

    public String getPregunta(int posicion) {
        return preguntas[posicion];
    }

    public String getPregunta2(int posicion) {
        return preguntas2[posicion];
    }

    public String getPregunta3(int posicion) {
        return preguntas3[posicion];
    }

    public String getPregunta4(int posicion) {
        return preguntas4[posicion];
    }

    public String getPregunta5(int posicion) {
        return preguntas5[posicion];
    }

    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);

        String[] a = new String[16];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }

        return a;
    }

}
