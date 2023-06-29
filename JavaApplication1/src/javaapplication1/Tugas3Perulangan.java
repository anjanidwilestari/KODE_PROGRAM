import java.util.Scanner;
public class Tugas3Perulangan{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int i, angka1, angka2, hasil;
    System.out.println("MENAMPILKAN DERET BILANGAN FIBONACCI SERIES");
    System.out.println("===========================================");
    angka1=0;
    angka2=1;
    for (i=1; i<= 10; i++){
        hasil=angka1+angka2;
        System.out.printf("Sum of : %d + %d = %d\n", angka1, angka2, hasil);
        angka1=angka2;
        angka2=hasil;     
        }
    }  
}