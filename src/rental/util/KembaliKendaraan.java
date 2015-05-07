/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.util;

/**
 *
 * @author Alfian Hidayat
 */
public class KembaliKendaraan {

    private String idKembali;
    private String idSewa;
    private int denda;

    public KembaliKendaraan(String idSewa) {
        this.idSewa = idSewa;
    }

    public String getIdKembali() {
        return idKembali;
    }

    public void setIdKembali(String idKembali) {
        this.idKembali = idKembali;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

}
