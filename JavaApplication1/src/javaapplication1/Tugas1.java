import java.util.Scanner;

public class Tugas1{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    int angka1, angka2;
    
    //program menentukan bilangan bulat yang terbesar
    System.out.print("Masukkan angka pertama: ");
    angka1=sc.nextInt();
    System.out.print("Masukkan angka kedua: ");
    angka2=sc.nextInt();

    if (angka1>angka2){
        System.out.print("Angka pertama memiliki nilai terbesar");
    }
    else if (angka2>angka1){
        System.out.print("Angka kedua memiliki nilai terbesar");
    }
    
   
}
}