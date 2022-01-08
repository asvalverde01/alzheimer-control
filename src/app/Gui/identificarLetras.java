package app.Gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import app.logic.Usuario;
import javax.swing.JOptionPane;

public class identificarLetras extends javax.swing.JFrame {

    String letra1;
    String letra2;
    String letra3;
    String n1 = "m";
    String n2 = "c";
    String n3 = "g";
    String n4 = "f";
    String n5 = "a";

    public identificarLetras() {
        initComponents();
        this.setLocationRelativeTo(null);
        Icon icono1 = new ImageIcon(getClass().getResource("/Imagen/letraMariposa.png"));
        imagen.setIcon(icono1);

    }
    Icon icono = new ImageIcon();
    Usuario u = new Usuario();
    int lol = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        listo = new javax.swing.JButton();
        ingreseLetra = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("¿Con qué letra empieza la siguiente imagen?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        listo.setBackground(new java.awt.Color(102, 0, 102));
        listo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        listo.setForeground(new java.awt.Color(255, 255, 255));
        listo.setText("listo");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });
        jPanel1.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, -1));

        ingreseLetra.setBackground(new java.awt.Color(204, 204, 255));
        ingreseLetra.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jPanel1.add(ingreseLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 50));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/letras.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int cont = 0;
    int calificacion = 0;
    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed

        cont++;

        letra1 = ingreseLetra.getText();

        if (cont == 0) {
            Icon icono1 = new ImageIcon(getClass().getResource("/Imagen/letraMariposa.png"));
            imagen.setIcon(icono1);
            

        }
        if (cont == 1) {
            Icon icono2 = new ImageIcon(getClass().getResource("/Imagen/letraCine.png"));
            imagen.setIcon(icono2);

        }

        if (cont == 2) {
            Icon icono3 = new ImageIcon(getClass().getResource("/Imagen/letraGato.png"));
            imagen.setIcon(icono3);
        }

        if (cont == 3) {
            Icon icono4 = new ImageIcon(getClass().getResource("/Imagen/letraFlor.png"));
            imagen.setIcon(icono4);

        }

        if (cont == 4) {
            Icon icono5 = new ImageIcon(getClass().getResource("/Imagen/letraAvion.png"));
            imagen.setIcon(icono5);

        }

        if (n1.equals(letra1) && (cont == 1)) {


            ingreseLetra.setText("");
            calificacion++;

        } else {
            ingreseLetra.setText("");

        }

        if (n2.equals(letra1) && (cont == 2)) {


            ingreseLetra.setText("");
            calificacion++;

        }

        if (n3.equals(letra1) && (cont == 3)) {


            ingreseLetra.setText("");
            calificacion++;
        }

        if (n4.equals(letra1) && (cont == 4)) {


            ingreseLetra.setText("");
            calificacion++;
        }

        if (n5.equals(letra1) && (cont == 5)) {


            ingreseLetra.setText("");
            calificacion++;
        }

        if (cont == 5) {
            listo.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Tu calificación es " + calificacion*2 + "/10");

        }

    }//GEN-LAST:event_listoActionPerformed

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
            java.util.logging.Logger.getLogger(identificarLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(identificarLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(identificarLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(identificarLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new identificarLetras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JTextField ingreseLetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listo;
    // End of variables declaration//GEN-END:variables
}
