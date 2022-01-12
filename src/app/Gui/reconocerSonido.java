/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.Gui;

import app.logic.Usuario;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;
import java.util.Objects;

/**
 * @author HP
 */
public class ReconocerSonido extends javax.swing.JFrame {

    Usuario u = new Usuario();
    Object[] selectSonido = {"", "", "", "", ""};
    int orden2 = 0;
    int cont = 0;
    int cont1 = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton finalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JButton listo;
    private javax.swing.JButton opci1;
    private javax.swing.JButton opci2;
    private javax.swing.JButton opci3;
    private javax.swing.JButton opci4;
    private javax.swing.JButton opci5;
    private javax.swing.JButton play;

    /**
     * Creates new form reconocerSonido
     */
    public ReconocerSonido() {
        initComponents();

        Icon icono0 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/play.jpg")));

        play.setIcon(icono0);

        Icon icono1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Vaca.jpg")));

        opci1.setIcon(icono1);

        Icon icono2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Gallina.jpg")));

        opci2.setIcon(icono2);

        Icon icono3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Elefante.jpg")));

        opci3.setIcon(icono3);

        Icon icono4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Gato.jpg")));

        opci4.setIcon(icono4);

        Icon icono5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Perro.jpg")));

        opci5.setIcon(icono5);

        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(""));
        sonido.play();

        String[] s = u.setRespuestaSonido(orden2);

