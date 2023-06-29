package Collection.Tugas2;
public class Nilai {
    String kdnilai;
    String kdmatakuliah;
    String nim;
    Float nilai;

    public Nilai() {
    }

    Nilai(String kdnilai, float nilai, String kdmatakuliah, String nim) {
    this.kdnilai = kdnilai;
    this.nilai = nilai;
    this.kdmatakuliah = kdmatakuliah;
    this.nim = nim;
    }
}
