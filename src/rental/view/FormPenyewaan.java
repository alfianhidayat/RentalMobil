/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import rental.database.ConnectionDB;
import rental.database.Query;
import rental.util.Controller;

/**
 *
 * @author Alfian Hidayat
 */
public class FormPenyewaan extends javax.swing.JPanel {

    ConnectionDB cdb = new ConnectionDB();
    Query Query = new Query();
    Controller ctr = new Controller();
    PreparedStatement preStmt = null;
    Statement stms = null;
    ResultSet rst = null;
    int biayaSewa = 0;
    int totalBiaya = 0;
    int kembalian = 0;

    /**
     * Creates new form FormLogin
     */
    public FormPenyewaan() {
        initComponents();
        buttonGroup1.add(rdMobil);
        buttonGroup1.add(rdMotor);
        rdMobil.setSelected(true);
        txtSearch.setText("Search");
        spLamaSewa.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
        viewTable();
        setComboKendaraan();
        setComboMember();
        setIDFaktur();
    }

    private void setIDFaktur() {
        String query = Query.SELECT_COUNT_PENYEWAAN_QUERY;
        txtFaktur.setText(ctr.autoKode(query, "F"));
    }

    public void setComboKendaraan() {
        cbIDKendaraan.removeAllItems();
        cbIDKendaraan.addItem("Pilih");
        try {
            preStmt = cdb.updateStmt(Query.SELECT_KENDARAAN_AVAILABLE_QUERY);
            preStmt.setString(1, ctr.getSelectedButtonText(buttonGroup1));
            rst = preStmt.executeQuery();
            while (rst.next()) {
                cbIDKendaraan.addItem(rst.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void setComboMember() {
        cbIDMember.removeAllItems();
        cbIDMember.addItem("Pilih");
        try {
            rst = cdb.executeQuery(Query.SELECT_MEMBER_QUERY);
            while (rst.next()) {
                cbIDMember.addItem(rst.getString(1));
            }
            rst.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void viewTable() {
        try {
            rst = cdb.executeQuery(Query.SELECT_PENYEWAAN_JOIN_QUERY);
            tablePenyewaan.setModel(DbUtils.resultSetToTableModel(rst));
            ((DefaultTableModel) tablePenyewaan.getModel()).setColumnIdentifiers(new Object[]{"Nomor Faktur", "Nama Member", "Merek Kendaraan", "Tgl Sewa", "Tgl Kembali", "Total Bayar"});
            if (rst.next()) {
                System.out.println(rst.getInt(7) + 8);
            }
            rst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenyewaan = new javax.swing.JTable();
        rdMobil = new javax.swing.JRadioButton();
        lblIDMember = new javax.swing.JLabel();
        lblNamaMember = new javax.swing.JLabel();
        rdMotor = new javax.swing.JRadioButton();
        txtNamaMember = new javax.swing.JTextField();
        lblJenisKendaraan = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cbIDMember = new javax.swing.JComboBox();
        lblIDKendaraan = new javax.swing.JLabel();
        cbIDKendaraan = new javax.swing.JComboBox();
        lblMerekKendaraan = new javax.swing.JLabel();
        txtMerekKendaraan = new javax.swing.JTextField();
        lblNopol = new javax.swing.JLabel();
        txtNopol = new javax.swing.JTextField();
        lblHargaSewa = new javax.swing.JLabel();
        txtHargaSewa = new javax.swing.JTextField();
        lblLamaSewa = new javax.swing.JLabel();
        spLamaSewa = new javax.swing.JSpinner();
        lblTglSewa = new javax.swing.JLabel();
        txtTglSewa = new javax.swing.JTextField();
        lblTglKembali = new javax.swing.JLabel();
        txtTglKembali = new javax.swing.JTextField();
        panelBiaya = new javax.swing.JPanel();
        lblTotalBayar = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JTextField();
        lblDibayar = new javax.swing.JLabel();
        txtDibayar = new javax.swing.JTextField();
        lblKembali = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        lblIDFaktur = new javax.swing.JLabel();
        txtFaktur = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPerHari = new javax.swing.JLabel();
        lblHari = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(475, 585));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tablePenyewaan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePenyewaan);

        rdMobil.setBackground(new java.awt.Color(255, 255, 255));
        rdMobil.setText("Mobil");
        rdMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdMobilMouseClicked(evt);
            }
        });

        lblIDMember.setText("ID Member");

        lblNamaMember.setText("Nama");

        rdMotor.setBackground(new java.awt.Color(255, 255, 255));
        rdMotor.setText("Motor");
        rdMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdMotorMouseClicked(evt);
            }
        });

        txtNamaMember.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNamaMember.setEnabled(false);

