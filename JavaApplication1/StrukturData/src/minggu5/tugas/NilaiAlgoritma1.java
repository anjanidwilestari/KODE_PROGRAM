package minggu5.tugas;
public class NilaiAlgoritma1 {
    String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUTS;
    int nilaiUAS;
    double total = 0;
    
    NilaiAlgoritma1(){
    }
    NilaiAlgoritma1(String nama, int tugas, int kuis, int uts, int uas){
        namaMhs = nama;
        nilaiTugas = tugas;
        nilaiKuis = kuis;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    void tampilNilai(){
    System.out.println("Nama Mahasiswa  = "+namaMhs);
    System.out.println("Nilai Tugas     = "+nilaiTugas);
    System.out.println("Nilai Kuis      = "+nilaiKuis);
    System.out.println("Nilai UTS       = "+nilaiUTS);
    System.out.println("NIlai UAS       = "+nilaiUAS);
}
    public double hitungTotalNilai(){ //menghitung total nilai
        return (0.30 * nilaiTugas) + (0.20 * nilaiKuis) + (0.20 * nilaiUTS) + (0.30 * nilaiUAS);
    }
}
