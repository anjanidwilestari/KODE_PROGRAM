package minggu5;
import java.util.Scanner;
public class MainSumModifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int ph = sc.nextInt();
        for (int i=0;i<ph;i++){
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        Sum sm =new Sum (elm);
        System.out.println("====================================================");
        System.out.println("Perusahaan"+(i+1));
        for(int j=0;j<sm.elemen;j++){
            System.out.print("Masukkan untung bulan "+" = ");
            sm.keuntungan[i]=sc.nextDouble();
        }
        System.out.println("====================================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total Keuntungan perusahaan selama " + sm.elemen+" bulan adalah = "+ "%.2f %n", sm.totalBF(sm.keuntungan));
        System.out.println("====================================================");
        System.out.println("Algoritma Devide Conquer");
        System.out.printf("Total Keuntungan perusahaan selama " + sm.elemen+" bulan adalah = "+"%.2f %n", sm.totalDC(sm.keuntungan,0,sm.elemen-1));
        System.out.println(" ");
        }
    }
}


