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
public class Member {

    private String idMember;
    private String namaMember;
    private String noKTP;
    private String alamatMember;
    private int noHPMember;
    private String jenisKelamin;

    public Member(String idMember, String namaMember, String noKTP, String alamatMember, int noHPMember, String jenisKelamin) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.noKTP = noKTP;
        this.alamatMember = alamatMember;
        this.noHPMember = noHPMember;
        this.jenisKelamin = jenisKelamin;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setAlamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
    }

    public void setNoHPMember(int noHPMember) {
        this.noHPMember = noHPMember;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    

}
