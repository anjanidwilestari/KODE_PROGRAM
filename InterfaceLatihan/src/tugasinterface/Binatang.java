package tugasinterface;
public class Binatang{
    protected String nama;
    protected int jumlahMata;
    protected int jumlahKaki;
    
    public Binatang(String nama, int jumlahMata, int jumlahKaki){
        this.nama=nama;
        this.jumlahMata=jumlahMata;
        this.jumlahKaki=jumlahKaki;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setMata(int jumlahMata){
        this.jumlahMata=jumlahMata;
    }
    
    public int getMata(){
        return jumlahMata;
    }
    
    public void setKaki(int jumlahKaki){
        this.jumlahKaki=jumlahKaki;
    }
    
    public int getKaki(){
        return jumlahKaki;
    }
    
    public void tampilkanInfoBinatang(){
        System.out.println("Nama            : "+getNama());
        System.out.println("Jumlah Mata     : "+getMata());
        System.out.println("Jumlah Kaki     : "+getKaki());
    }
 }
