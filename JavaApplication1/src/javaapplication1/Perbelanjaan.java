import java.util.Scanner;
public class Perbelanjaan{
	public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    double pengiriman, harga, total;
    String nama;
    double biayaPengiriman=0; 
     
    System.out.print("Masukkan nama makanan\t : ");
    nama=sc.nextLine ();
    System.out.print("Masukkan harga makanan\t : ");
    harga=sc.nextInt();
    System.out.print("Apakah Anda ingin pengiriman ekspress (1 = ya, 0 = tidak) ? ");
    pengiriman=sc.nextInt();
    if (pengiriman==0) {
        if (harga < 100000){
            biayaPengiriman = 20000;
        } else if (harga >= 100000){
            biayaPengiriman = 30000; 
        }
    }
    if (pengiriman==1) {
        if (harga < 100000){
            biayaPengiriman = 45000;
        } else if (harga >= 100000){
            biayaPengiriman = 55000; 
        }
    }
        total = harga + biayaPengiriman;
        System.out.print(nama); 
        System.out.print("\t\tRp " +harga);
        System.out.print("\nBiaya Pengiriman\tRp " + biayaPengiriman);
        System.out.print("\nTOTAL\t\t\tRp " +total );
    }
}