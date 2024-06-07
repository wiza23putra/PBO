/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection; //mendapatkan koneksi
import java.sql.DriverManager; //menghubungkan database
import java.sql.PreparedStatement; //perintah sql simpan, ubah, hapus
import static pariwisata.objek.koneksiDB;

/**
 *
 * @author acer
 */
public class database {
    private String databaseName = "2210010495";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
    
    public database(){
        try {
            String location = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanobjek(String id_objek, String id_kategoriobjek, String Nama_objek, String Alamat_objek, String Deskripsi, String Foto, String Koordinat){
        try {
           String sql = "insert into objek (id_objek, id_kategoriobjek, Nama_objek, Alamat_objek, Deskripsi, Foto, Koordinat) value(?, ?, ?, ?, ?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id_objek);
              perintah.setString(2, id_kategoriobjek);
              perintah.setString(3, Nama_objek);
              perintah.setString(4, Alamat_objek);
              perintah.setString(5, Deskripsi);
              perintah.setString(6, Foto);
              perintah.setString(7, Koordinat);
              perintah.executeUpdate();
            
            System.out.println("data berhasil tersimpan"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahUji(String nik,String nama,String telp,String alamat){
        try {
            String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            perintah.executeUpdate();
            
            System.out.println("data berhasil terubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void hapusUji(String nik){
        try {
            String sql = "delete from uji where nik = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nik);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      
}
