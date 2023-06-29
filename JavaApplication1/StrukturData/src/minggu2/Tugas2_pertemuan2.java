package minggu2;
import java.util.Scanner;
public class Tugas2_pertemuan2 {
    static int hitungpeminjaman(int jumlah, int harga, int sewa){
        int bayar = jumlah*harga*sewa;
        return bayar;
    }
    public static void main(String[] args) {
        int jumlah,sewa;
        int harga=5000;
        Scanner in = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("       Toko Persewaan Video Game");
        System.out.println("======================================");
        System.out.println("Happy hunting for your lovely game!");
        System.out.println(" ");
        System.out.print("Member id : ");
        String id=in.nextLine();
        System.out.print("Nama anda : ");
        String member=in.nextLine();
        System.out.print("Nama game : ");
        String game=in.nextLine();         
        System.out.print("Jumlah game yang disewa : ");
        jumlah =in.nextInt();
        System.out.print("Durasi sewa game (hari) : ");
        sewa =in.nextInt();
        System.out.println("Total Bayar Sewa Game Sejumlah Rp "+hitungpeminjaman(jumlah,harga,sewa));
    }
}
