package app.gui.inicio;

import app.logic.Main;
import app.logic.Usuario;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SeleccionEtapa extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    // Atributo de lista
    private static List<Usuario> usuarios;

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;

    /**
     * Creates new form RegistroUsuario
     *
     * @param usuario
     */
    public SeleccionEtapa(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    private SeleccionEtapa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            java.util.logging.Logger.getLogger(SeleccionEtapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionEtapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionEtapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionEtapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SeleccionEtapa().setVisible(true);
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

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Etapa");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 710, 10));

        jScrollPane3.setBackground(new java.awt.Color(204, 153, 255));

        jTextArea3.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea3.setRows(5);
        jTextArea3.setText("La persona pierde la capacidad de \nresponder a su entorno y de controlar\nlos movimientos. Aunque pueden decir \npalabras o frases, es posible que\nocurran cambios significativos en la\n personalidad.\n");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 320, 250));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("AVANZADA");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 330, 70));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("MODERADA");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 320, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("LEVE");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 320, 70));

        jScrollPane1.setBackground(new java.awt.Color(204, 153, 255));

        jTextArea1.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Es posible que note que la persona \nconfunda palabras, se frustra o enoja, o\nactúa de forma inesperada, \npuede dificultar la expresión de \npensamientos.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 320, 250));

        jScrollPane2.setBackground(new java.awt.Color(204, 153, 255));

        jTextArea2.setBackground(new java.awt.Color(153, 153, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText("En la etapa temprana del Alzheimer, \nla persona puede desenvolverse de forma\n independiente. \nEs posible que pueda conducir, trabajar y \nparticipar de actividades sociales. \nA pesar de esto, la persona puede sentir \nque tiene episodios de pérdida de memoria\nque incluyen olvidarse palabras familiares \nola ubicación de objetos cotidianos.");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 320, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/goback.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, 90));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 255));
        jLabel3.setText("Seleccione la etapa de la enfermedad que considere");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundEtapa.jpg"))); // NOI18N
        jLabel1.setText("Registro de Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1330, 620));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("SDFFFFFFFFFFFFFFFFFFF");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainScreen main;

        if (guardarUsuario(2)) {
            usuario.setEtapa(2);
            Main.setConectado(Main.conectarBaseDatos());
            main = new MainScreen(usuario);
            this.setVisible(false);
            main.setVisible(true);
            main.setUsuario(usuario);
            main.setLocationRelativeTo(null);

            System.out.println("Guardado correctamente");
        } else {
            System.out.println("Ha ocurrido algun error");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainScreen main;
        if (guardarUsuario(1)) {
            usuario.setEtapa(1);
            Main.setConectado(Main.conectarBaseDatos());
            main = new MainScreen(usuario);
            this.setVisible(false);
            main.setVisible(true);
            main.setUsuario(usuario);
            main.setLocationRelativeTo(null);
            Main.setConectado(Main.conectarBaseDatos());
            System.out.println("Guardado correctamente");
        } else {
            System.out.println("Ha ocurrido algun error");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        RegistroUsuario registro = new RegistroUsuario(usuarios);
        this.setVisible(false);
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainScreen main;
        if (guardarUsuario(0)) {
            usuario.setEtapa(0);
            Main.setConectado(Main.conectarBaseDatos());
            main = new MainScreen(usuario);
            this.setVisible(false);
            main.setVisible(true);
            main.setUsuario(usuario);
            main.setLocationRelativeTo(null);

            System.out.println("Guardado correctamente");
        } else {
            System.out.println("Ha ocurrido algun error");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean guardarUsuario(int etapa) {
        boolean conectado = Main.crearBaseDatos();
        if (conectado) {
            // En el la tabla usuario de la base de datos registra los datos
            try {
                String nombre = usuario.getNombre();
                String apellido = usuario.getApellido();
                int avatar = usuario.getAvatar();
                int dia = usuario.getFechaNacimiento().getDia();
                int mes = usuario.getFechaNacimiento().getMes();
                int anio = usuario.getFechaNacimiento().getAnio();
                String cedula = usuario.getCedula();

                String SQL = "INSERT INTO usuario (cedula, nombre, apellido, avatar, dianac, mesnac, anionac, etapa) VALUES ('" + cedula + "','" + nombre + "', '" + apellido + "', '" + avatar + "', '" + dia + "', '" + mes + "', '" + anio + "', '" + etapa + "')";
                PreparedStatement st = Main.getConnect().prepareStatement(SQL);
                st.executeUpdate();
                return true;

            } catch (SQLException ex) {
                // En caso de que no se pueda guardar el usuario elimina la base de datos creada
                Main.eliminarDataBase();
                JOptionPane.showMessageDialog(null, "Error, intente nuevamente");

                // Termina el programa
                System.exit(0);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
        return false;
    }
    // End of variables declaration
}
