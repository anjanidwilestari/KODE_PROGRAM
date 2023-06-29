import java.util.Scanner;
public class Tugas6Perulangan{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int angka, i, hasil, n, range;
    double rata ;
    hasil=0;
    n=1;
    rata=0;
    System.out.println("MENGHITUNG JUMLAH BILANGAN GENAP DARI N BILANGAN");
    System.out.println("================================================");
    System.out.print("Masukkan range bilangan\t\t: ");
    angka = input.nextInt();
    range = angka/2;
    System.out.println("Banyaknya bilangan genap adalah\t: " + range);
    for (i=1; i <= angka; i++){
        if (i%2==0){      
            System.out.println("Bilangan Genap ke-" + n + " adalah: " + i);
            n++;
            hasil= hasil + i;
            rata= hasil/range;
        }
    }
    System.out.println("Jumlah bilangan genap dari range yang anda masukkan\t= " + hasil);
    System.out.println("Rata-rata bilangan genap dari range yang anda masukkan\t= " + rata);
}
}