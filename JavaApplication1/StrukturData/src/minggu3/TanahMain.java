package minggu3;
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Jumlah Tanah: ");
        n= sc.nextInt();
        Tanah[]tnh = new Tanah[n];
        for(int i=0;i<n;i++){
            tnh[i]= new Tanah();
            System.out.println("Tanah ke-"+i);
            System.out.print("Masukkan panjang: ");
            tnh[i].panjang=sc.nextInt();
            System.out.print("Masukkan lebar: ");
            tnh[i].lebar=sc.nextInt();
        }
        for(int i=0;i<n;i++){
             System.out.println("Persegi Panjang ke-"+i);
             System.out.println("Panjang: "+tnh[i].hitungLuas());
        }
    }
}
