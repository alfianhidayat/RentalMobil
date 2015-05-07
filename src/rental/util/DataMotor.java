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
public class DataMotor extends DataKendaraan{
    private final String jenisKendaraan;
    
    public DataMotor() {
        this.jenisKendaraan = "Motor";
    }
    
    public DataMotor(String idKendaraan) {
        super(idKendaraan);
        this.jenisKendaraan = "Motor";
    }
    
}
