/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pariwisata;

/**
 *
 * @author acer
 */
public class berita {
    private String Id_berita;
    private String Judul;
    private String Isi_berita;
    private String Tgl_buat;
    private String Gambar;
    private String Jumlah_dilihat;
    
    // Constructor
    public berita(String id_berita, String judul, String isi_berita, String tgl_buat, String gambar, String jumlah_dilihat){ 
        this.Id_berita = id_berita;
        this.Judul = judul;
        this.Isi_berita = isi_berita;
        this.Tgl_buat = tgl_buat;
        this.Gambar = gambar;
        this.Jumlah_dilihat = jumlah_dilihat;
    }   
     
    // Getters
    public String getId_berita() {
        return Id_berita;
    }

    public String getJudul() {
        return Judul;
    }

    public String getIsi_berita() {
        return Isi_berita;
    }  
    
    public String getTgl_buat() {
        return Tgl_buat;
    }
    
    public String getGambar() {
        return Gambar;
    }
    
    public String getJumlah_dilihat() {
        return Jumlah_dilihat;
    }
    
}
