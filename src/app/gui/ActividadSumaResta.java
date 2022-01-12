/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.Gui;

import app.logic.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuari
 */
public class ActividadSumaResta extends javax.swing.JFrame {

    String respuesta1;
    int respuestaOp;
    int puntaje;
    int contador;

    public int getRespuestaOp() {
        return respuestaOp;
    }

    public void setRespuestaOp(int respuestaOp) {
        this.respuestaOp = respuestaOp;
    }

    public ActividadSumaResta() {
        initComponents();
        int respuesta = generarNuevaOp();
        setRespuestaOp(respuesta);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mostrarMensaje = new javax.swing.JTextArea();
        ingreseSuma1 = new javax.swing.JTextField();
        comprobar1 = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1478");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 50, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("4541");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("+");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("-------");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 80, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ingrese su respuesta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        mostrarMensaje.setBackground(new java.awt.Color(255, 255, 51));
        mostrarMensaje.setColumns(20);
        mostrarMensaje.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        mostrarMensaje.setRows(5);
        jPanel1.add(mostrarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 30));

        ingreseSuma1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ingreseSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 110, 30));

        comprobar1.setBackground(new java.awt.Color(51, 204, 255));
        comprobar1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        comprobar1.setForeground(new java.awt.Color(0, 0, 0));
        comprobar1.setText("Comprobar");
        comprobar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobar1ActionPerformed(evt);
            }
        });
        jPanel1.add(comprobar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, 40));

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
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/actividadSumayResta.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //comprobar1ActionPerformed(true);

    private void comprobar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobar1ActionPerformed
        if (ingreseSuma1.getText().equals(String.valueOf(getRespuestaOp()))) {
            mostrarMensaje.setText(String.format("Correcto :)"));
            puntaje++;
        } else {
            mostrarMensaje.setText(String.format("Incorrecto :("));
        }
        int respuesta = generarNuevaOp();
        setRespuestaOp(respuesta);
        contador++;
        ingreseSuma1.setText("");
        if (contador == 10) {
            JOptionPane.showMessageDialog(null, "Tu calificación es " + puntaje + "/10");
            this.setVisible(false);

        }
    }//GEN-LAST:event_comprobar1ActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private int generarNuevaOp() {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        if (num1 > 5) {
            jLabel4.setText("-");
            if (num1 > num2) {
                jLabel2.setText("" + num1);
                jLabel3.setText("" + num2);
                return num1 - num2;
            } else {
                jLabel3.setText("" + num1);
                jLabel2.setText("" + num2);
                return num2 - num1;
            }
        } else {
            jLabel2.setText("" + num1);
            jLabel3.setText("" + num2);
            jLabel4.setText("+");
        }
        return num1 + num2;
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
            java.util.logging.Logger.getLogger(ActividadSumaResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadSumaResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadSumaResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadSumaResta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActividadSumaResta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton comprobar1;
    private javax.swing.JTextField ingreseSuma1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea mostrarMensaje;
    // End of variables declaration//GEN-END:variables
}
