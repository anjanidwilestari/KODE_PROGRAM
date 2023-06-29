import java.util.Scanner;
public class Tugas2Perulangan{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int angka, i, hasil ;
    hasil=0;
    System.out.println("MENGHITUNG JUMLAH BILANGAN GENAP DARI N BILANGAN");
    System.out.print("Masukkan range bilangan : ");
    angka = input.nextInt();
    
    for (i=1; i <= angka; i++){
        if (i%2==0){
            
            System.out.print(i+" ");
            hasil= hasil + i;
            System.out.print(hasil);

        }
    }
}
}  