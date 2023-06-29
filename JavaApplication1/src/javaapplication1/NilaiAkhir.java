import java.util.Scanner;

public class NilaiAkhir {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        final double tu = 0.2, ku = 0.2, uts = 0.3, uas = 0.3;
        double NA, nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUas = sc.nextDouble();
        
        NA = (tu * nilaiTugas) + (ku * nilaiKuis) + (uts * nilaiUts) + (uas * nilaiUas);
        
        System.out.print ("Nilai Akhir Mata Kuliah Dasar Pemograman : " + NA);    
    }
}