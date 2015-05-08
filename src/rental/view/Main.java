/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.view;

import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import rental.dbconnection.ConnectionDB;

/**
 *
 * @author Alfian Hidayat
 */
public class Main extends javax.swing.JFrame {

    CardLayout layout = new CardLayout();
    FormMember panelMember;
    FormKendaraan panelKendaraan;
    FormPenyewaan panelPenyewaan;
    MenuUtama panelMenu;
    FormPengembalian panelPengembalian;

    /**
     * Creates new form Main
     */
    
    public Main() {
        setTitle("Aplikasi Elektronik Rental");
        initComponents();
        setLocationRelativeTo(null);
        panelMember = new FormMember();
        panelKendaraan = new FormKendaraan();
        panelPenyewaan = new FormPenyewaan();
        panelMenu = new MenuUtama();
        panelPengembalian = new FormPengembalian();
        getContentPane().setLayout(layout);
        getContentPane().add(panelMember);
        getContentPane().add(panelKendaraan);
        getContentPane().add(panelPenyewaan);
        getContentPane().add(panelMenu);
        getContentPane().add(panelPengembalian);
        setPaneNull();
        panelMember.setVisible(true);
    }

    public void setPaneNull() {
        panelMember.setVisible(false);
        panelKendaraan.setVisible(false);
        panelPenyewaan.setVisible(false);
        panelMenu.setVisible(false);
        panelPengembalian.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuForm = new javax.swing.JMenu();
        meuFormMember = new javax.swing.JMenuItem();
        menuFormKendaraan = new javax.swing.JMenuItem();
        menuFormPengembalian = new javax.swing.JMenuItem();
        menuFormPenyewaan = new javax.swing.JMenuItem();
        sparatorMenuForm = new javax.swing.JPopupMenu.Separator();
        menuLogOut = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        menuLapPeminjaman = new javax.swing.JMenuItem();
        menuLapPengembalian = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAkun = new javax.swing.JMenuItem();
        menuGantiPass = new javax.swing.JMenuItem();
        sparatorMenuHelp = new javax.swing.JPopupMenu.Separator();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuForm.setText("Form");
        menuForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFormMouseClicked(evt);
            }
        });

        meuFormMember.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        meuFormMember.setText("Member");
        meuFormMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meuFormMemberActionPerformed(evt);
            }
        });
        menuForm.add(meuFormMember);

        menuFormKendaraan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuFormKendaraan.setText("Kendaraan");
        menuFormKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormKendaraanActionPerformed(evt);
            }
        });
        menuForm.add(menuFormKendaraan);

        menuFormPengembalian.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuFormPengembalian.setText("Pengembalian");
        menuFormPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormPengembalianActionPerformed(evt);
            }
        });
        menuForm.add(menuFormPengembalian);

        menuFormPenyewaan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuFormPenyewaan.setText("Penyewaan");
        menuFormPenyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormPenyewaanActionPerformed(evt);
            }
        });
        menuForm.add(menuFormPenyewaan);
        menuForm.add(sparatorMenuForm);

        menuLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuLogOut.setText("Log Out");
        menuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOutActionPerformed(evt);
            }
        });
        menuForm.add(menuLogOut);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuForm.add(menuExit);

        menuBar.add(menuForm);

        menuLaporan.setText("Laporan");

        menuLapPeminjaman.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        menuLapPeminjaman.setText("Laporan Peminjaman");
        menuLaporan.add(menuLapPeminjaman);

        menuLapPengembalian.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        menuLapPengembalian.setText("Laporan Pengembalian");
        menuLaporan.add(menuLapPengembalian);

        menuBar.add(menuLaporan);

        menuHelp.setText("Help");

        menuAkun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuAkun.setText("Akun");
        menuAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAkunActionPerformed(evt);
            }
        });
        menuHelp.add(menuAkun);

        menuGantiPass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuGantiPass.setText("Ganti Password");
        menuGantiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGantiPassActionPerformed(evt);
            }
        });
        menuHelp.add(menuGantiPass);
        menuHelp.add(sparatorMenuHelp);

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuAbout.setText("About");
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFormMouseClicked

    }//GEN-LAST:event_menuFormMouseClicked

    private void meuFormMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meuFormMemberActionPerformed
        setPaneNull();
        panelMember.viewTable();
        panelMember.setVisible(true);
    }//GEN-LAST:event_meuFormMemberActionPerformed

    private void menuFormKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormKendaraanActionPerformed
        setPaneNull();
        panelKendaraan.viewTable();
        panelKendaraan.setVisible(true);
    }//GEN-LAST:event_menuFormKendaraanActionPerformed

    private void menuFormPenyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormPenyewaanActionPerformed
        setPaneNull();
        panelPenyewaan.setComboKendaraan();
        panelPenyewaan.setComboMember();
        panelPenyewaan.setVisible(true);
    }//GEN-LAST:event_menuFormPenyewaanActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int a = JOptionPane.showConfirmDialog(panelMember, "Anda yakin ingin menutup aplikasi ini ?", "Warning", JOptionPane.WARNING_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOutActionPerformed
        int a = JOptionPane.showConfirmDialog(panelMember, "Anda yakin ingin keluar ?", "Warning", JOptionPane.WARNING_MESSAGE);
        if (a == 0) {
            dispose();
            new FormLogin().setVisible(true);
        }
    }//GEN-LAST:event_menuLogOutActionPerformed

    private void menuGantiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGantiPassActionPerformed
        new GantiPassword().setVisible(true);
    }//GEN-LAST:event_menuGantiPassActionPerformed

    private void menuAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAkunActionPerformed
        new EditAkun().setVisible(true);
    }//GEN-LAST:event_menuAkunActionPerformed

    private void menuFormPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormPengembalianActionPerformed
        setPaneNull();
        panelPengembalian.setVisible(true);
    }//GEN-LAST:event_menuFormPengembalianActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuAkun;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuForm;
    private javax.swing.JMenuItem menuFormKendaraan;
    private javax.swing.JMenuItem menuFormPengembalian;
    private javax.swing.JMenuItem menuFormPenyewaan;
    private javax.swing.JMenuItem menuGantiPass;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuLapPeminjaman;
    private javax.swing.JMenuItem menuLapPengembalian;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenuItem menuLogOut;
    private javax.swing.JMenuItem meuFormMember;
    private javax.swing.JPopupMenu.Separator sparatorMenuForm;
    private javax.swing.JPopupMenu.Separator sparatorMenuHelp;
    // End of variables declaration//GEN-END:variables
}
