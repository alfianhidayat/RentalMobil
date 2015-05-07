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
public class SewaKendaraan {

    private String noSewa;
    private String idPenyewa;
    private String idKendaraan;
    private String jaminan;
    private String tanggalSewa;
    private String tanggalKembali;

    public SewaKendaraan() {
    }

    public SewaKendaraan(String idPenyewa, String idKendaraan) {
        this.idPenyewa = idPenyewa;
        this.idKendaraan = idKendaraan;
    }

    public String getNoSewa() {
        return noSewa;
    }

    public void setNoSewa(String noSewa) {
        this.noSewa = noSewa;
    }

    public String getNamaPenyewa() {
        return idPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.idPenyewa = namaPenyewa;
    }

    public String getJaminan() {
        return jaminan;
    }

    public void setJaminan(String jaminan) {
        this.jaminan = jaminan;
    }

    public String getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(String tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

}
