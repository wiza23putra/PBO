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
public class kategori_objek{
    private String databaseName = "2210010495";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;
//    private String id;
//    private String catatanKehamilan_id;
//    private LocalDate tglPersalinan;
//    private String umurKehamilan;
//    private PenolongPersalinan penolongPersalinan;
//    private CaraPersalinan caraPersalinan;
//    private KeadaanIbu keadaanIbu;
//    private KondisiLahir kondisiLahir;
    
      public kategori_objek(){
          try {
              String location = "jdbc:mysql://localhost/" + databaseName;
              Class.forName("com.mysql.jdbc.Driver");
              koneksiDB = DriverManager.getConnection(location, username, password);
              System.out.println("database terkoneksi");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }

      
      public void simpankategori_objek(String id_kategoriobjek, String Nama_kategori, String Icon_marker){
          try {
              String sql = "insert into catatanPersalinan (id, catatankehamilan_id,penolong_persalinan, cara_persalinan, keadaan_ibu, kondisi_lahir) value (?, ?, ?, ?, ?, ?)";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id_kategoriobjek);
              perintah.setString(2, Nama_kategori);
              perintah.setString(3, Icon_marker);
              perintah.executeUpdate();
              
              System.out.println("data berhasil ditambah");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      
      public void ubahkategori_objek(String id_kategoriobjek, String Nama_kategori, String Icon_marker){
          try {
              String sql = "update  set Nama_kategori= ?, Icon_marker = ? where id_kategoriobjek = ?";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
             perintah.setString(1, Nama_kategori);
             perintah.setString(2, Icon_marker);
             perintah.setString(3, id_kategoriobjek);
              perintah.executeUpdate();
              
              System.out.println("data berhasil diubah");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      
      public void hapuskategori_objek(String id){
          try {
              String sql = "delete from Kategori_objek where id_kategoriobjek = ?";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id);
              
              perintah.executeUpdate();
              System.out.println("data berhasil dihapus");
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }
      }
      
      public void cariCP(String id){
          try {
              String sql = "select * from Kategori_objek where id_kategoriobjek = ?";
              PreparedStatement perintah = koneksiDB.prepareStatement(sql);
              perintah.setString(1, id);
              ResultSet data = perintah.executeQuery();
              while(data.next()){
                  System.out.println("ID_KATEGORIOBJEK : "+data.getString("id_kategoriobjek"));
                  System.out.println("NAMA_KATEGORI: "+data.getString("nama_kategori"));
                  System.out.println("ICON_MARKER : "+data.getString("Icon_marker"));
              }
          } catch (Exception e) {
              System.err.println(e.getMessage());
          }
      }
      
      public void dataCP(String id){
          try {
              Statement stmt = koneksiDB.createStatement();
              ResultSet baris = stmt.executeQuery("select * from kategori_objek order by id_kategoriobjek asc");
              while(baris.next()){
                  System.out.println(baris.getString("id_kategoriobjek")+" | "+
                          baris.getString("Nama_kategori")+" | "+
                          baris.getString("Icon_marker"));
              }
          } catch (Exception e) {
              System.err.println(e.getMessage());
          }
      }
      

}


