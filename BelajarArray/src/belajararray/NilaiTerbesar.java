package belajararray;
import java.util.Scanner;
public class NilaiTerbesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        System.out.print("Masukkan baris : ");
        baris = in.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = in.nextInt();
        int[][] nilai = new int[baris][kolom];
        String [][] nama=new String[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Nama pada tempat duduk [" + i + "][" + j + "] : ");
                nama[i][j] = input.nextLine();
                System.out.print("Nilai [" + i + "][" + j + "] : ");
                nilai[i][j] = in.nextInt();
            }
        System.out.println("");
        }   
        
        int max = nilai[0][0];
        int min = nilai[0][0];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                } 
            }
        }
        System.out.print("Nilai Terbesar : " + max);
        System.out.print("\nPosisi nilai max berada di");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (nilai[i][j] == max) {
                    System.out.print(" Array[" + i + "][" + j + "]");
                }
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (nilai[i][j] < min) {
                    min = nilai[i][j];
                }
            }
        }
        System.out.print("\nNilai Terkecil : " + min);
        System.out.print("\nPosisi nilai min berada di");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (nilai[i][j] == min) {
                    System.out.print(" Array[" + i + "][" + j + "]");
                }
            }
        }
    }
}