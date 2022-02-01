package app.gui.inicio;

import app.logic.Fecha;
import app.logic.Main;
import app.logic.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class ConfigPanel extends javax.swing.JPanel {

    private Fecha actual;
    private Usuario usuario = null;

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
        usuarioLabel.setText(usuario.toString());

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
        borrarUsuarioButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        usuarioLabel = new javax.swing.JLabel();
        usuarioLabel1 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        modificarField = new javax.swing.JTextField();
        filtrarBOX = new javax.swing.JComboBox<>();
        modificarButton = new javax.swing.JButton();
        edadLabel1 = new javax.swing.JLabel();
        edadLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        edadLabel2 = new javax.swing.JLabel();
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
        bg.add(estadoSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        estadoLabel.setBackground(new java.awt.Color(0, 0, 0));
        estadoLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        estadoLabel.setForeground(new java.awt.Color(51, 0, 102));
        estadoLabel.setText("Estado de la conexión con base de datos:");
        bg.add(estadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        edadLabel.setBackground(new java.awt.Color(51, 51, 51));
        edadLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel.setText("Borrar mis datos (usuario)");
        bg.add(edadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 570, 20));
        bg.add(avatarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 70));

        borrarButton.setBackground(new java.awt.Color(102, 0, 51));
        borrarButton.setForeground(new java.awt.Color(204, 204, 204));
        borrarButton.setText("Borrar Base de datos");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        bg.add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 210, 30));

        borrarUsuarioButton.setBackground(new java.awt.Color(102, 0, 51));
        borrarUsuarioButton.setForeground(new java.awt.Color(204, 204, 204));
        borrarUsuarioButton.setText("Borrar Usuario");
        borrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarUsuarioButtonActionPerformed(evt);
            }
        });
        bg.add(borrarUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 570, 20));

        usuarioLabel.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(51, 51, 51));
        usuarioLabel.setText("----");
        bg.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        usuarioLabel1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        usuarioLabel1.setForeground(new java.awt.Color(0, 0, 153));
        usuarioLabel1.setText("Cedula          |     Nombre     |     Apellido     |    Edad  |    Etapa");
        bg.add(usuarioLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        resultadoLabel.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        resultadoLabel.setForeground(new java.awt.Color(204, 0, 51));
        bg.add(resultadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, 30));

        modificarField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bg.add(modificarField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        filtrarBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Etapa" }));
        bg.add(filtrarBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 160, 30));

        modificarButton.setText("Modificar");
        modificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });
        bg.add(modificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 100, 30));

        edadLabel1.setBackground(new java.awt.Color(51, 51, 51));
        edadLabel1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel1.setForeground(new java.awt.Color(153, 102, 0));
        edadLabel1.setText("Administrador");
        bg.add(edadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        edadLabel3.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel3.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel3.setText("Modificar usuario");
        bg.add(edadLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 30));

        jSeparator3.setBackground(new java.awt.Color(81, 3, 23));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 570, 20));

        edadLabel2.setBackground(new java.awt.Color(51, 51, 51));
        edadLabel2.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        edadLabel2.setForeground(new java.awt.Color(51, 51, 51));
        edadLabel2.setText("Borrar todos los datos guardados");
        bg.add(edadLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void borrarButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        // Solicita que se ingrese la clave admin para continuar
        String clave;
        try {
            clave = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador", "Clave", JOptionPane.QUESTION_MESSAGE);
            if (clave.equals("admin")) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Borrar todos los datos?", "Borrar", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.OK_OPTION == confirmado) {
                    Main.eliminarDataBase();
                    JOptionPane.showMessageDialog(null, "Datos borrados correctamente", "Borrar Datos", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta", "Clave", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
            System.out.println("No se ingreso nada");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }//GEN-LAST:event_borrarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        String filtro = filtrarBOX.getSelectedItem().toString();
        String nuevoValor = modificarField.getText();
        // Validar que el campo no este vacio
        if (nuevoValor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Verifica que se hayan ingresado únicamente letras
            if (nuevoValor.matches("[a-zA-Z]+")) {
                boolean resultado = usuario.modificarInfoUsuario(filtro, nuevoValor);
                if (resultado) {
                    // Si filtro es etapa entonces se termina el programa
                    if (filtro.equals("Etapa")) {
                        JOptionPane.showMessageDialog(null, "Etapa modificada correctamente, abra nuevamente el programa", "Etapa", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    resultadoLabel.setText("Guardado");
                    resultadoLabel.setForeground(new java.awt.Color(0, 102, 51));
                } else {
                    modificarField.setText("");
                }
            } else {
                resultadoLabel.setText("Error al guardar");
                resultadoLabel.setForeground(new java.awt.Color(204, 0, 51));
                JOptionPane.showMessageDialog(null, "Solo se permiten letras", "Error", JOptionPane.ERROR_MESSAGE);
                modificarField.setText("");

            }
        }
        // Actualiza los valores
        usuarioLabel.setText(usuario.toString());
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void borrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarUsuarioButtonActionPerformed
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Borrar todos los datos del usuario?", "Borrar", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.OK_OPTION == confirmado) {
            if (usuario.eliminarUsuarioDataBase()) {
                JOptionPane.showMessageDialog(null, "Datos borrados correctamente", "Borrar Datos", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido algún error", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_borrarUsuarioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatarLogo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenidaLabel;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton borrarUsuarioButton;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel edadLabel1;
    private javax.swing.JLabel edadLabel2;
    private javax.swing.JLabel edadLabel3;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel estadoSQL;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JComboBox<String> filtrarBOX;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField modificarField;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JLabel usuarioLabel1;
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
