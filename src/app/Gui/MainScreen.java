package app.Gui;

import app.logic.Usuario;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class MainScreen extends javax.swing.JFrame {

    Usuario usuario;

    private MainScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Creates new form MainScreen
     */
    public MainScreen(Usuario usuario) {
        initComponents();
        
        // Muestra un panel en el panel contenido
        InicioPanel pInicio = new InicioPanel();
        showPanel(pInicio);
        
        this.usuario = usuario;
        setInformation();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        actividadesButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        homeButton1 = new javax.swing.JButton();
        statsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        configButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actividadesButton.setBackground(new java.awt.Color(204, 153, 255));
        actividadesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        actividadesButton.setForeground(new java.awt.Color(51, 51, 51));
        actividadesButton.setText("Actividades");
        actividadesButton.setBorder(new javax.swing.border.MatteBorder(null));
        actividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actividadesButtonActionPerformed(evt);
            }
        });
        content.add(actividadesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 200, 40));

        helpButton.setBackground(new java.awt.Color(255, 204, 255));
        helpButton.setForeground(new java.awt.Color(51, 51, 51));
        helpButton.setText("Ayuda");
        helpButton.setBorder(new javax.swing.border.MatteBorder(null));
        helpButton.setBorderPainted(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        content.add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 190, 30));

        homeButton1.setBackground(new java.awt.Color(255, 102, 102));
        homeButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        homeButton1.setForeground(new java.awt.Color(51, 51, 51));
        homeButton1.setText("Inicio");
        homeButton1.setBorder(new javax.swing.border.MatteBorder(null));
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });
        content.add(homeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 200, 40));

        statsButton.setBackground(new java.awt.Color(204, 153, 255));
        statsButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        statsButton.setForeground(new java.awt.Color(51, 51, 51));
        statsButton.setText("Estadísticas");
        statsButton.setBorder(new javax.swing.border.MatteBorder(null));
        statsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsButtonActionPerformed(evt);
            }
        });
        content.add(statsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("... ");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        configButton.setBackground(new java.awt.Color(204, 204, 204));
        configButton.setForeground(new java.awt.Color(51, 51, 51));
        configButton.setText("Configurar");
        configButton.setBorder(new javax.swing.border.MatteBorder(null));
        configButton.setBorderPainted(false);
        configButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configButtonActionPerformed(evt);
            }
        });
        content.add(configButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Hola ");
        content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/sidebar.jpg"))); // NOI18N
        content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -360, 1170, 1020));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        content.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 700, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void actividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadesButtonActionPerformed
        ActividadesPanel pActividades = new ActividadesPanel(usuario);
        showPanel(pActividades);
        pActividades.setUsuario(usuario);

    }//GEN-LAST:event_actividadesButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        InicioPanel pInicio = new InicioPanel();
        showPanel(pInicio);
        pInicio.setUsuario(usuario);
        //pinicio.actualizarTiempo();
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void statsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statsButtonActionPerformed

    private void configButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actividadesButton;
    private javax.swing.JButton configButton;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel content;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton homeButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton statsButton;
    // End of variables declaration//GEN-END:variables

    public void setInformation() {
        try {
            jLabel1.setText(usuario.getNombre() + " :)");
        } catch (NullPointerException npe) {
            jLabel1.setText("Hola  usuario");
        } catch (Exception e) {
            jLabel1.setText("Problema al encontrar usuario");
        }
    }
    
    private void showPanel (JPanel p){
        p.setSize(700, 660);
        contenido.removeAll();
        contenido .add(p, new AbsoluteConstraints(0,0,-1,-1));
        contenido.revalidate();
        contenido.repaint();
    }
}
