import java.util.Scanner;
public class Perulangandowhile1{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int angka, fac, i;
    System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
    System.out.print("Masukkan bilangan\t\t\t: ");
    angka = input.nextInt();
    fac=1;
    i=1;
    do
    {
        fac=fac*i;
        i++;
    }
    while (i<=angka);
    System.out.printf("Nilai faktorial bilangan tersebut adalah : %d \n", fac);
    }
}