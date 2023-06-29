package belajararray;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int [] nilaiMHS = new int [10];
        double total;
        total=0;
        double rata;
        rata=0;
        for (int i=0; i< nilaiMHS.length; i++){
            System.out.print ("Masukkan nilai Mahasiswa ke-" + (i+1) + ": " );
            nilaiMHS [i] = sc.nextInt();
        }
        for (int i=0; i< nilaiMHS.length; i++){ 
            total += nilaiMHS[i];
        }     
        rata = total /nilaiMHS.length;
        System.out.println("nilai rata-rata kelas =" + rata);
    } 
}
