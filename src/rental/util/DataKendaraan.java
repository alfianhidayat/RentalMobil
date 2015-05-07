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
public class DataKendaraan {

    public String idKendaraan;
    public String noPlatKendaraan;
    public String kondisiKendaraan;
    public String statusKendaraan;
    public int tarifSewa;

    public DataKendaraan() {
        
    }

    public DataKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getNoPlatKendaraan() {
        return noPlatKendaraan;
    }

    public void setNoPlatKendaraan(String noPlatKendaraan) {
        this.noPlatKendaraan = noPlatKendaraan;
    }

    public String getKondisiKendaraan() {
        return kondisiKendaraan;
    }

    public void setKondisiKendaraan(String kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public String getStatusKendaraan() {
        return statusKendaraan;
    }

    public void setStatusKendaraan(String statusKendaraan) {
        this.statusKendaraan = statusKendaraan;
    }

    public int getTarifSewa() {
        return tarifSewa;
    }

    public void setTarifSewa(int tarifSewa) {
        this.tarifSewa = tarifSewa;
    }

}