        opci1.setText(s[0]);
        opci2.setText(s[1]);
        opci3.setText(s[2]);
        opci4.setText(s[3]);
        opci5.setText(s[4]);

    }

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
            java.util.logging.Logger.getLogger(ReconocerSonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReconocerSonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReconocerSonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReconocerSonido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReconocerSonido().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opci3 = new javax.swing.JButton();
        opci5 = new javax.swing.JButton();
        opci1 = new javax.swing.JButton();
        opci4 = new javax.swing.JButton();
        opci2 = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        play = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opci3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opci3ActionPerformed(evt);
            }
        });
        jPanel1.add(opci3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 150, 100));

        opci5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opci5ActionPerformed(evt);
            }
        });
        jPanel1.add(opci5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 150, 100));

        opci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opci1ActionPerformed(evt);
            }
        });
        jPanel1.add(opci1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 100));

        opci4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opci4ActionPerformed(evt);
            }
        });
        jPanel1.add(opci4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 150, 100));

        opci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opci2ActionPerformed(evt);
            }
        });
        jPanel1.add(opci2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 150, 100));

        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        jPanel1.add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 410, 100, -1));

        listo.setText("Continuar");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel1.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 110, -1));

        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        jPanel1.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, 60));

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
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, 50));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/reconocerSonido.jpg"))); // NOI18N
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opci3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opci3ActionPerformed
        selectSonido[orden2] = opci3.getLabel();
        opci2.setEnabled(false);
        opci4.setEnabled(false);
        opci1.setEnabled(false);
        opci5.setEnabled(false);
    }//GEN-LAST:event_opci3ActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        int calificacion = 0;
        for (int i = 0; i < 5; i++) {
            if (selectSonido[i].equals(u.getSonido(i))) {

                calificacion = calificacion + 1;

            }
            System.out.println("" + calificacion);
        }

        calificacion = calificacion * 2;

        JOptionPane.showMessageDialog(null, "Tu calificación es " + calificacion + "/10");

        // Se guardan los resultados
        /*
        ResultadoActividad resultado = new ResultadoActividad();
        resltado.setPuntuacion(puntuacion);
        resultado.setTiempo(tiempo);
        */

    }//GEN-LAST:event_finalizarActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed

        cont++;

        if (cont == 1) {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/gallinaAudio.wav"));
            sonido.play();
            play.setEnabled(false);

        }

        if (cont == 2) {

            AudioClip sonido2;
            sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/trenAudio.wav"));
            sonido2.play();
            play.setEnabled(false);
        }

        if (cont == 3) {

            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/vientoAudio.wav"));
            sonido.play();
            play.setEnabled(false);
        }

        if (cont == 4) {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/tamboresAudio.wav"));
            sonido.play();

            play.setEnabled(false);

        }

        if (cont == 5) {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/aplausoAudio.wav"));
            sonido.play();
            play.setEnabled(false);

        }

    }//GEN-LAST:event_playActionPerformed

    private void opci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opci1ActionPerformed
        selectSonido[orden2] = opci1.getLabel();

        opci2.setEnabled(false);
        opci3.setEnabled(false);
        opci4.setEnabled(false);
        opci5.setEnabled(false);
    }//GEN-LAST:event_opci1ActionPerformed

    private void opci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opci2ActionPerformed
        selectSonido[orden2] = opci2.getLabel();

        opci5.setEnabled(false);
        opci3.setEnabled(false);
        opci4.setEnabled(false);
        opci1.setEnabled(false);
    }//GEN-LAST:event_opci2ActionPerformed

    private void opci4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opci4ActionPerformed
        selectSonido[orden2] = opci4.getLabel();
        opci2.setEnabled(false);
        opci3.setEnabled(false);
        opci1.setEnabled(false);
        opci5.setEnabled(false);
    }//GEN-LAST:event_opci4ActionPerformed

    private void opci5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opci5ActionPerformed
        selectSonido[orden2] = opci5.getLabel();

        opci2.setEnabled(false);
        opci3.setEnabled(false);
        opci4.setEnabled(false);
        opci1.setEnabled(false);
    }//GEN-LAST:event_opci5ActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed

        play.setEnabled(true);
        cont1++;
        if (orden2 == 3) {
            listo.setEnabled(false);
            finalizar.setEnabled(true);

        }

        if (cont1 == 0) {

            Icon icono1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Vaca.jpg")));

            opci1.setIcon(icono1);

            Icon icono2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Gato.jpg")));

            opci2.setIcon(icono2);

            Icon icono3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Elefante.jpg")));

            opci3.setIcon(icono3);

            Icon icono4 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Gallina.jpg")));

            opci4.setIcon(icono4);

            Icon icono5 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Perro.jpg")));

            opci5.setIcon(icono5);

        }

        if (cont1 == 1) {
            Icon icono6 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Avion.jpg")));

            opci1.setIcon(icono6);

            Icon icono7 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Moto.jpg")));

            opci2.setIcon(icono7);

            Icon icono8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Carro.jpg")));

            opci3.setIcon(icono8);

            Icon icono9 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Tren.jpg")));

            opci4.setIcon(icono9);

            Icon icono10 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Bicicleta.jpg")));

            opci5.setIcon(icono10);

        }

        if (cont1 == 2) {
            Icon icono11 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Viento.jpg")));

            opci1.setIcon(icono11);

            Icon icono12 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Rayo.jpg")));

            opci2.setIcon(icono12);

            Icon icono13 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Lluvia.jpg")));

            opci3.setIcon(icono13);

            Icon icono14 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Erupcion.jpg")));

            opci4.setIcon(icono14);

            Icon icono15 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Incendio.jpg")));

            opci5.setIcon(icono15);

        }

        if (cont1 == 3) {
            Icon icono11 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Tambor.jpg")));

            opci1.setIcon(icono11);

            Icon icono12 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Flauta.jpg")));

            opci2.setIcon(icono12);

            Icon icono13 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Guitarra.jpg")));

            opci3.setIcon(icono13);

            Icon icono14 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Violin.jpg")));

            opci4.setIcon(icono14);

            Icon icono15 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Maracas.jpg")));

            opci5.setIcon(icono15);

        }

        if (cont1 == 4) {
            Icon icono11 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Grito.jpg")));

            opci1.setIcon(icono11);

            Icon icono12 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Beso.jpg")));

            opci2.setIcon(icono12);

            Icon icono13 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Estornudo.jpg")));

            opci3.setIcon(icono13);

            Icon icono14 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/Lamentarse.jpg")));

            opci4.setIcon(icono14);

            Icon icono15 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagen/aplauso.jpg")));

            opci5.setIcon(icono15);

        }
        opci1.setEnabled(true);
        opci2.setEnabled(true);
        opci3.setEnabled(true);
        opci4.setEnabled(true);
        opci5.setEnabled(true);

        if (orden2 < 5) {

            orden2++;
            String[] s = u.setRespuestaSonido(orden2);

            opci1.setText(s[0]);
            opci2.setText(s[1]);
            opci3.setText(s[2]);
            opci4.setText(s[3]);
            opci5.setText(s[4]);

        } else {
            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_listoActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    // End of variables declaration//GEN-END:variables
}
