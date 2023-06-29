/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

public class user {
    private int id_user;
    private String nama;
    private String jenis_kelamin;
    private String username;
    private String password;
    private String alamat;
    private String email;
    private String no_hp;
    
    public user(){
        
    }
    
    public user(int id_user, String nama, String jenis_kelamin, String username, String password, String alamat, String email, String no_hp){
        this.id_user = id_user;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.email = email;
        this.no_hp = no_hp;
        
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
    public static user getById(int id){
        user us = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user "
                                            + "WHERE id_user = " + id + "");
        
        try{
            while(rs.next()){
                us = new user();
                us.setId_user(rs.getInt("id_user"));
                us.setNama(rs.getString("nama"));
                us.setJenis_kelamin(rs.getString("jenis_kelamin"));
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setAlamat(rs.getString("alamat"));
                us.setEmail(rs.getString("email"));
                us.setNo_hp(rs.getString("no_hp"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return us;
    }
    
    public static ArrayList<user> getAll(){
        ArrayList<user> listUser = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user");
        
        try {
            while(rs.next()){
                user us = new user();
                us.setId_user(rs.getInt("id_user"));
                us.setNama(rs.getString("nama"));
                us.setJenis_kelamin(rs.getString("jenis_kelamin"));
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setAlamat(rs.getString("alamat"));
                us.setEmail(rs.getString("email"));
                us.setNo_hp(rs.getString("no_hp"));
                
                listUser.add(us);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listUser;
    }
    
    public static ArrayList<user> search(String keyword){
        ArrayList<user> listUser = new ArrayList();
        
        String query = "SELECT * FROM user"
                    + " WHERE nama LIKE '%" + keyword + "%'"
                    + " OR username LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper.selectQuery(query);
        
        try{
            while(rs.next()){
                user us = new user();
                us.setId_user(rs.getInt("id_user"));
                us.setNama(rs.getString("nama"));
                us.setJenis_kelamin(rs.getString("jenis_kelamin"));
                us.setUsername(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                us.setAlamat(rs.getString("alamat"));
                us.setEmail(rs.getString("email"));
                us.setNo_hp(rs.getString("no_hp"));
                
                listUser.add(us);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return listUser;
    }
    
    public void save(){
        if(this.id_user == 0){
            String query = "INSERT INTO user (nama,jenis_kelamin,username,password,alamat,email,no_hp) VALUES("
                        + " '" + this.nama + "', "
                        + " '" + this.jenis_kelamin + "', "
                        + " '" + this.username + "', "
                        + " '" + this.password + "', "
                        + " '" + this.alamat + "', "
                        + " '" + this.email + "', "
                        + " '" + this.no_hp + "') ";
            
            this.id_user = DBHelper.insertQueryGetId(query);
        }
        else{
            String query = "UPDATE user SET "
                    + " nama = '" + this.nama + "', "
                    + " jenis_kelamin = '" + this.jenis_kelamin + "', "
                    + " username = '" + this.username + "', "
                    + " password = '" + this.password + "', "
                    + " alamat = '" + this.alamat + "', "
                    + " email = '" + this.email + "', "
                    + " no_hp = '" + this.no_hp + "' "
                    + " WHERE id_user = '" + this.id_user + "'";
            
            DBHelper.executeQuery(query);
        }
    }
    
    public void delete(){
        String query = "DELETE FROM user WHERE id_user = " + this.id_user;
        DBHelper.executeQuery(query);
    }
}
