package jobsheet6;
public class Tiket {
    String maskapai;
    int harga;
    String asal;
    String tujuan;
    
    Tiket (String m, int h, String a, String t){
        maskapai=m;
        harga=h;
        asal=a;
        tujuan=t;
    }
    void tampilAll(){
        System.out.println("Maskapai      = "+maskapai);
        System.out.println("Harga         = "+harga);
        System.out.println("Asal Negara   = "+asal);
        System.out.println("Tujuan Negara = "+tujuan);
    }
}
