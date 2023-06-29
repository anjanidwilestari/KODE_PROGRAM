/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.sql.*;
public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    public Anggota(){
        
    }
    public Anggota(String nama,String alamat,String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    public Anggota getById(int id){
        Anggota a = new Anggota();
        String sql = "SELECT * FROM anggota WHERE idanggota = '"+id+"'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try{
            
            while(rs.next()){
                a = new Anggota();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return a;
    }
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> listAnggota = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
        try{
            while(rs.next()){
                Anggota a = new Anggota();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
                
                listAnggota.add(a);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listAnggota;
    }
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> List = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE nama "
                + "LIKE '%"+keyword+"%' OR "
                + "alamat LIKE '%"+keyword+"%' "
                + "OR telepon LIKE '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try{
            while(rs.next()){
                Anggota a = new Anggota();
                a.setIdanggota(rs.getInt("idanggota"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
                
                List.add(a);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return List;
    }
    public void save(){
        if(getById(idanggota).getIdanggota()== 0){
            String SQL = "INSERT INTO anggota (nama,alamat,telepon) values("
                    + "     '"+this.nama+"', "
                    +"     '"+this.alamat+"', "
                    +"     '"+this.telepon+"')";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE anggota SET "
                    + "nama='"+this.nama+"',"
                    + "alamat = '"+this.alamat+"'"
                    + " WHERE idanggota='"+this.idanggota+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE "
                + "idanggota = '"+this.idanggota+"'";
        DBHelper.executeQuery(SQL);
    }
}
