package backend;

import java.util.ArrayList;
import java.sql.*;

public class kategori {
    private int kategori_obat;
    private String nama;
    
    public kategori(){
        
    }
    
    public kategori(String nama){
        this.nama = nama;
    }

    public int getIdkategori() {
        return kategori_obat;
    }

    public void setIdkategori(int kategori_obat) {
        this.kategori_obat = kategori_obat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public static kategori getById(int id){
        kategori kat = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori "
                                            + "WHERE kategori_obat = " + id + "");
        
        try{
            while(rs.next()){
                kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public static ArrayList<kategori> getAll(){
        ArrayList<kategori> listKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");
        
        try {
            while(rs.next()){
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
                
                listKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listKategori;
    }
    
    public static ArrayList<kategori> search(String keyword){
        ArrayList<kategori> listKategori = new ArrayList();
        
        String query = "SELECT * FROM kategori"
                    + " WHERE nama LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("kategori_obat"));
                kat.setNama(rs.getString("nama"));
                
                listKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listKategori;
    }
    
    public void save(){
        if(this.kategori_obat == 0){
            String query = "INSERT INTO kategori (nama) VALUES("
                        + " '" + this.nama + "') ";
            
            this.kategori_obat = DBHelper.insertQueryGetId(query);
        }
        else{
            String query = "UPDATE kategori SET "
                    + " nama = '" + this.nama + "' "
                    + " WHERE id_kategori = '" + this.kategori_obat + "'";
            
            DBHelper.executeQuery(query);
        }
    }
    
    public boolean delete(){
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahObat FROM obat"
                                            + " WHERE kategori_obat = " + this.kategori_obat + "");
        int jumlahObat = 0;
        
        try{
            while (rs.next()) {
                jumlahObat = rs.getInt("jumlahObat");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        if(jumlahObat == 0){
            String query = "DELETE FROM kategori WHERE kategori_obat = " + this.kategori_obat;
            DBHelper.executeQuery(query);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return nama;
    }
}


