/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

public class obat {
    private int id_obat;
    private String kode_obat;
    private String nama_obat;
    private kategori kategori;
    private String jenis_obat;
    private String merek_obat;
    private int harga_beli_obat;
    private int harga_jual_obat;
    private int jumlah_obat;
    private String tanggal_masuk;
    private String expired;
    
    public obat(){
        
    }

    public obat(int id_obat, String kode_obat, String nama_obat, kategori kategori, String jenis_obat, String merek_obat, int harga_beli_obat, int harga_jual_obat, int jumlah_obat, String tanggal_masuk, String expired) {
        this.id_obat = id_obat;
        this.kode_obat = kode_obat;
        this.nama_obat = nama_obat;
        this.kategori = kategori;
        this.jenis_obat = jenis_obat;
        this.merek_obat = merek_obat;
        this.harga_beli_obat = harga_beli_obat;
        this.harga_jual_obat = harga_jual_obat;
        this.jumlah_obat = jumlah_obat;
        this.tanggal_masuk = tanggal_masuk;
        this.expired = expired;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public kategori getKategori(){
        return kategori;
    }

    public void setKategori(kategori kategori){
        this.kategori = kategori;
    }

    public String getJenis_obat() {
        return jenis_obat;
    }

    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }

    public String getMerek_obat() {
        return merek_obat;
    }

    public void setMerek_obat(String merek_obat) {
        this.merek_obat = merek_obat;
    }

    public int getHarga_beli_obat() {
        return harga_beli_obat;
    }

    public void setHarga_beli_obat(int harga_beli_obat) {
        this.harga_beli_obat = harga_beli_obat;
    }

    public int getHarga_jual_obat() {
        return harga_jual_obat;
    }

    public void setHarga_jual_obat(int harga_jual_obat) {
        this.harga_jual_obat = harga_jual_obat;
    }

    public int getJumlah_obat() {
        return jumlah_obat;
    }

    public void setJumlah_obat(int jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }
    
    public static obat getById(int id){
        obat ob = null;
        String query = "SELECT obat.*, kategori.nama"
                        + " FROM obat"
                        + " LEFT JOIN kategori ON obat.kategori_obat = kategori.kategori_obat"
                        + " WHERE id_obat = " + id;
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
                
                ob = new obat();
                ob.setId_obat(rs.getInt("id_obat"));
                ob.setKode_obat(rs.getString("kode_obat"));
                ob.setNama_obat(rs.getString("nama_obat"));
                ob.setKategori(kat);
                ob.setJenis_obat(rs.getString("jenis_obat"));
                ob.setMerek_obat(rs.getString("merek_obat"));
                ob.setHarga_beli_obat(rs.getInt("harga_beli_obat"));
                ob.setHarga_jual_obat(rs.getInt("harga_jual_obat"));
                ob.setJumlah_obat(rs.getInt("jumlah_obat"));
                ob.setTanggal_masuk(rs.getString("tanggal_masuk"));
                ob.setExpired(rs.getString("expired"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return ob;
    }
    
    public static ArrayList<obat> getAll(){
        ArrayList<obat> listObat = new ArrayList();
        String query = "SELECT obat.*, kategori.nama"
                        + " FROM obat"
                        + " LEFT JOIN kategori ON obat.kategori_obat = kategori.kategori_obat";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try {
            while(rs.next()){
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
                
                obat ob = new obat();
                ob.setId_obat(rs.getInt("id_obat"));
                ob.setKode_obat(rs.getString("kode_obat"));
                ob.setNama_obat(rs.getString("nama_obat"));
                ob.setKategori(kat);
                ob.setJenis_obat(rs.getString("jenis_obat"));
                ob.setMerek_obat(rs.getString("merek_obat"));
                ob.setHarga_beli_obat(rs.getInt("harga_beli_obat"));
                ob.setHarga_jual_obat(rs.getInt("harga_jual_obat"));
                ob.setJumlah_obat(rs.getInt("jumlah_obat"));
                ob.setTanggal_masuk(rs.getString("tanggal_masuk"));
                ob.setExpired(rs.getString("expired"));
                
                listObat.add(ob);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listObat;
    }
    
    public static ArrayList<obat> search(String keyword){
        ArrayList<obat> listObat = new ArrayList();
        
        String query = "SELECT obat.*, kategori.nama"
                        + " FROM obat"
                        + " LEFT JOIN kategori ON obat.kategori_obat = kategori.kategori_obat"
                        + " WHERE id_obat LIKE '%" + keyword + "%'"
                        + " OR nama_obat LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
                
                obat ob = new obat();
                ob.setId_obat(rs.getInt("id_obat"));
                ob.setKode_obat(rs.getString("kode_obat"));
                ob.setNama_obat(rs.getString("nama_obat"));
                ob.setKategori(kat);
                ob.setJenis_obat(rs.getString("jenis_obat"));
                ob.setMerek_obat(rs.getString("merek_obat"));
                ob.setHarga_beli_obat(rs.getInt("harga_beli_obat"));
                ob.setHarga_jual_obat(rs.getInt("harga_jual_obat"));
                ob.setJumlah_obat(rs.getInt("jumlah_obat"));
                ob.setTanggal_masuk(rs.getString("tanggal_masuk"));
                ob.setExpired(rs.getString("expired"));
                
                listObat.add(ob);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listObat;
    }
    
    public void save(){
        if(this.id_obat == 0){
            String query = "INSERT INTO obat (kode_obat,nama_obat,kategori_obat,jenis_obat,merek_obat,harga_beli_obat,harga_jual_obat,jumlah_obat,tanggal_masuk,expired) VALUES("
                        + " '" + this.kode_obat + "', "
                        + " '" + this.nama_obat + "', "
                        + " '" + this.kategori.getIdkategori() + "', "
                        + " '" + this.jenis_obat + "', "
                        + " '" + this.merek_obat + "', "
                        + " '" + this.harga_beli_obat + "', "
                        + " '" + this.harga_jual_obat + "', "
                        + " '" + this.jumlah_obat + "', "
                        + " '" + this.tanggal_masuk + "', "
                        + " '" + this.expired + "') ";
            
            this.id_obat = DBHelper.insertQueryGetId(query);
        }
        else{
            String query = "UPDATE obat SET "
                        + " kode_obat = '" + this.kode_obat + "', "
                        + " nama_obat = '" + this.nama_obat + "', "
                        + " kategori_obat = '" + this.kategori.getIdkategori() + "', "
                        + " jenis_obat = '" + this.jenis_obat + "', "
                        + " merek_obat = '" + this.merek_obat + "', "
                        + " harga_beli_obat = '" + this.harga_beli_obat + "', "
                        + " harga_jual_obat = '" + this.harga_jual_obat + "', "
                        + " jumlah_obat = '" + this.jumlah_obat + "', "
                        + " tanggal_masuk = '" + this.tanggal_masuk + "', "
                        + " expired = '" + this.expired + "' "
                        + " WHERE id_obat = '" + this.id_obat + "'";
            
            DBHelper.executeQuery(query);
        }
    }
    
    public void delete(){
        String query = "DELETE FROM obat WHERE id_obat = " + this.id_obat;
        DBHelper.executeQuery(query);
    }

}

