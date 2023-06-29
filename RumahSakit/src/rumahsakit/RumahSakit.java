package rumahsakit;

import java.time.LocalDate;

public class RumahSakit {
    public static void main(String[] args) {
        Pegawai ani = new Pegawai("1234", "dr. Ani");
        Pegawai bagus = new Pegawai("5678", "Bagus");
        
        Pegawai desi = new Pegawai("7456", "Ns. Desi");
        Pegawai eka = new Pegawai("8970", "Ns. Eka");
        
        Pasien pasien1 = new Pasien("1122", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 18), ani, eka);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 20), bagus, desi);
        
        System.out.println(pasien1.getInfo());
        Pasien pasien2 = new Pasien("3344","Yenny Anggreani");
        System.out.println(pasien2.getInfo());
    }
            
}
