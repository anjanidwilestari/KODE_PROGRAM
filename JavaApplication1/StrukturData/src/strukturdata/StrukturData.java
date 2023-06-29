package strukturdata;
import java.util.Scanner;
public class StrukturData {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int ntugas, nuts, nuas;
        double nilaiakhir;
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==================================");
    System.out.print("Masukkan Nilai Tugas: ");
    ntugas=sc.nextInt ();
    System.out.print("Masukkan Nilai UTS: ");
    nuts=sc.nextInt ();
    System.out.print("Masukkan Nilai UAS: ");
    nuas=sc.nextInt ();
    System.out.println("==================================");
    System.out.println("==================================");
    nilaiakhir=(0.2*ntugas)+(0.35*nuts)+(0.45*nuas);
    System.out.println("Nilai Akhir : " + nilaiakhir);
        if (nilaiakhir > 80 &&  nilaiakhir <= 100){
            System.out.println("Nilai Huruf : A");
            System.out.println("==================================");
            System.out.println("SELAMAT LULUS");
        } else if (nilaiakhir > 73 &&  nilaiakhir <= 80){
            System.out.println("Nilai Huruf : B+");
            System.out.println("==================================");
            System.out.println("SELAMAT LULUS");
        } else if (nilaiakhir > 65 &&  nilaiakhir <= 73){
            System.out.println("Nilai Huruf : B");
            System.out.println("==================================");
            System.out.println("SELAMAT LULUS");
        } else if (nilaiakhir > 60 &&  nilaiakhir <= 65){
            System.out.println("Nilai Huruf : C+");
            System.out.println("==================================");
            System.out.println("SELAMAT LULUS");
        } else if (nilaiakhir > 50 &&  nilaiakhir <= 60){
            System.out.println("Nilai Huruf : C");
            System.out.println("==================================");
            System.out.println("SELAMAT LULUS");
        } else if (nilaiakhir > 39 &&  nilaiakhir <= 50){
            System.out.println("Nilai Huruf : D");
            System.out.println("==================================");
            System.out.println("TIDAK LULUS");
        } else if (nilaiakhir <= 39){
            System.out.println("Nilai Huruf : E");
            System.out.println("==================================");
            System.out.println("TIDAK LULUS");
        } 
}
}
