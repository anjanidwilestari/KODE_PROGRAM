package belajararray;
import java.util.Scanner;
public class ArrayInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int [] nilaiUAS = new int [6];
	for (int i=0; i< nilaiUAS.length; i++){
            System.out.print ("Masukkan nilai UAS MHS ke- " + i + ": " );
            nilaiUAS [i] = sc.nextInt();
        }
        for (int i=0; i<nilaiUAS.length; i++){
            if (nilaiUAS[i]> 70){
                System.out.println("MAHASISWA ke-" + i + " lulus!" );
            }else {
                System.out.println("MAHASISWA ke-" + i + " tidak lulus!" );    
            }
        }
    }
}

