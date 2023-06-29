import java.util.Scanner;

public class Pemilihan2{
	public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    int nilai;
    System.out.println("Masukkan nilai ujian (0-100): ");
    nilai=sc.nextInt ();
    if (nilai >= 0 || nilai <= 100) {
        if (nilai >= 90 &&  nilai <= 100){
            System.out.println("Nilai A, EXCELLENT!");
        } else if (nilai >= 80 && nilai <= 89){
            System.out.println("Nilai B, Pertahankan prestasi Anda!");
        } else if (nilai >= 60 && nilai <= 79){
            System.out.println("Nilai C, Tingkatkan prestasi Anda!");
        } else if (nilai >= 50 && nilai <= 59){
            System.out.println("Nilai D, Tingkatkan belajar Anda!");
        } else {
            System.out.println("Nilai E, Anda tidak lulus!");    
        }
    } else {
        System.out.println("Nilai yang Anda masukkan tidak valid");
    }
    }
}