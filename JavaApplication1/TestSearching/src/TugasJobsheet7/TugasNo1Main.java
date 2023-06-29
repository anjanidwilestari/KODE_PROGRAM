package TugasJobsheet7;
import java.util.Scanner;
public class TugasNo1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("----- SOAL NO 1 -----");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        
        int ukuran = kalimat.length();
        TugasNo1 s1 = new TugasNo1 (ukuran, kalimat);
        
        s1.konversi(kalimat);
        s1.print();

    }
}

