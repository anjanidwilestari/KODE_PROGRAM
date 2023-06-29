package minggu7;
import java.util.Scanner;
public class Array2DimensiMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah baris: ");
        int x = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int y = in.nextInt();
        int nilai[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Masukkan nilai ke-["+i+"]["+j+"] : ");
                nilai[i][j]=in.nextInt();
            }
        }
        System.out.println("========================================");
        System.out.println("");
        Array2Dimensi array = new Array2Dimensi(nilai,x,y);
        System.out.println("Tampilkan nilai array: ");
        array.tampilData();
        System.out.println("-----------------------------------------");
        System.out.print("Input nilai yang dicari: ");
        int cari = in.nextInt();
        int posisi = array.findSearch(cari);
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan!!");
        }
    }
}
