import java.util.Scanner;
public class Tugas1Perulangan{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int angka, i;
    System.out.println("=====ANGKA YANG TERMASUK KELIPATAN 5 MAKA AKAN DILOMPATI=====");
    System.out.print("Masukkan angka : ");
    angka = input.nextInt();
    
    for (i=1; i <= angka; i++){
        if (i%5==0){
            continue;
        }else {
            System.out.println(i);
        }
    }
}
}  