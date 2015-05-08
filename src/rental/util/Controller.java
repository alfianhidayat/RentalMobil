/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.util;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import rental.dbconnection.ConnectionDB;

/**
 *
 * @author Alfian Hidayat
 */
public class Controller {

    ConnectionDB cdb = new ConnectionDB();

    public String autokode(String query, String kd) {
        String kode = "";
        try {
            ResultSet rs = cdb.executeQuery(query);
            while (rs.next()) {
                if (rs.getInt(1) == 0) {
                    kode = kd + "00001";
                } else {
                    int auto = rs.getInt(1) + 1;
                    String no = String.valueOf(auto);
                    int noLong = no.length();
                    for (int i = 0; i < 5 - noLong; i++) {
                        no = "0" + no;
                    }
                    kode = kd + no;
                }
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR: \n" + e.toString(),
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
        return kode;
    }

    public String currentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public String addDate(int q) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, q);
        return dateFormat.format(cal.getTime());
    }

    public String toRupiahFormat(String nominal) {
        Locale locale = null;
        NumberFormat rupiahFormat = null;
        String rupiah = "Rp. ";
        locale = new Locale("ca", "CA");
        rupiahFormat = NumberFormat.getCurrencyInstance(locale);
        rupiah = rupiah + rupiahFormat.format(Double.parseDouble(nominal)).substring(4);
        return rupiah;
    }
}
