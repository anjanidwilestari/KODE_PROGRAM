/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

public class transaksi {
    private int nomor;
    private String kode_transaksi;
    private String nama_pembeli;
    private String kode_obat;
    private String nama_obat;
    private String merek_obat;
    private int harga_jual;
    private int jumlah_beli;
    private int total_harga;
    private String tanggal_transaksi;
    
    public transaksi(){
        
    }

    public transaksi(int nomor, String kode_transaksi, String nama_pembeli, String kode_obat, String nama_obat, String merek_obat, int harga_jual, int jumlah_beli, int total_harga, String tanggal_transaksi) {
        this.nomor = nomor;
        this.kode_transaksi = kode_transaksi;
        this.nama_pembeli = nama_pembeli;
        this.kode_obat = kode_obat;
        this.nama_obat = nama_obat;
        this.merek_obat = merek_obat;
        this.harga_jual = harga_jual;
        this.jumlah_beli = jumlah_beli;
        this.total_harga = total_harga;
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(String kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
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

    public String getMerek_obat() {
        return merek_obat;
    }

    public void setMerek_obat(String merek_obat) {
        this.merek_obat = merek_obat;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }
    
    public static transaksi getById(int nomor){
        transaksi tr = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM transaksi "
                                            + "WHERE nomor = " + nomor + "");
        
        try{
            while(rs.next()){
                tr = new transaksi();
                tr.setNomor(rs.getInt("nomor"));
                tr.setKode_transaksi(rs.getString("kode_transaksi"));
                tr.setNama_pembeli(rs.getString("nama_pembeli"));
                tr.setKode_obat(rs.getString("kode_obat"));
                tr.setNama_obat(rs.getString("nama_obat"));
                tr.setMerek_obat(rs.getString("merek_obat"));
                tr.setHarga_jual(rs.getInt("harga_jual"));
                tr.setJumlah_beli(rs.getInt("jumlah_beli"));
                tr.setTotal_harga(rs.getInt("total_harga"));
                tr.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return tr;
    }
    
    public static ArrayList<transaksi> getAll(){
        ArrayList<transaksi> listTransaksi = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM transaksi");
        
        try {
            while(rs.next()){
                transaksi tr = new transaksi();
                tr.setNomor(rs.getInt("nomor"));
                tr.setKode_transaksi(rs.getString("kode_transaksi"));
                tr.setNama_pembeli(rs.getString("nama_pembeli"));
                tr.setKode_obat(rs.getString("kode_obat"));
                tr.setNama_obat(rs.getString("nama_obat"));
                tr.setMerek_obat(rs.getString("merek_obat"));
                tr.setHarga_jual(rs.getInt("harga_jual"));
                tr.setJumlah_beli(rs.getInt("jumlah_beli"));
                tr.setTotal_harga(rs.getInt("total_harga"));
                tr.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
                
                listTransaksi.add(tr);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listTransaksi;
    }
    
    public static ArrayList<transaksi> search(String keyword){
        ArrayList<transaksi> listTransaksi = new ArrayList();
        
        String query = "SELECT * FROM transaksi"
                    + " WHERE nomor LIKE '%" + keyword + "%'"
                    + " OR nama_pembeli LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                transaksi tr = new transaksi();
                tr.setNomor(rs.getInt("nomor"));
                tr.setKode_transaksi(rs.getString("kode_transaksi"));
                tr.setNama_pembeli(rs.getString("nama_pembeli"));
                tr.setKode_obat(rs.getString("kode_obat"));
                tr.setNama_obat(rs.getString("nama_obat"));
                tr.setMerek_obat(rs.getString("merek_obat"));
                tr.setHarga_jual(rs.getInt("harga_jual"));
                tr.setJumlah_beli(rs.getInt("jumlah_beli"));
                tr.setTotal_harga(rs.getInt("total_harga"));
                tr.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
                
                listTransaksi.add(tr);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listTransaksi;
    }
    
    public void save(){
        if(this.nomor == 0){
            String query = "INSERT INTO transaksi (kode_transaksi,nama_pembeli,kode_obat,nama_obat,merek_obat,harga_jual,jumlah_beli,total_harga,tanggal_transaksi) VALUES("
                        + " '" + this.kode_transaksi + "', "
                        + " '" + this.nama_pembeli + "', "
                        + " '" + this.kode_obat + "', "
                        + " '" + this.nama_obat + "', "
                        + " '" + this.merek_obat + "', "
                        + " '" + this.harga_jual + "', "
                        + " '" + this.jumlah_beli + "', "
                        + " '" + this.total_harga + "', "
                        + " '" + this.tanggal_transaksi + "') ";
            
            this.nomor = DBHelper.insertQueryGetId(query);
        }
        else{
            String query = "UPDATE transaksi SET "
                        + " kode transaksi = '" + this.kode_transaksi + "', "
                        + " nama pembeli = '" + this.nama_pembeli + "', "
                        + " kode obat = '" + this.kode_obat + "', "
                        + " nama obat = '" + this.nama_obat + "', "
                        + " merek obat = '" + this.merek_obat + "', "
                        + " harga jual = '" + this.harga_jual + "', "
                        + " jumlah beli = '" + this.jumlah_beli + "', "
                        + " total harga = '" + this.total_harga + "', "
                        + " tanggal transaksi = '" + this.tanggal_transaksi + "' "
                        + " WHERE nomor = '" + this.nomor + "'";
            
            DBHelper.executeQuery(query);
        }
    }
    
    public void delete(){
        String query = "DELETE FROM transaksi WHERE nomor = " + this.nomor;
        DBHelper.executeQuery(query);
    }
}
