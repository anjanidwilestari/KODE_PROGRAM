package backend;
import java.util.ArrayList;
import java.sql.*;

public class Kategori {
    private int idkategori;
    private String nama;
    private String keterangan;

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public Kategori (){
        
    }
    
    public Kategori (String nama, String keterangan){
        this.nama=nama;
        this.keterangan=keterangan;
    }
    
    public static Kategori getById (int id){
        Kategori kat = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori "
                                            + "WHERE idkategori = "+ id+"");
        try{
            while (rs.next()){
                kat=new Kategori();
                kat.setIdkategori(rs.getInt("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return kat;
    }
    public static ArrayList<Kategori> getAll(){
        ArrayList<Kategori> listKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery( "SELECT * FROM kategori");
        try {
            while (rs.next()){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString ("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                listKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listKategori;
    }
            
    public static ArrayList<Kategori> search (String keyword) {
        ArrayList<Kategori> listKategori = new ArrayList();
        String query = "SELECT * FROM kategori" + " WHERE nama LIKE '%" 
                        + keyword + "%'" + " OR keterangan LIKE '%" 
                        + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);
        try{
            while (rs.next () ){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString ("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                listKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public void save (){
        if(this.idkategori==0){
            String query = "INSERT INTO kategori (nama, keterangan) VALUES ("
                            + " '" + this.nama+"', " 
                            + " '" + this.keterangan+"') ";
            this.idkategori=DBHelper.insertQueryGetId(query);
        }
        else{
            String query= "UPDATE kategori SET "
                            + " nama = '"+this.nama+"' "
                            + " keterangan = '"+this.keterangan+"' "
                            + " WHERE idkategori = '"+this.idkategori+"' ";
            DBHelper.executeQuery(query);
        }
    }
    
    public boolean delete (){
        ResultSet rs = DBHelper.selectQuery("SELECT COUNT(*) as jumlahBuku FROM buku"
                        +"WHERE idkategori = " + this.idkategori + "");
        int jumlahBuku=0;
        
        try{
            while (rs.next()){
                jumlahBuku=rs.getInt("JumlahBuku");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(jumlahBuku==0){
            String query = "DELETE FROM kategori WHERE idkategori = "+this.idkategori;
            DBHelper.executeQuery(query);
            return true;
        }else{
            return false;
        }
    }
    
    public String toSTring(){
        return nama;
    }
}
                  