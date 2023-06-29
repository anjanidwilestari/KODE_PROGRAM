package belajararray;
import java.util.Scanner;
public class NilaiTerbesarBarisKolom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Array ke-[" + i + "][" + j + "] : ");
                nilai[i][j] = sc.nextInt();
            }
        System.out.println("");
        }
        int i;
        for (i = 0; i <5 ; i++){
            int j;
            int kolom = 0;
            for (j = 0; j < 3; j++){
                if (kolom <nilai[j][i]) {
                    kolom=nilai[j][i]; 
                }
            }
        System.out.println("Nilai terbesar kolom ke-" + i + " :" + kolom);
        }
        System.out.println(" ");
        for (i = 0; i < 3; i++) {
            int j;
            int baris =0;
            for (j = 0; j < 5; j++) {
                if (baris < nilai[i][j]) {
                    baris = nilai[i][j];
                }
            }
        System.out.println("Nilai terbesar baris ke-" + i + " :" + baris);
        }
    }
}