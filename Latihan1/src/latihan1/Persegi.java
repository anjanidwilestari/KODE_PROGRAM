package latihan1;
public class Persegi {
    public int sisi;
    public int luas;
    public int keliling;
    
    public void luasPersegi(int sisi){
        luas = sisi*sisi;
    }
    
    public void kelilingPersegi(int sisi){
        keliling=4*sisi;
    }
    
    public void data(){
        System.out.println("Panjang sisi persegi: "+sisi);
        System.out.println("Luas persegi: "+luas);
        System.out.println("Keliling persegi: "+keliling);
    }
}


