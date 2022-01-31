package app.gui.actividades;

import app.gui.inicio.MainScreen;
import app.logic.Fecha;
import app.logic.ResultadoActividad;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import app.logic.auxiliar.Cuento;
import app.logic.auxiliar.LogicaJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ActividadComprension extends javax.swing.JFrame {

    // Atributos del timer
    Timer timer;
    final int[] sec = {0};

    /**
     * Creates new form actividadComprension
     */
    public ActividadComprension() {

        initComponents();

        // Timer
        timer = new Timer(1000, (ActionEvent e) -> {
            sec[0]++;
            System.out.println(sec[0]);
        });
        // Inicia el timer
        timer.start();

        cuentoArea.setText(m.getCuento(parte));
        question.setText(u.getPregunta(posicion));

        question.setText(u.getPregunta(posicion));
        question2.setText(u.getPregunta2(posicion));
        question3.setText(u.getPregunta3(posicion));
        question4.setText(u.getPregunta4(posicion));

        question5.setText(u.getPregunta5(posicion));

        String[] a = u.setRespuestas(posicion);
        String[] b = u.setRespuestas2(posicion);
        String[] c = u.setRespuestas3(posicion);
        String[] d = u.setRespuestas4(posicion);
        String[] e = u.setRespuestas5(posicion);

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
    int posicion = 0;
    int parte = 0;
    LogicaJuego u = new LogicaJuego();
    Cuento m = new Cuento();

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

    private void responderPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderPreguntasActionPerformed
        if (posicion == 1) {
            responderPreguntas.setEnabled(false);
            Terminar.setEnabled(true);
        }

        if (posicion < 3) {
            posicion++;
            parte++;
            cuentoArea.setText(m.getCuento(parte));
            question.setText(u.getPregunta(posicion));
            question2.setText(u.getPregunta2(posicion));
            question3.setText(u.getPregunta3(posicion));
            question4.setText(u.getPregunta4(posicion));

            question5.setText(u.getPregunta5(posicion));

            String[] a = u.setRespuestas(posicion);
            String[] b = u.setRespuestas2(posicion);
            String[] c = u.setRespuestas3(posicion);
            String[] d = u.setRespuestas4(posicion);
            String[] e = u.setRespuestas5(posicion);

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

        } else {
            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_responderPreguntasActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        select[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        // Detiene el timer
        timer.stop();
        int calificacion = 0;

        for (int i = 0; i < 3; i++) {
            if (select[i].equals(u.getRespuesta(i))) {
                calificacion = calificacion + 1;

            }
            if (select2[i].equals(u.getRespuesta2(i))) {
                calificacion = calificacion + 1;
            }

            if (select3[i].equals(u.getRespuesta3(i))) {
                calificacion = calificacion + 1;

            }
            if (select4[i].equals(u.getRespuesta4(i))) {
                calificacion = calificacion + 1;

            }
            if (select5[i].equals(u.getRespuesta5(i))) {
                calificacion = calificacion + 1;

            }
            System.out.println("" + calificacion);
        }

        calificacion = calificacion * 2 / 3;

        JOptionPane.showMessageDialog(null, "Tu calificación es " + calificacion + "/10");
        this.setVisible(false);
        // SQL insertar en la base de datos
        // Crea un registro enviando (String cedula, String nombre, int aciertos, float puntuacion, Fecha fecha, String etapa, int segundos)
        ResultadoActividad registro = new ResultadoActividad(MainScreen.userID, "Comprensión", calificacion, calificacion, new Fecha(), "Leve", sec[0]);
        // Invoca al metodo que registra los datos en la base de datos
        registro.registrarDataBase();
        //ResultadoActividad resultado = new ResultadoActividad(atributos);

    }//GEN-LAST:event_TerminarActionPerformed


    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        // TODO add your handling code here:
        select2[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc5ActionPerformed
        // TODO add your handling code here:
        select2[posicion] = opc5.getLabel();
    }//GEN-LAST:event_opc5ActionPerformed

    private void opc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc6ActionPerformed
        // TODO add your handling code here:
        select2[posicion] = opc6.getLabel();
    }//GEN-LAST:event_opc6ActionPerformed

    private void opc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc8ActionPerformed
        // TODO add your handling code here:
        select3[posicion] = opc8.getLabel();
    }//GEN-LAST:event_opc8ActionPerformed

    private void opc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc7ActionPerformed
        // TODO add your handling code here:
        select3[posicion] = opc7.getLabel();
    }//GEN-LAST:event_opc7ActionPerformed

    private void opc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc9ActionPerformed
        select3[posicion] = opc9.getLabel();
    }//GEN-LAST:event_opc9ActionPerformed

    private void opc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc10ActionPerformed
        select4[posicion] = opc10.getLabel();
    }//GEN-LAST:event_opc10ActionPerformed

    private void opc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc11ActionPerformed
        select4[posicion] = opc11.getLabel();
    }//GEN-LAST:event_opc11ActionPerformed

    private void opc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc12ActionPerformed
        select4[posicion] = opc12.getLabel();
    }//GEN-LAST:event_opc12ActionPerformed

    private void opc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc13ActionPerformed
        select5[posicion] = opc13.getLabel();
    }//GEN-LAST:event_opc13ActionPerformed

    private void opc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc14ActionPerformed
        select5[posicion] = opc14.getLabel();
    }//GEN-LAST:event_opc14ActionPerformed

    private void opc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc15ActionPerformed
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
