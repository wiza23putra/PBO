/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pariwisata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author acer
 */
public class objek {
    private String databaseName = "2210010495";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;

    
      public objek(){
          try {
              String location = "jdbc:mysql://localhost/" + databaseName;
              Class.forName("com.mysql.jdbc.Driver");
              koneksiDB = DriverManager.getConnection(location, username, password);
              System.out.println("database terkoneksi");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
//
//   
//    }
      
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
              
              System.out.println("data berhasil disimpan");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      
      public void ubahobjek(String id_objek, String id_kategoriobjek, String Nama_objek, String Alamat_objek, String Deskripsi, String Foto, String Koordinat){
          try {
              String sql = "update objek set id_objek = ?, id_kategoriobjek = ?, Nama_objek = ?, Alamat_objek = ?, Deskripsi = ?, Foto = ?, Koordinat = ?"; 
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id_objek);
              perintah.setString(2, id_kategoriobjek);
              perintah.setString(3, Nama_objek);
              perintah.setString(4, Alamat_objek);
              perintah.setString(5, Deskripsi);
              perintah.setString(6, Foto);
              perintah.setString(7, Koordinat);
              perintah.executeUpdate();
              
              System.out.println("objek berhasil ditambahkan.");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }        
      }
      
       public void hapusobjek(String id){
          try {
              String sql = "delete from objek where id_objek = ?"; 
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id);
              perintah.executeUpdate();
              
              System.out.println("data berhasil dihapus");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }        
      }
       
      public void cariobjek(String id, String paramid_objek){
          try {
              String sql = "select*from objek where id_objek = ?";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1,paramid_objek);
              ResultSet data = perintah.executeQuery();
              while(data.next()){
                  System.out.println("ID_OBJEK : "+data.getString("id_objek"));
                  System.out.println("ID_OBJEK : "+data.getString("id_kategoriobjek"));
                  System.out.println("NAMA_OBJEK : "+data.getString("Nama_objek"));
                  System.out.println("ALAMAT_OBJEK : "+data.getString("Alamat_objek"));
                  System.out.println("DESKRIPSI : "+data.getString("Deskripsi"));
                  System.out.println("FOTO : "+data.getString("Foto"));
                  System.out.println("KOORDINAT : "+data.getString("Koordinat"));
              }
          } catch (Exception e) {
              System.err.println(e.getMessage());
          }
      }
      
      public void dataobjek(){
          try {
              Statement stmt = koneksiDB.createStatement();
              ResultSet baris = stmt.executeQuery("select * from objek order by id asc");
              while(baris.next()){
                  System.out.println(baris.getString("id_objek")+" | "+
                          baris.getString("id_kategoriobjek")+" | "+
                          baris.getString("Nama_objek")+" | "+
                          baris.getString("Alamat_objek")+" | "+
                          baris.getString("Deskripsi")+" | "+
                          baris.getString("Foto")+" | "+
                          baris.getString("Koordinat"));
                          
              }
          } catch (Exception e) {
              System.err.println(e.getMessage());
          }
      }
//    public int getId_objek() {
//        return id_objek;
//    }
//
//    public int getOrtu_id() {
//        return ortu_id;
//    }
//
//    public int getHamil_ke() {
//        return hamil_ke;
//    }
//
//    public LocalDate getHpht() {
//        return hpht;
//    }
//
//    public LocalDate getHpt() {
//        return hpt;
//    }
//
//    public String getRiwayat_penyakit() {
//        return riwayat_penyakit;
//    }
//
//    public String getRiwayat_alergi() {
//        return riwayat_alergi;
//    }
    
}

