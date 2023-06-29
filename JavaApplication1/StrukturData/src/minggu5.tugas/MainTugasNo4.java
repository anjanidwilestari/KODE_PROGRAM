package minggu5.tugas;
import java.util.Scanner;
public class MainTugasNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyak Suara : ");
        int jumlah = input.nextInt();
        TugasNo4 al = new TugasNo4(jumlah);
        input.nextLine();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama/Suara ke-" + (i + 1) + " = ");
            al.kandidat[i] = input.nextLine();
        }
        int hasil = al.cariMayoritas(al.kandidat, 0, jumlah, 0);
        System.out.println("Mayoritas jumlah suara adalah : " + al.kandidat[hasil]);
    }
}
