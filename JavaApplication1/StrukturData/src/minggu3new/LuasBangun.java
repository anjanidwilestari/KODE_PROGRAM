package minggu3new;
import java.util.Scanner;
public class LuasBangun {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Kerucut [] kr = new Kerucut[1];
        for(int i=0;i<1;i++){
            kr[i]=new Kerucut();
            System.out.println("~Bangun 1 Kerucut~");
            System.out.print("Phi\t   = ");
            kr[i].phi=sc.nextDouble();
            System.out.print("Jari-jari  = ");
            kr[i].jari=sc.nextDouble();
            System.out.print("Sisi\t   = ");
            kr[i].sisi=sc.nextDouble();
            System.out.print("Tinggi\t   = ");
            kr[i].tinggi=sc.nextDouble();
        }
        for(int i=0;i<1;i++){
             System.out.println("Luas Permukaan  = "+ kr[i].hitungLuas());
             System.out.println("Volume\t\t= "+ kr[i].hitungVolume());
        }
        
        Balok [] bl = new Balok[1];
        for(int i=0;i<1;i++){
            bl[i]=new Balok();
            System.out.println("\n");
            System.out.println("~Bangun 2 Balok~");
            System.out.print("Panjang\t = ");
            bl[i].p=sc.nextInt();
            System.out.print("Lebar\t = ");
            bl[i].l=sc.nextInt();
            System.out.print("Tinggi\t = ");
            bl[i].t=sc.nextInt();
        }
        for(int i=0;i<1;i++){
             System.out.println("Luas Permukaan  = "+ bl[i].hitungLuas());
             System.out.println("Volume\t\t= "+ bl[i].hitungVolume());
        }
        Kubus [] kb = new Kubus[1];
        for(int i=0;i<1;i++){
            kb[i]=new Kubus();
            System.out.println("\n");
            System.out.println("~Bangun 3 Kubus~");
            System.out.print("Sisi\t = ");
            kb[i].s=sc.nextInt();
        }
        for(int i=0;i<1;i++){
             System.out.println("Luas Permukaan  = "+ kb[i].hitungLuas());
             System.out.println("Volume\t\t= "+ kb[i].hitungVolume());
        }                

    }
    
}
