/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pariwisata;

/**
 *
 * @author acer
 */
public class profil {
    private String Id_profil;
    private String Nama_aplikasi;
    private String Nama_instansi;
    private String Alamat_instansi;
    private String Notelp_instansi;
    private String Email_instansi;
    private String Profil_instansi;
    private String Logo_instansi;

    // Constructor
    public profil(String id_profil, String nama_aplikasi, String nama_instansi, String alamat_instansi, String notelp_instansi, String email_instansi, String profil_instansi, String logo_instansi){ 
        this.Id_profil = id_profil;
        this.Nama_aplikasi = nama_aplikasi;
        this.Nama_instansi = nama_instansi;
        this.Alamat_instansi = alamat_instansi;
        this.Notelp_instansi = notelp_instansi;
        this.Email_instansi = email_instansi;
        this.Profil_instansi = profil_instansi;
        this.Logo_instansi = logo_instansi;
    }   
     
    // Getters
    public String getId_profil() {
        return Id_profil;
    }

    public String getNama_aplikasi() {
        return Nama_aplikasi;
    }

    public String getNama_instansi() {
        return Nama_instansi;
    }  
    
    public String getAlamat_instansi() {
        return Alamat_instansi;
    }
    
    public String getNotelp_instansi() {
        return Notelp_instansi;
    }
    
    public String getEmail_instansi() {
        return Email_instansi;
    }
    
    public String getProfil_instansi() {
        return Profil_instansi;
    }
    
    public String getLogo_instansi() {
        return Logo_instansi;
    }
}
