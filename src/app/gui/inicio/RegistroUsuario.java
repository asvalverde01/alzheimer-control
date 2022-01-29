package app.gui.inicio;

import app.logic.Fecha;
import app.logic.Usuario;

import javax.swing.*;

public class RegistroUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    boolean avatarSeleccionado = false;
    int avatar;
    // Variables declaration - do not modify                     
    private javax.swing.JSpinner anioSpinner;
    private javax.swing.JSpinner diaSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JComboBox<String> mesCombo;

    /**
     * Creates new form RegistroUsuario
     *
     * @param usuario
     */
    public RegistroUsuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        anioSpinner.setValue(1900);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        //mesCombo.addItem("emerp");
    }

    private RegistroUsuario() {
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
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

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        diaSpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        mesCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        anioSpinner = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setOpaque(true);
        jTextField2.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 340, 30));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setOpaque(true);
        jTextField3.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 340, 30));

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setOpaque(true);
        jTextField4.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 340, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 340, 10));

        jButton1.setBackground(new java.awt.Color(102, 0, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONTINUAR");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 220, 40));

        diaSpinner.setValue(1);
        jPanel2.add(diaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 90, 30));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Año");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
        mesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesComboActionPerformed(evt);
            }
        });
        jPanel2.add(mesCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, 30));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Seleccione un avatar");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        jPanel2.add(anioSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 100, 30));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Mes");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 20));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Día");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 340, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Cédula");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Apellido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro de Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 280, 40));

        jToggleButton4.setBackground(new java.awt.Color(204, 153, 255));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar4.png"))); // NOI18N
        jToggleButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jToggleButton3.setBackground(new java.awt.Color(204, 153, 255));
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar3.png"))); // NOI18N
        jToggleButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar2.png"))); // NOI18N
        jToggleButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/avatar/avatar1.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean correcto = false;
        boolean correctoCampos = false;
        // String fechaNacimiento = jTextField2.getText();
        String nombre = jTextField2.getText();
        String apellido = jTextField3.getText();

        usuario.setNombre(jTextField2.getText());
        usuario.setApellido(jTextField3.getText());
        int dia = (Integer) diaSpinner.getValue();
        String mes = mesCombo.getSelectedItem().toString();
        int anio = (Integer) anioSpinner.getValue();
        String cedula = jTextField4.getText();

        boolean valid = true;


        // Se verifica que se ingresen datos
        // Verifica que nombre solamente contenga letras
        if (nombre.length() <= 0 && apellido.length() <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese su nombre y apellido");
            valid = false;
        } else {
            if (nombre.length() > 0) {
                if (nombre.matches("[a-zA-Z]+")) {
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras");
                    valid = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
                valid = false;
            }
            if (apellido.length() > 0 && valid) {
                if (apellido.matches("[a-zA-Z]+")) {
                    valid = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El apellido solo puede contener letras");
                    valid = false;
                }
            } else {
                if (apellido.length() <= 0) {
                    JOptionPane.showMessageDialog(null, "El apellido no puede estar vacío");
                    valid = false;
                }

            }
        }

        // Verifica que la cedula sea valida solamente si los campos anteriormente se validaron
        if (valid) {
            valid = validarCedula(cedula);
        }


        if (nombre.length() > 1 && apellido.length() > 1) {
            correctoCampos = true;
        }

        if (dia < 1 || dia > 31 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "Día inválido");

            correctoCampos = false;
        }

        if (anio >= 1900 || anio <= 2022) {
            correctoCampos = true;
        }

        if (dia >= 1 && dia <= 31) {
            correctoCampos = true;
        }
        if (anio < 1900 || anio > 2022 && correctoCampos) {
            JOptionPane.showMessageDialog(null, "Año inválido");
            correctoCampos = false;
        }

        // Intenta inicializar la fecha con los datos ingresados
        try {
            Fecha nacimiento = new Fecha();
            nacimiento.setDia(dia);
            nacimiento.setMes(nacimiento.setMesString(mes));
            nacimiento.setAnio(anio);
            usuario.setFechaNacimiento(nacimiento);
            correcto = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique los datos en fecha");
            correcto = false;
        }

        // Al final cuando el avatar ya ha sido seleccionado, se procede a continuar a la seleccion de la etapa
        if (avatarSeleccionado && valid && correctoCampos && correcto) {
            usuario.setAvatar(avatar);
            usuario.setCedula(cedula);
            SeleccionEtapa etapa = new SeleccionEtapa(usuario);
            etapa.setVisible(true);
            etapa.setLocationRelativeTo(null);
            this.setVisible(false);
        } else {
            if (valid) {
                JOptionPane.showMessageDialog(null, "Seleccione un avatar");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void mesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesComboActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (!(avatarSeleccionado)) {
            deshabilitarBotones();
            jToggleButton1.setEnabled(true);
            avatar = 1;
            avatarSeleccionado = true;
        } else {
            habilitarBotones();
            avatar = 0;
            avatarSeleccionado = false;
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if (!(avatarSeleccionado)) {
            deshabilitarBotones();
            jToggleButton2.setEnabled(true);
            avatar = 2;
            avatarSeleccionado = true;
        } else {
            habilitarBotones();
            avatar = 0;
            avatarSeleccionado = false;

        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (!(avatarSeleccionado)) {
            deshabilitarBotones();
            jToggleButton3.setEnabled(true);
            avatar = 3;
            avatarSeleccionado = true;
        } else {
            habilitarBotones();
            avatar = 0;
            avatarSeleccionado = false;

        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        if (!(avatarSeleccionado)) {
            deshabilitarBotones();
            jToggleButton4.setEnabled(true);
            avatar = 4;
            avatarSeleccionado = true;
        } else {
            habilitarBotones();
            avatar = 0;
            avatarSeleccionado = false;

        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void deshabilitarBotones() {
        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
    }

    private void habilitarBotones() {
        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
    }
    // End of variables declaration                   

    private boolean validarCedula(String cedula) {
        // Verifica que la cedula sea valida
        // Verifica que solamente hayan digitos en el string cedula
        System.out.println("Cedula " + cedula);
        if (cedula.matches("[0-9]+")) {
            // Verifica que el string tenga 10 digitos
            if (cedula.length() == 10) {
                // Verifica que la suma de los 2 primeros digitos esten entre 1 y 24
                if (Integer.parseInt(cedula.substring(0, 2)) >= 1 && Integer.parseInt(cedula.substring(0, 2)) <= 24) {
                    //Verifica que el tercer digito esten entre 0 y 6
                    if (Integer.parseInt(cedula.substring(2, 3)) >= 0 && Integer.parseInt(cedula.substring(2, 3)) <= 6) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cédula inválida");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cédula fuera de rango");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Faltan dígitos en cédula");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cédula inválida. Ingrese solamente dígitos");
            return false;
        }
        return false;
    }

}
