/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pariwisata;

/**
 *
 * @author acer
 */
public class objek {
    private String Id_objek;
    private String Id_kategoriobjek;
    private String Nama_objek;
    private String Alamat_objek;
    private String Deskripsi;
    private String Foto;
    private String Koordinat;

    // Constructor
    public objek(String id_objek, String id_kategoriobjek, String nama_objek, String alamat_objek, String deskripsi, String foto, String koordinat){ 
        this.Id_objek = id_objek;
        this.Id_kategoriobjek = id_kategoriobjek;
        this.Nama_objek = nama_objek;
        this.Alamat_objek = alamat_objek;
        this.Deskripsi = deskripsi;
        this.Foto = foto;
        this.Koordinat = koordinat;
    }   
     
    // Getters
    public String getId_objek() {
        return Id_objek;
    }

    public String getId_kategoriobjek() {
        return Id_kategoriobjek;
    }

    public String getNama_objek() {
        return Nama_objek;
    }  
    
    public String getAlamat_objek() {
        return Alamat_objek;
    }
    
    public String getDeskripsi() {
        return Deskripsi;
    }
    
    public String getFoto() {
        return Foto;
    }
    
    public String getKoordinat() {
        return Koordinat;
    }
 }

    


