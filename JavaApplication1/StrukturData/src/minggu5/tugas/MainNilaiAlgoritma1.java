package minggu5.tugas;
public class MainNilaiAlgoritma1 {
    public static void main(String[] args) {
        NilaiAlgoritma1 na = new NilaiAlgoritma1("Anjani", 90, 80, 70, 60);
        na.tampilNilai();
        double nilaiTotal=na.hitungTotalNilai();
        System.out.println("Total NIlai Mahasiswa = "+nilaiTotal);
        }
}