        lblJenisKendaraan.setText("Jenis Kendaraan");

        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });

        cbIDMember.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIDMemberItemStateChanged(evt);
            }
        });

        lblIDKendaraan.setText("ID Kendaraan");

        cbIDKendaraan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbIDKendaraanItemStateChanged(evt);
            }
        });

        lblMerekKendaraan.setText("Merek Kendaraan");

        txtMerekKendaraan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMerekKendaraan.setEnabled(false);

        lblNopol.setText("Nomor Plat");

        txtNopol.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNopol.setEnabled(false);

        lblHargaSewa.setText("Harga Sewa");

        txtHargaSewa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHargaSewa.setEnabled(false);

        lblLamaSewa.setText("Lama Sewa");

        spLamaSewa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spLamaSewaStateChanged(evt);
            }
        });

        lblTglSewa.setText("Tanggal Sewa");

        txtTglSewa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTglSewa.setEnabled(false);

        lblTglKembali.setText("Tanggal Kembali");

        txtTglKembali.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTglKembali.setEnabled(false);

        panelBiaya.setBackground(new java.awt.Color(255, 255, 255));
        panelBiaya.setBorder(javax.swing.BorderFactory.createTitledBorder("Biaya"));

        lblTotalBayar.setText("Total Bayar");

        txtTotalBayar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotalBayar.setEnabled(false);

        lblDibayar.setText("Dibayar");

        txtDibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDibayarActionPerformed(evt);
            }
        });

        lblKembali.setText("Kembali");

        txtKembali.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKembali.setEnabled(false);

        javax.swing.GroupLayout panelBiayaLayout = new javax.swing.GroupLayout(panelBiaya);
        panelBiaya.setLayout(panelBiayaLayout);
        panelBiayaLayout.setHorizontalGroup(
            panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBiayaLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalBayar)
                    .addComponent(lblDibayar)
                    .addComponent(lblKembali))
                .addGap(18, 18, 18)
                .addGroup(panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalBayar)
                    .addComponent(txtDibayar)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        panelBiayaLayout.setVerticalGroup(
            panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBiayaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalBayar)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDibayar)
                    .addComponent(txtDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBiayaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKembali))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblIDFaktur.setText("ID Faktur");

        txtFaktur.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFaktur.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeader.setText("Form Penyewaan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(192, 192, 192))
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

        lblPerHari.setText("/hari");

        lblHari.setText("hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIDMember)
                                    .addComponent(lblNamaMember)
                                    .addComponent(lblJenisKendaraan)
                                    .addComponent(lblMerekKendaraan)
                                    .addComponent(lblNopol)
                                    .addComponent(lblHargaSewa)
                                    .addComponent(lblLamaSewa)
                                    .addComponent(lblIDKendaraan))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdMobil)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdMotor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHari))
                                    .addComponent(cbIDKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaMember, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtMerekKendaraan)
                                    .addComponent(txtNopol)
                                    .addComponent(cbIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPerHari))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIDFaktur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTglSewa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTglSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTglKembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIDFaktur)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDMember)
                            .addComponent(cbIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamaMember))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJenisKendaraan)
                            .addComponent(rdMobil)
                            .addComponent(rdMotor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDKendaraan)
                            .addComponent(cbIDKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMerekKendaraan)
                            .addComponent(txtMerekKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNopol)
                            .addComponent(txtNopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHargaSewa)
                            .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPerHari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLamaSewa)
                            .addComponent(spLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHari)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTglSewa)
                            .addComponent(txtTglSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTglKembali)
                            .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(panelBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnClear)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cbIDKendaraanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIDKendaraanItemStateChanged
