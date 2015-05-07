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
public class DataMobil extends DataKendaraan {

    private final String jenisKendaraan;

    DataMobil() {
        this.jenisKendaraan = "Mobil";
    }

    public DataMobil(String idKendaraan) {
        super(idKendaraan);
        this.jenisKendaraan = "Mobil";
    }

}
