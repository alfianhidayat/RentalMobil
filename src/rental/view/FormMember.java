/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.view;

import java.sql.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import rental.dbconnection.ConnectionDB;
import rental.util.Controller;

/**
 *
 * @author Alfian Hidayat
 */
public class FormMember extends javax.swing.JPanel {

    ConnectionDB cdb = new ConnectionDB();
    Controller ctr = new Controller();
    Statement stms = null;
    ResultSet rst = null;

    /**
     * Creates new form FormLogin
     */
    public FormMember() {
        initComponents();
        buttonGroup1.add(rdLakiLaki);
        buttonGroup1.add(rdPerempuan);
        rdLakiLaki.setSelected(true);
        viewTable();
        txtSearch.setText("Search");
        setIDMember();
    }

    public void viewTable() {
        rst = cdb.executeQuery("SELECT * FROM tb_member ORDER BY id_member ASC");
        tableMember.setModel(DbUtils.resultSetToTableModel(rst));
        ((DefaultTableModel) tableMember.getModel()).setColumnIdentifiers(new Object[]{"ID Member", "Nama", "No. Kartu Identitas", "Alamat", "No. HP", "Jenis Kelamin"});
    }
    
    public void setIDMember(){
        String sql = "SELECT COUNT(id_member) AS no FROM tb_member";
        txtIDMember.setText(ctr.autokode(sql, "C"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtNomorHP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        rdLakiLaki = new javax.swing.JRadioButton();
        lblIDMember = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        txtIDMember = new javax.swing.JTextField();
        lblNoIdentitas = new javax.swing.JLabel();
        rdPerempuan = new javax.swing.JRadioButton();
        lblAlamat = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        lblJenisKelamin = new javax.swing.JLabel();
        txtNoIdentitas = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        lblNomorHP = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelButton = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(475, 585));

        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMember);

        rdLakiLaki.setBackground(new java.awt.Color(255, 255, 255));
        rdLakiLaki.setText("Laki-Laki");

        lblIDMember.setText("ID Member");

        lblNama.setText("Nama");

        txtIDMember.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIDMember.setEnabled(false);

        lblNoIdentitas.setText("No. Kartu Identitas");

        rdPerempuan.setBackground(new java.awt.Color(255, 255, 255));
        rdPerempuan.setText("Perempuan");

        lblAlamat.setText("Alamat");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        lblJenisKelamin.setText("Jenis Kelamin");

        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        lblNomorHP.setText("Nomor Hp");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeader.setText("Data Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelButton.setBackground(new java.awt.Color(255, 255, 255));
        panelButton.setBorder(javax.swing.BorderFactory.createTitledBorder("Button"));
        panelButton.setToolTipText("");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap())
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblAlamat)
                                        .addGap(59, 59, 59))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblIDMember)
                                        .addComponent(lblNama)
                                        .addComponent(lblNoIdentitas)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNoIdentitas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDMember)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJenisKelamin)
                                    .addComponent(lblNomorHP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomorHP)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdLakiLaki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdPerempuan)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDMember))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNama)
                            .addComponent(lblJenisKelamin)
                            .addComponent(rdLakiLaki)
                            .addComponent(rdPerempuan))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoIdentitas)
                            .addComponent(lblNomorHP)
                            .addComponent(txtNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlamat))
                        .addGap(12, 12, 12)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        txtSearch.setText(null);
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().equals("")) {
            txtSearch.setText("Search");
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setIDMember();
        txtNama.setText("");
        txtNoIdentitas.setText("");
        txtAlamat.setText("");
        txtNomorHP.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMemberMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableMember.getModel();
        txtIDMember.setText(model.getValueAt(tableMember.getSelectedRow(), 0).toString());
        txtNama.setText(model.getValueAt(tableMember.getSelectedRow(), 1).toString());
        txtNoIdentitas.setText(model.getValueAt(tableMember.getSelectedRow(), 2).toString());
        txtAlamat.setText(model.getValueAt(tableMember.getSelectedRow(), 3).toString());
        txtNomorHP.setText(model.getValueAt(tableMember.getSelectedRow(), 4).toString());
        String jK = model.getValueAt(tableMember.getSelectedRow(), 5).toString();
        if (jK.equalsIgnoreCase("laki-laki")) {
            rdLakiLaki.setSelected(true);
        } else {
            rdPerempuan.setSelected(true);
        }
    }//GEN-LAST:event_tableMemberMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        rst = cdb.executeQuery("SELECT * FROM tb_member "
                + "where id_member LIKE '%" + txtSearch.getText() + "%' or "
                + "nama LIKE '%" + txtSearch.getText() + "%' or "
                + "noktp LIKE '%" + txtSearch.getText() + "%' or "
                + "alamat LIKE '%" + txtSearch.getText() + "%' or "
                + "nohp LIKE '%" + txtSearch.getText() + "%' or "
                + "jeniskelamin LIKE '%" + txtSearch.getText() + "%' "
                + "ORDER BY id_member ASC");
        tableMember.setModel(DbUtils.resultSetToTableModel(rst));
        ((DefaultTableModel) tableMember.getModel()).setColumnIdentifiers(new Object[]{"ID Member", "Nama", "No. Kartu Identitas", "Alamat", "No. HP", "Jenis Kelamin"});
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (tableMember.getSelectedRow() == -1) {
                if (tableMember.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Tabel Kosong !!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data Member !!");
                }
            } else {
                cdb.executeUpdate("UPDATE tb_member SET "
                        + "nama = '" + txtNama.getText() + "', "
                        + "noktp = '" + txtNoIdentitas.getText() + "', "
                        + "alamat = '" + txtAlamat.getText() + "', "
                        + "nohp = '" + txtNomorHP.getText() + "', "
                        + "jeniskelamin = '" + getSelectedButtonText(buttonGroup1) + "' "
                        + "WHERE id_member = '" + txtIDMember.getText() + "'");
                JOptionPane.showMessageDialog(null, "Data berhasil di Update !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal di Update !");
        }
        viewTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (tableMember.getSelectedRow() == -1) {
                if (tableMember.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Tabel Kosong !!");
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data Member !!");
                }
            } else {
                cdb.executeUpdate("DELETE FROM tb_member where id_member='" + txtIDMember.getText() + "'");
                viewTable();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            cdb.executeUpdate("INSERT INTO tb_member values "
                    + "('" + txtIDMember.getText() + "',"
                    + "'" + txtNama.getText() + "',"
                    + "'" + txtNoIdentitas.getText() + "',"
                    + "'" + txtAlamat.getText() + "',"
                    + "'" + txtNomorHP.getText() + "',"
                    + "'" + getSelectedButtonText(buttonGroup1) + "')");
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        viewTable();
    }//GEN-LAST:event_btnAddActionPerformed
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIDMember;
    private javax.swing.JLabel lblJenisKelamin;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoIdentitas;
    private javax.swing.JLabel lblNomorHP;
    private javax.swing.JPanel panelButton;
    private javax.swing.JRadioButton rdLakiLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tableMember;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtIDMember;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoIdentitas;
    private javax.swing.JTextField txtNomorHP;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
