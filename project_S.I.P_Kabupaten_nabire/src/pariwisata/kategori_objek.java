/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pariwisata;

import java.sql.Statement;

/**
 *
 * @author acer
 */
public class kategori_objek{
    private String Id_kategoriobjek;
    private String Nama_kategori;
    private String Icon_marker;

    // Constructor
    public kategori_objek(String id_kategoriobjek, String nama_kategori, String icon_marker) {
        this.Id_kategoriobjek = Id_kategoriobjek;
        this.Nama_kategori = nama_kategori;
        this.Icon_marker = icon_marker;
    }

    // Getters
    public String getId_kategoriobjek() {
        return Id_kategoriobjek;
    }

    public String getNama_kategori() {
        return Nama_kategori;
    }

    public String getIcon_marker() {
        return Icon_marker;
    }  

}


