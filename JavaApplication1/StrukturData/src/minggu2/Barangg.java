package minggu2;
public class Barangg {
//Instance Fields
    private String nama;
    private int hargaSatuan;
    private int jumlah;
    private int hargaTotal;
    private int diskon;
    private int hargaBayar;
    
    //Constructor
    public Barangg (int hs, int j ){
        int ht=0;
        hargaTotal=ht;
        hargaSatuan=hs;
        jumlah=j;
        
        hargaTotal = hargaSatuan*jumlah;
        
        if (hargaTotal > 100000){
            diskon=10*hargaTotal/100;
        } else if (hargaTotal>=50000 && hargaTotal<=100000){
            diskon=5*hargaTotal/100;
        } else if(hargaTotal<50000){
            diskon=0*hargaTotal;
        }
        hargaBayar=(jumlah*hargaSatuan)-diskon;
    }
    
    //Mutators
    public void setNama(String n){
        nama=n;
    }
    public void setHargaSatuan(int hs){
        hargaSatuan=hs;
    }
    public void setJumlah(int j){
        jumlah=j;
    }
        //Accessor Methods
    public String getNama (){
        return nama;
    }
    public int getHargaSatuan (){
        return hargaSatuan;
    }
    public int getJumlah (){
        return jumlah;
    }
    
    //Calculation method that returns the luas and keliling
    public int hitungHargaTotal (){
        return hargaTotal;
    }
    public int hitungDiskon (){
        return diskon;
    }
    public int hitungHargaBayar (){
        return hargaBayar;
    }
}


