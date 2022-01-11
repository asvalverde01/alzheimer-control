package app.logic;

import app.Gui.ActividadColores;
import app.Gui.ActividadComprension;
import app.Gui.ActividadMemoria;
import app.Gui.ActividadSumaResta;
import app.Gui.IdentificarLetras;
import app.Gui.ReconocerSonido;
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
        System.out.println("ejecutando sumas restas");
        ActividadSumaResta actividadSumaResta = new ActividadSumaResta();
        actividadSumaResta.setVisible(true);
        actividadSumaResta.setLocationRelativeTo(null);

    }

    public void ejecutarComprensionLectora() {
        System.out.println("ejecutando comprension Lectora");
        ActividadComprension actividadComprension = new ActividadComprension();
        actividadComprension.setVisible(true);
        actividadComprension.setLocationRelativeTo(null);
    }

    public void ejecutarMemoria() {
        System.out.println("ejecutando memoria");
        ActividadMemoria actividadMemoria = new ActividadMemoria();
        actividadMemoria.setVisible(true);
        actividadMemoria.setLocationRelativeTo(null);
    }

    // Actividades etapa Moderada/-------------------------------------------------------------*/
    public void ejecutarIdentificarLetra() {
        System.out.println("ejecutando sumas restas");
        IdentificarLetras identificarLetras = new IdentificarLetras();
        identificarLetras.setVisible(true);
        identificarLetras.setLocationRelativeTo(null);

    }

    public void ejecutarReconocerSonido() {
        System.out.println("ejecutando comprension Lectora");
        ReconocerSonido actividadReconocerSonido = new ReconocerSonido();
        actividadReconocerSonido.setVisible(true);
        actividadReconocerSonido.setLocationRelativeTo(null);
    }

    public void ejecutarIdentificarColor() {
        System.out.println("ejecutando memoria");
        ActividadColores actividadActividadColores = new ActividadColores();
        actividadActividadColores.setVisible(true);
        actividadActividadColores.setLocationRelativeTo(null);
    }

    //AQUÍ EMPIZA LA ACTIVIDAD DE LA COMPRENSIÓN LECTORA
    String[] respuestas = {
        "Acomodados", "5", "Austria"
    };
    String[] radioR = {
        "Acomodados,Desacomodados,Separados",
        "5,6,3",
        "España,Inglaterra,Austria",};

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    } //PREGUNTAS 2
    String[] respuestas2 = {
        "Pintar los dibujos", "Nariz", "4"
    };
    String[] radioR2 = {
        "Pintar los dibujos,Dibujar árboles,Jugar",
        "Ojos,Nariz,Manos",
        "10,4,5",};

    public String getRespuesta2(int posicion) {
        return respuestas2[posicion];
    }

    public String[] setRespuestas2(int posicion) {
        String s1 = radioR2[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    } //PREGUNTAS 3
    String[] respuestas3 = {
        "Rojo", "Sabores", "Papá"
    };
    String[] radioR3 = {
        "Verde,Azul,Rojo",
        "Sabores,Sentimientos,Olores",
        "Mamá,Papá,Hermano",};

    public String getRespuesta3(int posicion) {
        return respuestas3[posicion];
    }

    public String[] setRespuestas3(int posicion) {
        String s1 = radioR3[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    } //PREGUNTAS 4
    String[] respuestas4 = {
        "Amarillo", "Oído", "Europa"
    };
    String[] radioR4 = {
        "Dorado,Amarillo,Morado",
        "Olfato,Gusto,Oído",
        "América,Asia,Europa"};

    public String getRespuesta4(int posicion) {
        return respuestas4[posicion];
    }

    public String[] setRespuestas4(int posicion) {
        String s1 = radioR4[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    } //PREGUNTAS 5
    String[] respuestas5 = {
        "Figuras", "Boca", "Sinfonía N°40"
    };
    String[] radioR5 = {
        "Paisajes,Figuras,Ropa",
        "Ojos,Boca,Nariz",
        "Sinfonía N°40,Sinfonía N°9,Sinfonía N°3",};

    public String getRespuesta5(int posicion) {
        return respuestas5[posicion];
    }

    public String[] setRespuestas5(int posicion) {
        String s1 = radioR5[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }
    String[] preguntas = {
        "¿Cómo duermen los lápices de colores?",
        "¿Cuántos sentidos tienen los seres humanos?",
        "¿Dónde nació Mozart?",};
    String[] preguntas2 = {
        "¿Qué van hacer con el cuaderno de clases?",
        "¿En qué órgano está el sentido del olfato?",
        "¿Desde qué edad Mozart demostró su don especial?",};
    String[] preguntas3 = {
        "¿Cuál es color favorito de Juan?",
        "¿Qué nos permite distinguir el sentido del gusto?",
        "¿Qué familiar de Mozart también era música?",};
    String[] preguntas4 = {
        "¿Cuál es el color favorito de Rosita?",
        "¿Con qué sentido podemos escuchar música?",
        "¿En qué contiene Mozart viajó para tocar frente a reyes?",};
    String[] preguntas5 = {
        "¿Qué les gusta pintar a Juan y Rosita?",
        "¿En qué órgano está el sentido del gusto?",
        "¿Cuál es la sinfonía más importante de Mozart?",};

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
        String[] a = new String[3];
        int i = 0;
        while (token.hasMoreTokens()) {
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        return a;
    }

    // Separar metodo 
    public String[] separar2(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);

        String[] a = new String[5];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }

        return a;
    }
    //ESTO ES DE LA ACTIVIDAD DE RECONOCER COLORES

    String[] respuestaColor = {
        "Rojo", "Azul", "Amarillo", "Verde", "Magenta"
    };

    String[] radioRC = {
        "Azul,Rojo,Blanco,Amarillo,Morado",
        "Negro,Naranja,Café,Rojo,Azul",
        "Rosado,Amarillo,Magenta,Celeste,Gris",
        "Salmón,Mostaza,Verde,Blanco,Morado",
        "Negro,Rojo,Celeste,Turquesa,Magenta",};

    public String getColor(int orden) {
        return respuestaColor[orden];
    }

    public String[] setRespuestaColor(int orden) {
        String s1 = radioRC[orden];
        String[] s2 = separar2(s1, ",");
        return s2;
    }

    //ESTO ES DE LA ACTIVIDAD DE RECONOCER SONIDO
    String[] respuestaSonido = {
        "Gallina", "Tren",
        "Viento", "Tambor", "Aplauso"
    };

    String[] radioRS = {
        "Vaca,Gallina,Elefante,Gato,Perro",
        "Avion,Moto,Carro,Tren,Bicicleta",
        "Viento,Rayo,Lluvia,Erupción,Incendio",
        "Tambor,Flauta,Guitarra,Violín,Maracas",
        "Grito,Beso,Estornudo,Lamentarse,Aplauso",};

    public String getSonido(int orden2) {
        return respuestaSonido[orden2];
    }

    public String[] setRespuestaSonido(int orden2) {
        String s1 = radioRS[orden2];
        String[] s2 = separar2(s1, ",");
        return s2;
    }

}
