/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class database {
   private String databaseName="2210010495";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    
    public database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        }
       catch (Exception e) { 
            System.err.println(e.toString());
        }
    }

    
    public void simpanObjek(String paramid_objek, String paramid_kategoriobjek, String paramnama_objek, String paramalamat_objek, String paramdeskripsi, String paramfoto, String paramkoordinat){
        try {
           String sql = "insert into objek (id_objek, id_kategoriobjek, Nama_objek, Alamat_objek, Deskripsi, Foto, Koordinat) value(?, ?, ?, ?, ?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramid_objek);
              perintah.setString(2, paramid_kategoriobjek);
              perintah.setString(3, paramnama_objek);
              perintah.setString(4, paramalamat_objek);
              perintah.setString(5, paramdeskripsi);
              perintah.setString(6, paramfoto);
              perintah.setString(7, paramkoordinat);
              perintah.executeUpdate();
            
            System.out.println("data berhasil tersimpan"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahObjek(String paramid_objek, String paramid_kategoriobjek, String paramnama_objek, String paramalamat_objek, String paramdeskripsi, String paramfoto, String paramkoordinat){
        try {
            String sql = "update objek set Id_kategoriobjek = ?, Nama_objek = ?, Alamat_objek = ?, Deskripsi = ?, Foto = ? where Id_kategoriobjek = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramid_kategoriobjek);
              perintah.setString(2, paramnama_objek);
              perintah.setString(3,paramalamat_objek);
              perintah.setString(4,paramdeskripsi);
              perintah.setString(5,paramfoto);
              perintah.setString(6,paramkoordinat);
               perintah.setString(7,paramid_objek);
            perintah.executeUpdate();
            
            System.out.println("data berhasil terubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusobjek(String paramid_objek) {  
        try {
            String sql = "delete from Objek where id_objek=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1,paramid_objek);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpanKategori_objek(String paramid_kategoriobjek, String paramnama_kategori, String paramicon_marker){
        try {
           String sql = "insert into kategori_objek (Id_kategoriobjek, Nama_kategori, Icon_marker) value(?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramid_kategoriobjek);
              perintah.setString(2, paramnama_kategori);
              perintah.setString(3, paramicon_marker);
              perintah.executeUpdate();
            
            System.out.println("data berhasil tersimpan"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKategori_objek(String paramid_kategoriobjek, String paramnama_kategori, String paramicon_marker){
        try {
            String sql = "update kategori_objek set Nama_kategori = ?, Icon_marker = ? where Id_kategoriobjek = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
             perintah.setString(1, paramnama_kategori);
             perintah.setString(2, paramicon_marker);
             perintah.setString(3, paramid_kategoriobjek);
            perintah.executeUpdate();
            
            System.out.println("data berhasil terubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusKategori_objek(String paramid_kategoriobjek){
        try {
            String sql = "delete from kategori_objek where id_kategoriobjek = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1,paramid_kategoriobjek);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
    
    public void simpanBerita(String paramid_berita, String paramjudul, String paramisi_berita, String paramtgl_buat, String paramgambar, String paramjumlah_dilihat){
        try {
           String sql = "insert into berita (Id_berita, Judul, Isi_berita, Tgl_buat, Gambar, Jumlah_dilihat) value(?, ?, ?, ?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramid_berita);
              perintah.setString(2, paramjudul);
              perintah.setString(3, paramisi_berita);
              perintah.setString(4, paramtgl_buat);
              perintah.setString(5, paramgambar);
              perintah.setString(6, paramjumlah_dilihat);
              perintah.executeUpdate();
            
            System.out.println("data berhasil tersimpan"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahBerita(String paramid_berita, String paramjudul, String paramisi_berita, String paramtgl_buat, String paramgambar, String paramjumlah_dilihat){
        try {
            String sql = "update berita set Judul = ?, Isi_berita = ?, Tgl_buat = ?, Gambar = ?, Jumlah_dilihat = ? where Id_berita = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramjudul);
              perintah.setString(2, paramisi_berita);
              perintah.setString(3, paramtgl_buat);
              perintah.setString(4, paramgambar);
              perintah.setString(5, paramjumlah_dilihat);
              perintah.setString(6, paramid_berita);
            perintah.executeUpdate();
            
            System.out.println("data berhasil terubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusBerita(String paramid_berita){
        try {
            String sql = "delete from berita where Id_berita = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, paramid_berita);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
    
     public void simpanProfil(String paramid_profil, String paramnama_aplikasi, String paramnama_instansi, String paramalamat_instansi, String paramnotelp_instansi, String paramemail_instansi, String paramprofil_instansi, String paramlogo_instansi){
        try {
           String SQL = "INSERT INTO profil (Id_profil, Nama_aplikasi, Nama_instansi, Alamat_instansi, Notelp_instansi, Email_instansi, Profil_instansi, Logo_instansi)"
                   + " value(?, ?, ?, ?, ?, ?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
              perintah.setString(1, paramid_profil);
              perintah.setString(2, paramnama_aplikasi);
              perintah.setString(3, paramnama_instansi);
              perintah.setString(4, paramalamat_instansi);
              perintah.setString(5, paramnotelp_instansi);
              perintah.setString(6, paramemail_instansi);
              perintah.setString(7, paramprofil_instansi);
              perintah.setString(8, paramlogo_instansi);
              perintah.executeUpdate();
            
            System.out.println("data berhasil tersimpan"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahProfil(String paramid_profil, String paramnama_aplikasi, String paramnama_instansi, String paramalamat_instansi, String paramnotelp_instansi, String paramemail_instansi, String paramprofil_instansi, String paramlogo_instansi){
        try {
            String sql = "update profil set Nama_aplikasi = ?, Nama_instansi = ?, Alamat_instansi = ?, Notelp_instansi = ?, Email_instansi = ?, Profil_instansi = ?, Logo_instansi = ? where Id_profil = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, paramnama_aplikasi);
              perintah.setString(2, paramnama_instansi);
              perintah.setString(3, paramalamat_instansi);
              perintah.setString(4, paramnotelp_instansi);
              perintah.setString(5, paramemail_instansi);
              perintah.setString(6, paramprofil_instansi);
              perintah.setString(7, paramlogo_instansi);
              perintah.setString(8, paramid_profil);
            perintah.executeUpdate();
            
            System.out.println("data berhasil terubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusProfil(String paramid_profil){
        try {
            String sql = "delete from profil where Id_profil = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, paramid_profil);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public void cari(String paramid_provinsi) {
        try {
           String SQL="SELECT*FROM m_provinsi WHERE id_provinsi=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramid_provinsi);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println("ID KABUPATEN :"+data.getString("id_provinsi"));
               System.out.println("ID PROVINSI :"+data.getString("nama_provinsi"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    } 
    
    
    public void dataM_Provinsi() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM m_provinsi ORDER BY id_provinsi ASC");
            while(baris.next()) {
                System.out.println(baris.getString("id_provinsi")+" | "+
                        baris.getString("nama _provinsi"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
