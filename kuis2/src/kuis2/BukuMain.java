package kuis2;
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
    Buku bk = new Buku();
    Scanner input = new Scanner(System.in);
    char pilih;
    int menu, ulangmenu;
        OUTER:
        do {
            System.out.println("Masukkan Operasi yang diinginkan");
            System.out.println("1. Add Data");
            System.out.println("2. Print");
            System.out.println("3. Peek Position");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println("	");
            if (menu < 1 || menu > 4) {
                System.out.println("Pilin Menu 1 - 4, Pilih Menu Kembali");
            }   while (menu < 1 || menu > 4);
            switch (menu) {
                case 1:
                    do {
                        input.nextLine();
                        System.out.print("Judul Buku\t: ");
                        String judul = input.nextLine();
                        System.out.print("Penerbit Buku\t: ");
                        String penerbit = input.nextLine();
                        System.out.print("Tahun Terbit\t: ");
                        String tahun = input.nextLine();
                        System.out.print("Jumlah Halaman\t: ");
                        String jumhal = input.nextLine();
                        System.out.println("");
                        System.out.print("Apakah Anda akan menambahkan data baru Stack (y/n) : ");
                        pilih = input.next().charAt(0);
                        bk.addData(judul, penerbit, tahun, jumhal);
                        System.out.println("---------------------------------------");
                    } while (pilih == 'y');
                    break;
                case 2:
                    bk.print();
                    break;
                case 3:
                    System.out.print("Masukkan Judul Buku yang dicari : ");
                    String cari = input.next();
                    bk.peekPosition(cari);
                    break;
                default:
                    break OUTER;
            }
        } while (menu > 1 || menu < 4);
    }
}