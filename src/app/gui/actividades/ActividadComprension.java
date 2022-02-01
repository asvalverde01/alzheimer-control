package app.gui.actividades;

import app.gui.inicio.MainScreen;
import app.logic.Fecha;
import app.logic.ResultadoActividad;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

import java.util.StringTokenizer;
import javax.swing.Timer;

public class ActividadComprension extends javax.swing.JFrame {

    /*
    *Atributos 
     */
    private int posicion = 0;
    private int parte = 0;

    // Atributos del timer
    private Timer timer;
    private final int[] sec = {0};

    /*
    *Arreglo de cadena de tres elementos con cada pregunta
     */
    private final String[] preguntas = {
        "¿Cómo duermen los lápices de colores?",
        "¿Cuántos sentidos tienen las personas?",
        "¿Dónde nació Mozart?",};
    private final String[] preguntas2 = {
        "¿Qué van a hacer con el cuaderno de clases?",
        "¿En qué órgano está el sentido del olfato?",
        "¿Desde qué edad Mozart demostró su don especial?",};
    private final String[] preguntas3 = {
        "¿Cuál es color favorito de Juan?",
        "¿Qué nos permite distinguir el sentido del gusto?",
        "¿A qué familiar de Mozart también le gustaba la música?",};
    private final String[] preguntas4 = {
        "¿Cuál es el color favorito de Rosita?",
        "¿Con qué sentido podemos escuchar música?",
        "¿En qué contiene Mozart viajó para tocar frente a reyes?",};
    private final String[] preguntas5 = {
        "¿Qué les gusta pintar a Juan y Rosita?",
        "¿En qué órgano está el sentido del gusto?",
        "¿Cuál es la sinfonía más importante de Mozart?",};

    /*
    * Método get para obtener string 
    *retorna la variable pregunta con su posición
     */
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

    /*
    *Arreglo de cadena de tres elementos con cada respuesta correcta
     */
    private final String[] respuestas = {
        "Acomodados", "5", "Austria"
    };

    private final String[] respuestas2 = {
        "Pintar los dibujos", "Nariz", "4"
    };

    private final String[] respuestas3 = {
        "Rojo", "Sabores", "Papá"
    };

    private final String[] respuestas4 = {
        "Amarillo", "Oído", "Europa"
    };

    private final String[] respuestas5 = {
        "Figuras", "Boca", "Sinfonía N°40"
    };

    /*
    *Arreglo de cadena de tres elementos con las opciones de respuesta
     */
    private final String[] radioR = {
        "Acomodados,Desacomodados,Separados",//se separa por una coma cada grupo de respuestas
        "5,6,3",
        "España,Inglaterra,Austria",};

    private final String[] radioR2 = {
        "Pintar los dibujos,Dibujar árboles,Jugar",
        "Ojos,Nariz,Manos",
        "10,4,5",};

    private final String[] radioR3 = {
        "Verde,Azul,Rojo",
        "Sabores,Sentimientos,Olores",
        "Mamá,Papá,Hermano",};

    private final String[] radioR4 = {
        "Dorado,Amarillo,Morado",
        "Olfato,Gusto,Oído",
        "América,Asia,Europa"};

    private final String[] radioR5 = {
        "Paisajes,Figuras,Ropa",
        "Ojos,Boca,Nariz",
        "Sinfonía N°40,Sinfonía N°9,Sinfonía N°3",};

    /*
    * Métodos get que reciben la posición, para retornar la respuesta y posición
    @param posicion
    return respuestas[posicion]
     */
    private String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String getRespuesta2(int posicion) {
        return respuestas2[posicion];
    }

    public String getRespuesta3(int posicion) {
        return respuestas3[posicion];
    }

    public String getRespuesta4(int posicion) {
        return respuestas4[posicion];
    }

    public String getRespuesta5(int posicion) {
        return respuestas5[posicion];
    }

