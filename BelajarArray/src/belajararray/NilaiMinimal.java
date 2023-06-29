package belajararray;
import java.util.Scanner;
public class NilaiMinimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int baris, kolom, min;
        System.out.print("Masukkan baris : ");
        baris = in.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = in.nextInt();
        int[][] nilai = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Array [" + i + "][" + j + "] : ");
                nilai[i][j] = in.nextInt();
            }
            System.out.println("");
        }      
        System.out.println("Menu");
        System.out.println("a. Nilai Min");
        System.out.println("b. Nilai Minimal dan Jumlah");
        System.out.println("c. Kondisi Array");
        System.out.print("Masukkan pilihan menggunakan abjad : ");
        String pilihan = input.nextLine();
        switch (pilihan) {
            case "a":
                min = nilai[0][0];
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (nilai[i][j] < min) {
                            min = nilai[i][j];
                        }
                    }
                }
                System.out.println("Nilai Terkecil : " + min);
                break;
            case "b":
                min = nilai[0][0];
                int x = 0;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (nilai[i][j] < min) {
                            min = nilai[i][j];
                        }
                    }
                }
                System.out.print("Nilai Terkecil : " + min);
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (nilai[i][j] == min) {
                            x++;
                        }
                    }
                }
                System.out.print("\nJumlah Nilai Terkecil : " + x);
                System.out.print("\nPosisi nilai min berada di");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (nilai[i][j] == min) {
                            System.out.print(" Array[" + i + "][" + j + "]");
                        }
                    }
                }
                break;
            case "c":
                boolean hasil = false;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (nilai[i][j] == 50) {
                            hasil = true;
                        }
                    }
                }
                System.out.println("Apakah ada isi array yang bernilai 50?");
                if (hasil == true) {
                    System.out.println("Ada");
                } else {
                    System.out.println("Tidak Ada");
                }
                break;
        default:
                System.out.println("masukkan salah");
        }
    }
}
    