//        rst = cdb.executeQuery("SELECT no_plat, merek, harga FROM tb_kendaraan WHERE id_kendaraan = '" + cbIDKendaraan.getSelectedItem() + "'");
        try {
            if (cbIDKendaraan.getItemCount() > 0) {
                preStmt = cdb.updateStmt(Query.SELECT_KENDARAAN_SELECTED_QUERY);
                preStmt.setString(1, cbIDKendaraan.getSelectedItem().toString());
                rst = preStmt.executeQuery();
                if (rst.next()) {
                    txtNopol.setText(rst.getString(2));
                    txtMerekKendaraan.setText(rst.getString(3));
                    biayaSewa = (rst.getInt(5));
                    txtHargaSewa.setText(ctr.toRupiahFormat(rst.getString(5)));
                } else {
                    txtNopol.setText("");
                    txtMerekKendaraan.setText("");
                    txtHargaSewa.setText("");
                }
            }
            rst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cbIDKendaraanItemStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setIDFaktur();
        setComboKendaraan();
        setComboMember();
        cbIDMember.setSelectedIndex(0);
        txtNamaMember.setText("");
        cbIDKendaraan.setSelectedIndex(0);
        txtMerekKendaraan.setText("");
        txtNopol.setText("");
        txtHargaSewa.setText("");
        spLamaSewa.setValue(0);
        txtTglSewa.setText("");
        txtTglKembali.setText("");
        txtTotalBayar.setText("");
        txtDibayar.setText("");
        txtKembali.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void cbIDMemberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbIDMemberItemStateChanged
//        rst = cdb.executeQuery("SELECT nama FROM tb_member WHERE id_member = '" + cbIDMember.getSelectedItem() + "'");
        preStmt = cdb.updateStmt(Query.SELECT_MEMBER_SELECTED_QUERY);
        try {
            if (cbIDMember.getItemCount() > 0) {
                preStmt.setString(1, cbIDMember.getSelectedItem().toString());
                rst = preStmt.executeQuery();
                if (rst.next()) {
                    txtNamaMember.setText(rst.getString(2));
                } else {
                    txtNamaMember.setText("");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbIDMemberItemStateChanged

    private void spLamaSewaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spLamaSewaStateChanged
        if (cbIDMember.getSelectedItem().equals("Pilih") & cbIDKendaraan.getSelectedItem().equals("Pilih")) {
            if (!spLamaSewa.getValue().equals(0)) {
                spLamaSewa.setValue(0);
                JOptionPane.showMessageDialog(null, "Pilih ID Member dan ID Kendaraan terlebih dahulu !");
            }
        } else {
            txtTglSewa.setText(ctr.currentDate());
            int lama = Integer.parseInt(spLamaSewa.getValue().toString());
            txtTglKembali.setText(ctr.addDate(lama));
            totalBiaya = Integer.parseInt(String.valueOf(lama * biayaSewa));
            txtTotalBayar.setText(ctr.toRupiahFormat(String.valueOf(lama * biayaSewa)));
        }
    }//GEN-LAST:event_spLamaSewaStateChanged

    private void txtDibayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDibayarActionPerformed
        if (totalBiaya <= Integer.parseInt(txtDibayar.getText())) {
            int totalbayar = totalBiaya;
            int dibayar = Integer.parseInt(txtDibayar.getText());
            txtKembali.setText(ctr.toRupiahFormat(String.valueOf(dibayar - totalbayar)));
        } else {
            JOptionPane.showMessageDialog(null, "Uang Pembayaran Kurang !");
            txtDibayar.setText("");
        }
    }//GEN-LAST:event_txtDibayarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // INSERT DATA TO TB_PENYEWAAN
            preStmt = cdb.updateStmt(Query.INSERT_PENYEWAAN_QUERY);
            preStmt.setString(1, txtFaktur.getText());
            preStmt.setString(2, cbIDMember.getSelectedItem().toString());
            preStmt.setString(3, cbIDKendaraan.getSelectedItem().toString());
            preStmt.setInt(4, Integer.parseInt(spLamaSewa.getValue().toString()));
            preStmt.setString(5, txtTglSewa.getText());
            preStmt.setString(6, txtTglKembali.getText());
            preStmt.setInt(7, totalBiaya);
            preStmt.executeUpdate();
            
            //UPDATE STATUS KENDARAAN
            preStmt = cdb.updateStmt(Query.UPDATE_STATUS_KENDARAAN_QUERY);
            preStmt.setString(1, "Sewa");
            preStmt.setString(2, cbIDKendaraan.getSelectedItem().toString());
            preStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ?");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        viewTable();
        btnClearActionPerformed(evt);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void rdMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMobilMouseClicked
        setComboKendaraan();
    }//GEN-LAST:event_rdMobilMouseClicked

    private void rdMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdMotorMouseClicked
        setComboKendaraan();
    }//GEN-LAST:event_rdMotorMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbIDKendaraan;
    private javax.swing.JComboBox cbIDMember;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblDibayar;
    private javax.swing.JLabel lblHargaSewa;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIDFaktur;
    private javax.swing.JLabel lblIDKendaraan;
    private javax.swing.JLabel lblIDMember;
    private javax.swing.JLabel lblJenisKendaraan;
    private javax.swing.JLabel lblKembali;
    private javax.swing.JLabel lblLamaSewa;
    private javax.swing.JLabel lblMerekKendaraan;
    private javax.swing.JLabel lblNamaMember;
    private javax.swing.JLabel lblNopol;
    private javax.swing.JLabel lblPerHari;
    private javax.swing.JLabel lblTglKembali;
    private javax.swing.JLabel lblTglSewa;
    private javax.swing.JLabel lblTotalBayar;
    private javax.swing.JPanel panelBiaya;
    private javax.swing.JRadioButton rdMobil;
    private javax.swing.JRadioButton rdMotor;
    private javax.swing.JSpinner spLamaSewa;
    private javax.swing.JTable tablePenyewaan;
    private javax.swing.JTextField txtDibayar;
    private javax.swing.JTextField txtFaktur;
    private javax.swing.JTextField txtHargaSewa;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtMerekKendaraan;
    private javax.swing.JTextField txtNamaMember;
    private javax.swing.JTextField txtNopol;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglSewa;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
