package Collection.Tugas1;
import java.util.Stack;
import java.util.Scanner;
public class MainTugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Buku> del = new Stack<>();
        boolean ulang = true;
        while (ulang == true) {

            System.out.println("==========================");
            System.out.println("= Data Buku Perpustakaan =");
            System.out.println("=1.Entry Judul Buku      =");
            System.out.println("=2.Ambil Buku Teratas    =");
            System.out.println("=3.Cek Buku Teratas      =");
            System.out.println("=4.Info Semua Judul Buku =");
            System.out.println("=5.Keluar                =");
            System.out.println("==========================");
            System.out.print("\nMasukkan pilihan   : ");
            int pil = sc.nextInt();
            if (pil == 1) {
                char pilih;
                do {
                    System.out.print("Isbn          : ");
                    String isbn = sc.next();
                    System.out.print("Judul         : ");
                    String judul = sc.next();
                    System.out.print("Terbit        : ");
                    sc.nextLine();
                    String tahun = sc.nextLine();
                    System.out.print("Penerbit      : ");
                    String penerbit = sc.next();

                    Buku bk = new Buku(isbn, judul, tahun, penerbit);
                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    del.push(bk);
                } while (pilih == 'y');
            } else if (pil == 2) {
                del.pop();
                System.out.println("=====================================");
                System.out.println("Buku paling atas berhasil terambil:) ");
                System.out.println("=====================================");

            } else if (pil == 3) {
                System.out.println("============================================");
                System.out.println("Buku{" + "Isbn=" + (del.get(del.size() - 1).isbn) + ", " + "Judul="
                        + (del.get(del.size() - 1).judul) + ", " + "Terbit=" + (del.get(del.size() - 1).terbit)
                        + ", " + "Penerbit=" + (del.get(del.size() - 1).penerbit) + '}');
                System.out.println("============================================");
            } else if (pil == 4) {
                System.out.println("============================================");
                del.stream().forEach(d -> {
                    System.out.println("Buku{" + "Isbn=" + d.isbn + ", " + "Judul="
                            + d.judul + ", " + "Terbit=" + d.terbit + ", " + "Penerbit=" + d.penerbit + '}');
                });
                System.out.println("============================================");
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia");
                break;
            }
        }
    }
}
   