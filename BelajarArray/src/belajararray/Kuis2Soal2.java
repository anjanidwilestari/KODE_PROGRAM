package belajararray;
//Anjani Dwilestari
//TI 1E/06
import java.util.Scanner;
public class Kuis2Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int [][] n = new int [5][4];
        double total;
        total=0;
        double rata;
        rata=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("nilai mahasiswa [" + i + "][" + j + "] : ");
                n[i][j] = sc.nextInt();
            }
            System.out.println("");
        }      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
            total += n[i].length;
        }     
        rata = total /4;
        System.out.println("nilai rata-rata mahasiswa ke-" +i+ " = " + rata);
    } 
}
}