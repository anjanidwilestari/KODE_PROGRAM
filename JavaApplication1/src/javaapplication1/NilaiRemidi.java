import java.util.Scanner;

public class NilaiRemidi {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        double NA, nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        System.out.print("Masukkan Nilai Tugas\t : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis\t : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS\t : ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS\t : ");
        nilaiUas = sc.nextDouble();
        
        NA = (0.2 * nilaiTugas) + (0.1 * nilaiKuis) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
        System.out.println ("Nilai Akhir Mata Kuliah Dasar Pemograman : " + NA);
        if (NA < 65){
            System.out.print("Silahkan Anda mengikuti program remidi");
        }
        else {
            System.out.print("Anda tidak perlu mengikuti program remidi");
        }             
    }
}