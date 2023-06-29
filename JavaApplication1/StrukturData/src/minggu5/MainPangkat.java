package minggu5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Pangkat []png=new Pangkat [4];
        png[0]=new Pangkat();
        png[0].nilai=9;
        png[0].pangkat=3;
        png[1]=new Pangkat();
        png[1].nilai=8;
        png[1].pangkat=3;
        png[2]=new Pangkat();
        png[2].nilai=7;
        png[2].pangkat=3;
        png[3]=new Pangkat();
        png[3].nilai=6;
        png[3].pangkat=3;
        System.out.println("Menu pilihan metode perhitungan");
        System.out.println("1. Brute Force");
        System.out.println("2. Devide and Conquer");
        System.out.println("Masukkan angka menu : ");
        int m=sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("====================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for(int i=0; i<4; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }   break;
            case 2:
                System.out.println("====================================================");
                System.out.println("Hasil Pangkat dengan Devide and Conquer");
                for(int i=0; i<4; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }   System.out.println("====================================================");
                break;
            default:
                System.out.println("Menu pilihan Anda tidak tersedia");
                break;
        }
    }
}
    