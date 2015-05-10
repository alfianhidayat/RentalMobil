/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import rental.database.ConnectionDB;
import rental.database.Query;
import rental.util.Controller;

/**
 *
 * @author Alfian Hidayat
 */
public class FormPengembalian extends javax.swing.JPanel {

    private ConnectionDB cdb = new ConnectionDB();
    private Controller ctr = new Controller();
    private Query Query = new Query();
    private PreparedStatement preStmt = null;
    private ResultSet rst = null;
    private int Denda = 0;

    public FormPengembalian() {
        initComponents();
        setIDKembali();
        spTerlambat.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void setIDKembali() {
        String query = "SELECT COUNT(id_kembali) as no FROM tb_kembali";
        txtIDKembali.setText(ctr.autoKode(query, "P"));
    }

    private void setNull() {
        setIDKembali();
        txtIDFaktur.setText("");
        txtNamaMember.setText("");
        txtAlamat.setText("");
        txtTglMulai.setText("");
        txtBatasTgl.setText("");
        txtTglKembali.setText("");
        txtIDKendaraan.setText("");
        txtMerek.setText("");
        txtNopol.setText("");
        txtHarga.setText("");
        txtDenda.setText("0");
        txtDibayar.setText("");
        txtKembali.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTglKembali = new javax.swing.JLabel();
        btnCekID = new javax.swing.JButton();
        lblTerlambat = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDKendaraan = new javax.swing.JTextField();
        txtMerek = new javax.swing.JTextField();
        txtNopol = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        lblIDFaktur = new javax.swing.JLabel();
        lblBatasTgl = new javax.swing.JLabel();
        txtIDFaktur = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTglMulai = new javax.swing.JLabel();
        lblIDKembali = new javax.swing.JLabel();
        txtTglMulai = new javax.swing.JTextField();
        txtIDKembali = new javax.swing.JTextField();
        txtNamaMember = new javax.swing.JTextField();
        lblNamaMember = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lblDenda = new javax.swing.JLabel();
        lblDibayar = new javax.swing.JLabel();
        txtDibayar = new javax.swing.JTextField();
        lblKembali = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        txtBatasTgl = new javax.swing.JTextField();
        txtJam = new javax.swing.JLabel();
        spTerlambat = new javax.swing.JSpinner();
        btnClear = new javax.swing.JButton();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(475, 585));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeader.setText("Form Pengembalian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lblHeader)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        lblTglKembali.setText("Tanggal Kembali");

        btnCekID.setText("Cek ID");
        btnCekID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekIDActionPerformed(evt);
            }
        });

        lblTerlambat.setText("Terlambat");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Kendaraan "));

        jLabel1.setText("ID Kendaraan");

        jLabel2.setText("Merek Kendaraan");

        jLabel3.setText("Nomor Polisi");

        jLabel4.setText("Harga Sewa");

        txtIDKendaraan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIDKendaraan.setEnabled(false);

        txtMerek.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMerek.setEnabled(false);

        txtNopol.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNopol.setEnabled(false);

        txtHarga.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHarga.setEnabled(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDKendaraan)
                            .addComponent(txtMerek, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNopol)
                            .addComponent(txtHarga))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtIDKendaraan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtMerek, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNopol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtHarga, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblIDFaktur.setText("ID Faktur");

        lblBatasTgl.setText("Batas Tanggal Kembali");

        txtIDFaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFakturActionPerformed(evt);
            }
        });

        btnSave.setText("Simpan Transaksi");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTglMulai.setText("Tanggal Mulai");

        lblIDKembali.setText("ID Kembali");

        txtTglMulai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTglMulai.setEnabled(false);

        txtIDKembali.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIDKembali.setEnabled(false);

        txtNamaMember.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNamaMember.setEnabled(false);

        lblNamaMember.setText("Member");

        jLabel5.setText("Alamat");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        txtAlamat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAlamat.setEnabled(false);
        jScrollPane1.setViewportView(txtAlamat);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bayar"));

        lblDenda.setText("Denda");

        lblDibayar.setText("Dibayar");

        txtDibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDibayarActionPerformed(evt);
            }
        });

        lblKembali.setText("Kembali");

        txtKembali.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKembali.setEnabled(false);

        txtDenda.setText("0");
        txtDenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDenda.setEnabled(false);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDenda)
                    .addComponent(lblDibayar)
                    .addComponent(lblKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDibayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDenda)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDibayar)
                    .addComponent(txtDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKembali)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(lblDenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblDibayar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtDibayar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblKembali, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtKembali, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtDenda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtTglKembali.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTglKembali.setEnabled(false);

        txtBatasTgl.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBatasTgl.setEnabled(false);

        txtJam.setText("/ Jam");

        spTerlambat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTerlambatStateChanged(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTglMulai)
                            .addComponent(lblBatasTgl)
                            .addComponent(lblTglKembali)
                            .addComponent(lblTerlambat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTglMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTglKembali, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBatasTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spTerlambat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJam))))
                    .addComponent(lblNamaMember)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDKembali)
                            .addComponent(jLabel5))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIDFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCekID))))
                    .addComponent(lblIDFaktur)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDFaktur)
                    .addComponent(btnCekID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDKembali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamaMember)
                            .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTglMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTglMulai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBatasTgl)
                            .addComponent(txtBatasTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTglKembali)
                            .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTerlambat)
                            .addComponent(txtJam)
                            .addComponent(spTerlambat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            //INSERT INTO TB_KEMBALI
            preStmt = cdb.updateStmt(Query.INSERT_KEMBALI_QUERY);
            preStmt.setString(1, txtIDKembali.getText());
            preStmt.setString(2, txtIDFaktur.getText());
            preStmt.setString(3, txtTglKembali.getText());
            preStmt.setInt(4, Integer.parseInt(spTerlambat.getValue().toString()));
            preStmt.setInt(5, Denda);
            preStmt.executeUpdate();
            //UPDATE STATUS KENDARAAN
            preStmt = cdb.updateStmt(Query.UPDATE_STATUS_KENDARAAN_QUERY);
            preStmt.setString(1, "Tersedia");
            preStmt.setString(2, txtIDKendaraan.getText());
            preStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil disimpan !");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCekIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekIDActionPerformed
        txtIDFaktur.setText(txtIDFaktur.getText().toUpperCase());
//        rst = cdb.executeQuery("SELECT * FROM dataKembali WHERE no_faktur='" + txtIDFaktur.getText() + "'");
        preStmt = cdb.updateStmt(Query.SELECT_VIEW_DATAKEMABLI_QUERY);
        try {
            preStmt.setString(1, txtIDFaktur.getText());
            rst = preStmt.executeQuery();
            if (rst.next()) {
                txtNamaMember.setText(rst.getString(2));
                txtAlamat.setText(rst.getString(3));
                txtTglMulai.setText(rst.getString(4));
                txtBatasTgl.setText(rst.getString(5));
                txtIDKendaraan.setText(rst.getString(6));
                txtMerek.setText(rst.getString(7));
                txtNopol.setText(rst.getString(8));
                txtHarga.setText(rst.getString(9));
                txtTglKembali.setText(ctr.currentDate());
            } else {
                setNull();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCekIDActionPerformed

    private void spTerlambatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTerlambatStateChanged
        Denda = (Integer.parseInt(spTerlambat.getValue().toString()) * 20000);
        txtDenda.setText(ctr.toRupiahFormat(String.valueOf(Denda)));
    }//GEN-LAST:event_spTerlambatStateChanged

    private void txtDibayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDibayarActionPerformed
        if (Denda <= Integer.parseInt(txtDibayar.getText())) {
            int dibayar = Integer.parseInt(txtDibayar.getText());
            txtKembali.setText(ctr.toRupiahFormat(String.valueOf(dibayar - Denda)));
        } else {
            JOptionPane.showMessageDialog(null, "Uang Pembayaran Kurang !");
            txtDibayar.setText("");
        }
    }//GEN-LAST:event_txtDibayarActionPerformed

    private void txtIDFakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFakturActionPerformed
        btnCekIDActionPerformed(evt);
    }//GEN-LAST:event_txtIDFakturActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setNull();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekID;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblBatasTgl;
    private javax.swing.JLabel lblDenda;
    private javax.swing.JLabel lblDibayar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIDFaktur;
    private javax.swing.JLabel lblIDKembali;
    private javax.swing.JLabel lblKembali;
    private javax.swing.JLabel lblNamaMember;
    private javax.swing.JLabel lblTerlambat;
    private javax.swing.JLabel lblTglKembali;
    private javax.swing.JLabel lblTglMulai;
    private javax.swing.JSpinner spTerlambat;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtBatasTgl;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtDibayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIDFaktur;
    private javax.swing.JTextField txtIDKembali;
    private javax.swing.JTextField txtIDKendaraan;
    private javax.swing.JLabel txtJam;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtMerek;
    private javax.swing.JTextField txtNamaMember;
    private javax.swing.JTextField txtNopol;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglMulai;
    // End of variables declaration//GEN-END:variables
}
