package minggu3;
import java.util.Scanner;
public class Tanah {
    public int panjang;
    public int lebar;
    
    public Tanah(int p, int l){
        panjang=p;
        lebar=l;
    }
    public int hitungLuas(){
        return panjang*lebar;
    }
}

