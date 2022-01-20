package app.gui.inicio;

import app.logic.Fecha;
import app.logic.Main;
import app.logic.Usuario;
import java.awt.HeadlessException;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asval
 */
public class EstatsPanel extends javax.swing.JPanel {

    Fecha actual;
    Usuario usuario = null;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Creates new form inicioPanel
     * @param usuario
     */
    public EstatsPanel(Usuario usuario) {
        initComponents();
        actual = new Fecha();
        this.usuario = usuario;
        setInformation();

        // SQL
        model = (DefaultTableModel) this.jTable1.getModel();

    }

    DefaultTableModel model;
   

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        seleccionarButton = new javax.swing.JButton();
        insertarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(81, 3, 113));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estadísticas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 640, -1));

        seleccionarButton.setBackground(new java.awt.Color(0, 102, 204));
        seleccionarButton.setText("Actualizar");
        seleccionarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seleccionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarButtonActionPerformed(evt);
            }
        });
        bg.add(seleccionarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 90, 50));

        insertarButton.setText("Insertar");
        insertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarButtonActionPerformed(evt);
            }
        });
        bg.add(insertarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/backgroundMain.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 660));
    }// </editor-fold>//GEN-END:initComponents


    private void seleccionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarButtonActionPerformed
        // SQL
        model.setRowCount(0);
        ResultSet result = null;

        try {
            PreparedStatement st = Main.getConnect().prepareStatement(" select * from actividad");
            result = st.executeQuery();

            while (result.next()) {
                model.addRow(new Object[]{result.getInt("id"), result.getString("nombre")});
            }

        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
    }//GEN-LAST:event_seleccionarButtonActionPerformed

    private void insertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarButtonActionPerformed
        // SQL insertar en la base de datos
        try {
            PreparedStatement st = Main.getConnect().prepareStatement("insert into actividad(id) values('0')");
            st.execute();
            JOptionPane.showMessageDialog(null, "Guardado");
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
    }//GEN-LAST:event_insertarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton insertarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton seleccionarButton;
    // End of variables declaration//GEN-END:variables


    public void setInformation() {
        try {
            jLabel2.setText("Estadísticas para " + usuario.getNombre());
        } catch (NullPointerException npe) {
            jLabel2.setText("Hola  usuario");
        } catch (Exception e) {
            jLabel2.setText("Problema al encontrar usuario");
        }
    }
}
