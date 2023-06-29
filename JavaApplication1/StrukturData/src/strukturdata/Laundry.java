package strukturdata;
import java.util.Scanner;
public class Laundry {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double kga, kgb, kgc, kgd, diskon1, diskon2, total;
        
        kga=4*4500;
        kgb=15*4500;
        diskon1=0.05*kgb;
        kgc=6*4500;
        kgd=11*4500;
        diskon2=0.05*kgd;
        
        System.out.println("Total Bayar Ani = " + kga);
        System.out.println("Total Bayar Budi = " + (kgb-diskon1));
        System.out.println("Total Bayar Bina = " + kgc);
        System.out.println("Total Bayar Cita = " + (kgd-diskon2));
        total = (kga+(kgb-diskon1)+kgc+(kgd-diskon2));
        int harga=(int) total; 
        System.out.println("Maka Total Pendapatan Hari itu adalah Rp " + harga);
    }
}
