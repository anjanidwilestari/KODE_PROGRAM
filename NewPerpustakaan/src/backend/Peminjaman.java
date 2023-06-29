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
import java.util.Date;
public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku(); 
    private Date tanggalpinjam;
    private Date tanggalkembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Date getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(Date tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public Date getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(Date tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    public  Peminjaman(){
        
    }
    public Peminjaman(Anggota anggota,Buku buku,Date tglpinjam,Date tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tglpinjam;
        this.tanggalkembali =  tglkembali;
    }
    public Peminjaman getByIdAnggota(int id){
        Anggota a = new Anggota();
        String sql = "SELECT "
                + "p.idpeminjaman AS idpeminjaman,"
                + "p.idanggota AS idanggota,"
                + "p.tanggalpinjam AS tglpinjam,"
                + "p.tanggalkembali AS tglkembali"
                + "a.idanggota AS idanggota,"
                + "a.nama AS nama,"
                + "a.alamat AS alamat,"
                + "a.telepon AS telepon "
                + "FROM peminjaman p "
                + "LEFT JOIN p ON p.idanggota = a.idanggota "
                + "WHERE p.idanggota ='"+id+"'" ;
        
    }
}
