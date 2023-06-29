package TugasJobsheet7;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tugas2 st = new Tugas2(8);
        boolean ulang = true;
        while (ulang == true) {

            System.out.print("=============================================");
            System.out.print("\n=              Menu Pilihan                =");
            System.out.print("\n=1.Push() sebanyak Struk yang diinginkan   =");
            System.out.print("\n=2.Pop() sebanyak 5 kali                   =");
            System.out.print("\n=3.Print()                                 =");
            System.out.print("\n============================================");
            System.out.print("\nMasukkan pilihan   : ");
            int pil = sc.nextInt();
            if (pil == 1) {
                System.out.print("Masukkan banyak Struk   : ");
                int djf = sc.nextInt();
                for (int i = 0; i < djf; i++) {
                    System.out.print("No.Transaksi      : ");
                    String no = sc.next();
                    System.out.print("Tanggal Pembelian : ");
                    String tgl = sc.next();
                    System.out.print("Jumlah barang     : ");
                    int jmlh = sc.nextInt();
                    System.out.print("Total Barang      : ");
                    int total = sc.nextInt();
                    Tugas2 del = new Tugas2(no, tgl, jmlh, total);
                    st.push(del);
                }

            } else if (pil == 2) {
                st.pop();
                st.pop();
                st.pop();
                st.pop();
                st.pop();
            } else if (pil == 3) {
                st.print();
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia");
                break;
            }
        }
    }
}
    
