package fungsi;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double r, luas, keliling;
        double phi = 3.14;
        System.out.print ("Masukkan jari-jari : ");
        r=in.nextDouble();
        
        luas = (phi*r*r);
        System.out.println("Luas Lingkaran adalah " + luas);
        keliling=(2*phi*r);
        System.out.println("Keliling Lingkaran adalah "+keliling);
    }
    static int hitungLuas(int phi, int r){
        int Luas = phi*r*r;
        return Luas;
    }
    static int hitungKeliling(int phi, int a, int r){
        int keliling = hitungLuas(r,r)*phi;
        return keliling;
    }
}
