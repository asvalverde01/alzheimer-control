package app.gui.inicio;

import app.logic.Fecha;
import app.logic.Main;
import app.logic.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class ConfigPanel extends javax.swing.JPanel {

    Fecha actual;
    Usuario usuario = null;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Creates new form inicioPanel
     *
     * @param usuario
     */
    public ConfigPanel(Usuario usuario) {
        initComponents();
        actual = new Fecha();
        actualizarFecha(actual);
        this.usuario = usuario;
        setInformation();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        fechaLabel = new javax.swing.JLabel();
        bienvenidaLabel = new javax.swing.JLabel();
        estadoSQL = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        avatarLogo = new javax.swing.JLabel();
        borrarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        edadLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(81, 3, 113));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setText("El día de hoy es -- de -- del año --");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(fechaLabel)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(fechaLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 60));

        bienvenidaLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        bienvenidaLabel.setForeground(new java.awt.Color(102, 0, 153));
        bienvenidaLabel.setText("Configuraciones");
        bg.add(bienvenidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        estadoSQL.setBackground(new java.awt.Color(0, 0, 0));
        estadoSQL.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        estadoSQL.setForeground(new java.awt.Color(0, 153, 0));
        estadoSQL.setText("---");
        bg.add(estadoSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        estadoLabel.setBackground(new java.awt.Color(0, 0, 0));
        estadoLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        estadoLabel.setForeground(new java.awt.Color(0, 0, 0));
        estadoLabel.setText("Estado de la conexión:");
        bg.add(estadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        edadLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel.setText("Borrar todos los datos guardados");
        bg.add(edadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 570, 20));
        bg.add(avatarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 70));

        borrarButton.setBackground(new java.awt.Color(102, 0, 51));
        borrarButton.setForeground(new java.awt.Color(204, 204, 204));
        borrarButton.setText("Borrar Datos");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        bg.add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 570, 20));

        edadLabel1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel1.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel1.setText("Config");
        bg.add(edadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void borrarButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Borrar todos los datos?", "Borrar", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.OK_OPTION == confirmado) {
            Main.eliminarDataBase();
            JOptionPane.showMessageDialog(null, "Datos borrados correctamente", "Borrar Datos", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_borrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatarLogo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JButton borrarButton;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel edadLabel1;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel estadoSQL;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void actualizarFecha(Fecha actual) {
        fechaLabel.setText("Hoy es " + actual.getDia() + " de " + actual.getMesString() + " del año " + actual.getAnio() + " ");
    }

    public void setInformation() {
        try {
            if (!(Main.isConectado())) {
                estadoSQL.setText("desconectado");
                estadoSQL.setForeground(new java.awt.Color(255, 51, 51));
            } else {
                estadoSQL.setText("conectado");
                estadoSQL.setForeground(new java.awt.Color(0, 153, 0));
            }
        } catch (NullPointerException npe) {
            bienvenidaLabel.setText("Hola  usuario");
        } catch (Exception e) {
            bienvenidaLabel.setText("Problema al encontrar usuario");
        }
        try {
            String direccion = "/imagen/icon/avatar/avatar" + usuario.getAvatar() + ".png";
            Icon icono = new ImageIcon(getClass().getResource(direccion));
            avatarLogo.setIcon(icono);
        } catch (NullPointerException npe) {
            bienvenidaLabel.setText("Problema al encontrar usuario");
        }

    }
}
