package minggu5.tugas;

public class NilaiAlgoritma3 {
    String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUTS;
    int nilaiUAS;
    double total = 0;
    
    NilaiAlgoritma3(){ //membuat konstruktor
        
    }
    //membuat konstruktor berparameter
    NilaiAlgoritma3(String nama, int tugas, int kuis, int uts, int uas){
        namaMhs = nama;
        nilaiTugas = tugas;
        nilaiKuis = kuis;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    public double hitungTotalNilai(){ //menghitung total nilai
        return (0.30 * nilaiTugas) + (0.20 * nilaiKuis) + (0.20 * nilaiUTS) + (0.30 * nilaiUAS);
    }
    public void hitungRerata(double rerata){ //menghitung rata rata dari total nilai
        total += rerata;
    }
}
