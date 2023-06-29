import java.util.Scanner;

public class Percobaan2{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double nilai1, nilai2, rataRata;

    System.out.println("Masukkan Nilai Pertama:");
    nilai1=sc.nextInt ();
    System.out.println("Masukkan Nilai Kedua:");
    nilai2=sc.nextInt ();

    rataRata=(nilai1+nilai2)/2;

    if(rataRata>=100){
        rataRata-=5;
    }
    else{
        rataRata=rataRata;
    }
    System.out.println("Hasil Nilai Akhir Adalah " +rataRata);
    }
}