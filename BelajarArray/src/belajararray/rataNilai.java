package belajararray;
import java.util.Scanner;
public class rataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int [] nilaiMHS = new int [10];
        double total1, total2, lulus, tidakLulus;
        total1=0;
        total2=0;
        lulus=0;
        tidakLulus=0;
        double rata1, rata2;
        rata1=0;
        rata2=0;
        int mahasiswa;
        System.out.print ("Masukkan jumlah Mahasiswa : ");
            mahasiswa = sc.nextInt();
        for (int i=0; i<mahasiswa ; i++){
            System.out.print ("Masukkan nilai Mahasiswa ke-" + (i+1) + ": " );
            nilaiMHS [i] = sc.nextInt();
        }
        for (int i=0; i< mahasiswa; i++){
            if (nilaiMHS[i] > 70){
                total1 +=nilaiMHS[i];
                lulus++;
            }else{
                total2 +=nilaiMHS[i];
                tidakLulus++;
            } 
        } 
        rata1 = total1 / lulus ;
        rata2=total2/ tidakLulus;
        System.out.println("nilai rata-rata lulus =" + rata1);             
        System.out.println("nilai rata-rata tidak lulus =" + rata2);
    }
}
