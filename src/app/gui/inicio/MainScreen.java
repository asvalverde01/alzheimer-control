package app.gui.inicio;

import app.gui.recomendaciones.RecomendacionesPanel;
import app.gui.actividades.ActividadesPanel;
import app.logic.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public final class MainScreen extends javax.swing.JFrame {

    private  Usuario usuario;
    public static String userID;
    // Paneles
    app.gui.inicio.InicioPanel pInicio = null;
    ActividadesPanel pActividades = null;
    RecomendacionesPanel pRecomendaciones = null;
    ResultadosPanel pResultados = null;
    ConfigPanel pConfig = null;
    AyudaPanel  pAyuda = null;

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
     *
     * @param usuario
     */
    public MainScreen(Usuario usuario) {
        this.usuario = usuario;
        initComponents();

        // Inicializa los paneles
        inicializarPaneles(usuario);

        //setInformation();
        this.setVisible(true);
        showPanel(pInicio);
        MainScreen.userID = usuario.getCedula();
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
        iconImg = new javax.swing.JLabel();
        actividadesButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        homeButton1 = new javax.swing.JButton();
        recButton = new javax.swing.JButton();
        statsButton = new javax.swing.JButton();
        configButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BrainUP (Beta)");
        setResizable(false);

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/home_house.png"))); // NOI18N
        content.add(iconImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 90));

        actividadesButton.setBackground(new java.awt.Color(153, 153, 255));
        actividadesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        actividadesButton.setForeground(new java.awt.Color(51, 51, 51));
        actividadesButton.setText("Actividades");
        actividadesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actividadesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actividadesButtonActionPerformed(evt);
            }
        });
        content.add(actividadesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 240, 50));

        helpButton.setBackground(new java.awt.Color(255, 204, 255));
        helpButton.setForeground(new java.awt.Color(51, 51, 51));
        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/chat_sms.png"))); // NOI18N
        helpButton.setText("Ayuda");
        helpButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        content.add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 190, 40));

        homeButton1.setBackground(new java.awt.Color(204, 0, 204));
        homeButton1.setFont(new java.awt.Font("Montserrat", 1, 25)); // NOI18N
        homeButton1.setForeground(new java.awt.Color(255, 255, 255));
        homeButton1.setText("Inicio");
        homeButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });
        content.add(homeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 240, 50));

        recButton.setBackground(new java.awt.Color(153, 153, 255));
        recButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        recButton.setForeground(new java.awt.Color(51, 51, 51));
        recButton.setText("Recomendaciones");
        recButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recButtonActionPerformed(evt);
            }
        });
        content.add(recButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 320, 240, 50));

        statsButton.setBackground(new java.awt.Color(153, 153, 255));
        statsButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        statsButton.setForeground(new java.awt.Color(51, 51, 51));
        statsButton.setText("Estadísticas");
        statsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        statsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsButtonActionPerformed(evt);
            }
        });
        content.add(statsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 240, 50));

        configButton.setBackground(new java.awt.Color(204, 153, 255));
        configButton.setForeground(new java.awt.Color(51, 51, 51));
        configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear_1.png"))); // NOI18N
        configButton.setText("Configurar");
        configButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        configButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configButtonActionPerformed(evt);
            }
        });
        content.add(configButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/sidebar.jpg"))); // NOI18N
        content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -360, 470, 1020));

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

    private void configButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/settings_cog_gear.png"));
        iconImg.setIcon(icono);
        colorButtons();
        showPanel(pConfig);
    }//GEN-LAST:event_configButtonActionPerformed

    private void recButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/news_paper.png"));
        iconImg.setIcon(icono);
        colorButtons();
        recButton.setBackground(new java.awt.Color(204, 0, 204));
        showPanel(pRecomendaciones);
    }//GEN-LAST:event_recButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        showPanel(pInicio);
        colorButtons();
        homeButton1.setBackground(new java.awt.Color(204, 0, 204));
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/home_house.png"));
        iconImg.setIcon(icono);
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/puzzle_component.png"));
        iconImg.setIcon(icono);
        colorButtons();
        showPanel(pAyuda);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void actividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadesButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/puzzle_component.png"));
        iconImg.setIcon(icono);
        colorButtons();
        actividadesButton.setBackground(new java.awt.Color(204, 0, 204));
        showPanel(pActividades);

    }//GEN-LAST:event_actividadesButtonActionPerformed

    private void statsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsButtonActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/imagen/icon/cup_reward.png"));
        iconImg.setIcon(icono);
        colorButtons();
        statsButton.setBackground(new java.awt.Color(204, 0, 204));
        showPanel(pResultados);
    }//GEN-LAST:event_statsButtonActionPerformed

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
            @Override
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
    private javax.swing.JLabel iconImg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton recButton;
    private javax.swing.JButton statsButton;
    // End of variables declaration//GEN-END:variables

    private void showPanel(JPanel p) {
        p.setSize(700, 660);
        contenido.removeAll();
        contenido.add(p, new AbsoluteConstraints(0, 0, -1, -1));
        contenido.revalidate();
        contenido.repaint();
    }

    private void inicializarPaneles(Usuario usuario) {
        pInicio = new InicioPanel(usuario);
        pActividades = new ActividadesPanel(usuario);
        pResultados = new ResultadosPanel(usuario);
        pRecomendaciones = new RecomendacionesPanel();
        pConfig = new ConfigPanel(usuario);
        pAyuda = new AyudaPanel();

        pInicio.setUsuario(usuario);
        pActividades.setUsuario(usuario);
        pResultados.setUsuario(usuario);
        pConfig.setUsuario(usuario);
    }

    private void colorButtons() {
        homeButton1.setBackground(new java.awt.Color(153, 153, 255));
        actividadesButton.setBackground(new java.awt.Color(153, 153, 255));
        recButton.setBackground(new java.awt.Color(153, 153, 255));
        statsButton.setBackground(new java.awt.Color(153, 153, 255));
    }
}