    /*
    @param posicion
    
    Envia la posición de respuesta que queremos separar
     */
    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        return separar(s1, ",");//se separa por medio de una coma
    }

    public String[] setRespuestas2(int posicion) {
        String s1 = radioR2[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    public String[] setRespuestas3(int posicion) {
        String s1 = radioR3[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    public String[] setRespuestas4(int posicion) {
        String s1 = radioR4[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    public String[] setRespuestas5(int posicion) {
        String s1 = radioR5[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    /**
     *
     * @param cadena
     * @param separador
     * @return Separa la cadena por parámetros
     */
    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);
        String[] a = new String[3];//auxiliar para obtener los valores de acuerdo al número de respuestas
        int i = 0;//sirve para moverse en el arreglo
        while (token.hasMoreTokens()) {
            a[i] = token.nextToken(); // obtenemos el token
            i++;//incremento
        }
        return a;
    }
    
    
    /*
    Arrelo de cadena con los tres cuentos */

    private final String cuento[] = {
        "\n\tLos lápcies de colores"
        + "\n\nLos lápices de colores duermen acomodados. "
        + "Uno al lado del otro, con nombre y bien afilados. Por suerte, "
        + "llegó la hora de empezar a trabajar, pintemos muchos dibujos y"
        + " así el cuaderno alegrar. Juan prefiere los lápices de color "
        + "rojo y su hermana Rosita los prefiere de color amarillo, pero "
        + "juntos se unen para crear grandes obras de arte pintando figuras geométricas.  ",
        "\n      Los cinco sentidos del cuerpo humano"
        + "\n\nLos seres humanos tenemos cinco sentidos: vista, oído, olfato, gusto y tacto.\n"
        + "Tenemos sentido de la vista gracias a los ojos, que nos permiten ver todo lo que nos rodea y "
        + "distinguir sus formas, colores, tamaños, si están lejos o cerca…\n"
        + "A través del oído nos llegan los sonidos del exterior, como la música, el ruido de"
        + " los coches o el canto de los pájaros.\n"
        + "El olfato está en nuestra nariz; por ella se cuelan olores, a veces agradables como "
        + "el que desprende un bizcocho recién horneado, y otros olores apestosos"
        + " que nos resultan molestos.\n"
        + "En nuestra boca se encuentra el sentido del gusto, que nos permite distinguir si"
        + " un sabor es dulce, ácido, amargo, picante… y también si el alimento "
        + "nos gusta o no.\n"
        + "Por último, el sentido del tacto sirve para saber cómo son los objetos que tocamos"
        + " y percibir algunas de sus cualidades, como, por ejemplo, si son suaves,"
        + " rugosos, duros o blandos.",
        "\n\tMozart, el músico genial"
        + "\n\nMozart fue un músico extraordinario que nació en un país europeo llamado "
        + "Austria hace poco más de 250 años.\n"
        + "Desde muy chiquitín demostró un don especial para la música. Con solo cuatro años"
        + " ya era capaz de componer como si fuera un músico adulto y tocaba"
        + " instrumentos tan complicados como el teclado o el violín ¡Un auténtico niño prodigio!\n"
        + "Su padre, que también era músico, se esforzó por enseñarle todo lo que sabía. "
        + "Poco tiempo después lo llevó de viaje por Europa para que tocara ante "
        + "los reyes y gobernantes más importantes de la época. Todos se quedaron "
        + "asombrados al comprobar la genialidad del pequeño Mozart y le dedicaron "
        + "miles de aplausos y alabanzas.\n"
        + "Tras una infancia repleta de éxitos, Mozart se hizo mayor y siguió dedicándose "
        + "a su gran pasión: la música. Trabajó toda la vida sin descanso y gracias "
        + "a su enorme talento compuso grandes obras maestras.  Una de sus sinfonías"
        + " más importante es Sinfonía ° 40."
    };

    /*
    Recibimos una posición y retornamos la posición del cuento
    */
    public String getCuento(int parte) {
        return cuento[parte];
    }

    /**
     * Creates new form actividadComprension
     */
    public ActividadComprension() {

        initComponents();

        // Timer
        timer = new Timer(1000, (ActionEvent e) -> {
            sec[0]++;
        });
        // Inicia el timer
        timer.start();

        /*
    * Llamo a los métodos get que envían el cuento y las preguntas con las opciones de respuesta
         */
        /**
         * Asignar las opciones y al incio sea visible las preguntas, respuestas
         * y cuento
         */
        cuentoArea.setText(getCuento(parte));
        question.setText(getPregunta(posicion));

        question.setText(getPregunta(posicion));
        question2.setText(getPregunta2(posicion));
        question3.setText(getPregunta3(posicion));
        question4.setText(getPregunta4(posicion));

        question5.setText(getPregunta5(posicion));

        String[] a = setRespuestas(posicion);
        String[] b = setRespuestas2(posicion);
        String[] c = setRespuestas3(posicion);
        String[] d = setRespuestas4(posicion);
        String[] e = setRespuestas5(posicion);

        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();

        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);

        opc4.setText(b[0]);
        opc5.setText(b[1]);
        opc6.setText(b[2]);

        opc7.setText(c[0]);
        opc8.setText(c[1]);
        opc9.setText(c[2]);

        opc10.setText(d[0]);
        opc11.setText(d[1]);
        opc12.setText(d[2]);

        opc13.setText(e[0]);
        opc14.setText(e[1]);
        opc15.setText(e[2]);

        opc1.requestFocus();
        Terminar.setEnabled(false);
    }

    /*
    Se crean objetos y se incializan las posibles respuestas*/
    Object[] select = {"", "", "", "", ""};
    Object[] select2 = {"", "", "", "", ""};
    Object[] select3 = {"", "", "", "", ""};
    Object[] select4 = {"", "", "", "", ""};
    Object[] select5 = {"", "", "", "", ""};

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        responderPreguntas = new javax.swing.JButton();
        cuentoArea = new javax.swing.JTextArea();
        question4 = new javax.swing.JLabel();
        question2 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        question5 = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        question3 = new javax.swing.JLabel();
        Terminar = new javax.swing.JButton();
        opc14 = new javax.swing.JRadioButton();
        opc5 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        opc7 = new javax.swing.JRadioButton();
        opc8 = new javax.swing.JRadioButton();
        opc9 = new javax.swing.JRadioButton();
        opc11 = new javax.swing.JRadioButton();
        opc6 = new javax.swing.JRadioButton();
        opc12 = new javax.swing.JRadioButton();
        opc15 = new javax.swing.JRadioButton();
        opc13 = new javax.swing.JRadioButton();
        opc10 = new javax.swing.JRadioButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel2.setText("Comprensión lectora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 190, 50));

        responderPreguntas.setText("Siguiente >>");
        responderPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderPreguntasActionPerformed(evt);
            }
        });
        jPanel1.add(responderPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 110, 20));

        cuentoArea.setBackground(new java.awt.Color(204, 204, 255));
        cuentoArea.setColumns(20);
        cuentoArea.setLineWrap(true);
        cuentoArea.setRows(5);
        cuentoArea.setWrapStyleWord(true);
        jPanel1.add(cuentoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, 400));
        jPanel1.add(question4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 330, 20));
        jPanel1.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 330, 20));
        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 340, 20));
        jPanel1.add(question5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 330, 20));

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });
        jPanel1.add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });
        jPanel1.add(opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });
        jPanel1.add(opc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));
        jPanel1.add(question3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 330, 20));

        Terminar.setText("Finalizar ");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });
        jPanel1.add(Terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 100, 20));

        buttonGroup5.add(opc14);
        opc14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc14ActionPerformed(evt);
            }
        });
        jPanel1.add(opc14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        buttonGroup2.add(opc5);
        opc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc5ActionPerformed(evt);
            }
        });
        jPanel1.add(opc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        buttonGroup2.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });
        jPanel1.add(opc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        buttonGroup3.add(opc7);
        opc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc7ActionPerformed(evt);
            }
        });
        jPanel1.add(opc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        buttonGroup3.add(opc8);
        opc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc8ActionPerformed(evt);
            }
        });
        jPanel1.add(opc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        buttonGroup3.add(opc9);
        opc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc9ActionPerformed(evt);
            }
        });
        jPanel1.add(opc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        buttonGroup4.add(opc11);
        opc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc11ActionPerformed(evt);
            }
        });
        jPanel1.add(opc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        buttonGroup2.add(opc6);
        opc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc6ActionPerformed(evt);
            }
        });
        jPanel1.add(opc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        buttonGroup4.add(opc12);
        opc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc12ActionPerformed(evt);
            }
        });
        jPanel1.add(opc12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        buttonGroup5.add(opc15);
        opc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc15ActionPerformed(evt);
            }
        });
        jPanel1.add(opc15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        buttonGroup5.add(opc13);
        opc13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc13ActionPerformed(evt);
            }
        });
        jPanel1.add(opc13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        buttonGroup4.add(opc10);
        opc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc10ActionPerformed(evt);
            }
        });
        jPanel1.add(opc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        closeButton.setBackground(new java.awt.Color(255, 51, 51));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(0, 51, 102));
        closeButton.setText("X");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/actividadComprension.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 316));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * Acciones que suceden cuando selecciona el botón siguiente
     */

    private void responderPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderPreguntasActionPerformed

        /*
        Valida que el bótón terminar no esté disponible hasta la última pregunta
         */
        if (posicion == 1) {
            responderPreguntas.setEnabled(false);
            Terminar.setEnabled(true);
        }

        /*
        Valida que se acceda a los métodos por el número de veces que se puede
        dar siguiente.
        
         */
        if (posicion < 3) {
            posicion++;//aumenta la posición de las preguntas y respuestas
            parte++;//aumenta el valor de la varible del cuento

            /*
            *Invoca los métodos y recibe la posición previamente instanciada 
            * y asigna en el JFRAME el mensaje
             */
            cuentoArea.setText(getCuento(parte));
            question.setText(getPregunta(posicion));
            question2.setText(getPregunta2(posicion));
            question3.setText(getPregunta3(posicion));
            question4.setText(getPregunta4(posicion));

            question5.setText(getPregunta5(posicion));

            /*
            Obtenemos las respuestas
             */
            String[] a = setRespuestas(posicion);//Radio 1
            String[] b = setRespuestas2(posicion); //Radio 2
            String[] c = setRespuestas3(posicion); //Radio 3
            String[] d = setRespuestas4(posicion); //Radio 3
            String[] e = setRespuestas5(posicion); //Radio 3

            /*
            *Al momento de dar siguiente se eliminan las opciones seleccionadas
             */
            buttonGroup1.clearSelection();
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            buttonGroup5.clearSelection();

            /**
             * Asignamos el texto de las respuestas en los botones
             */
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);

            opc4.setText(b[0]);
            opc5.setText(b[1]);
            opc6.setText(b[2]);

            opc7.setText(c[0]);
            opc8.setText(c[1]);
            opc9.setText(c[2]);

            opc10.setText(d[0]);
            opc11.setText(d[1]);
            opc12.setText(d[2]);

            opc13.setText(e[0]);
            opc14.setText(e[1]);
            opc15.setText(e[2]);

            opc1.requestFocus();//Al avanzar la respuesta

        }


    }//GEN-LAST:event_responderPreguntasActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */

        select[posicion] = opc3.getLabel();


    }//GEN-LAST:event_opc3ActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    /*
    Botón que entrega el resultado
     */
    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        // Detiene el timer
        timer.stop();
        int calificacion = 0;

        for (int i = 0; i < 3; i++) { //Itera desde el inicio hasta el número de cuentos
            if (select[i].equals(getRespuesta(i))) {//compara la respuesta seleccionada y la respuesta correcta

                calificacion++;//incrementa la calificación

            }
            if (select2[i].equals(getRespuesta2(i))) {
                calificacion++;
            }

            if (select3[i].equals(getRespuesta3(i))) {

                calificacion++;

            }
            if (select4[i].equals(getRespuesta4(i))) {

                calificacion++;

            }
            if (select5[i].equals(getRespuesta5(i))) {
                calificacion++;

            }
        
        }

        calificacion = calificacion * 2 / 3;//Promedia la calificación

        JOptionPane.showMessageDialog(null, "Tu calificación es " + calificacion + "/10"); //Muestra la calificación
        this.setVisible(false);
        // SQL insertar en la base de datos
        // Crea un registro enviando (String cedula, String nombre, int aciertos, float puntuacion, Fecha fecha, String etapa, int segundos)
        ResultadoActividad registro = new ResultadoActividad(MainScreen.userID, "Comprensión", calificacion, new Fecha(), "Leve", sec[0]);
        // Invoca al metodo que registra los datos en la base de datos
        registro.registrarDataBase();
        //ResultadoActividad resultado = new ResultadoActividad(atributos);

    }//GEN-LAST:event_TerminarActionPerformed


    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        // TODO add your handling code here:
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select2[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc5ActionPerformed
        // TODO add your handling code here:
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select2[posicion] = opc5.getLabel();
    }//GEN-LAST:event_opc5ActionPerformed

    private void opc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc6ActionPerformed
        // TODO add your handling code here:
        select2[posicion] = opc6.getLabel();
    }//GEN-LAST:event_opc6ActionPerformed

    private void opc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc8ActionPerformed
        // TODO add your handling code here:
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select3[posicion] = opc8.getLabel();
    }//GEN-LAST:event_opc8ActionPerformed

    private void opc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc7ActionPerformed
        // TODO add your handling code here:
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select3[posicion] = opc7.getLabel();
    }//GEN-LAST:event_opc7ActionPerformed

    private void opc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc9ActionPerformed
        select3[posicion] = opc9.getLabel();
    }//GEN-LAST:event_opc9ActionPerformed

    private void opc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc10ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select4[posicion] = opc10.getLabel();
    }//GEN-LAST:event_opc10ActionPerformed

    private void opc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc11ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select4[posicion] = opc11.getLabel();
    }//GEN-LAST:event_opc11ActionPerformed

    private void opc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc12ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select4[posicion] = opc12.getLabel();
    }//GEN-LAST:event_opc12ActionPerformed

    private void opc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc13ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select5[posicion] = opc13.getLabel();
    }//GEN-LAST:event_opc13ActionPerformed

    private void opc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc14ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtenga la respuesta
         */
        select5[posicion] = opc14.getLabel();
    }//GEN-LAST:event_opc14ActionPerformed

    private void opc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc15ActionPerformed
        /*
       *Cuando se selecciona el botón en la posición obtiene la respuesta
         */
        select5[posicion] = opc15.getLabel();
    }//GEN-LAST:event_opc15ActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // Muestra un panel para elegir si terminar la actividad o no hacerlo
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Terminar actividad? El progreso no se guardará", "Terminar", JOptionPane.YES_NO_OPTION);
        // Si la opcion terminar es seleccionada
        if (JOptionPane.OK_OPTION == confirmado) {
            this.setVisible(false);
            // Detiene el timer
            timer.stop();
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActividadComprension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadComprension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadComprension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadComprension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActividadComprension().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Terminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea cuentoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc10;
    private javax.swing.JRadioButton opc11;
    private javax.swing.JRadioButton opc12;
    private javax.swing.JRadioButton opc13;
    private javax.swing.JRadioButton opc14;
    private javax.swing.JRadioButton opc15;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JRadioButton opc5;
    private javax.swing.JRadioButton opc6;
    private javax.swing.JRadioButton opc7;
    private javax.swing.JRadioButton opc8;
    private javax.swing.JRadioButton opc9;
    private javax.swing.JLabel question;
    private javax.swing.JLabel question2;
    private javax.swing.JLabel question3;
    private javax.swing.JLabel question4;
    private javax.swing.JLabel question5;
    private javax.swing.JButton responderPreguntas;
    // End of variables declaration//GEN-END:variables
}
