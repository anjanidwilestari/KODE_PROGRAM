package rumahsakit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;//membuat kantong atau container yang akan diisi oleh himounan konsultasi
    
    
    public Pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>();
        
    }
    
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getInfo(){
        String info = "";
        info += "No Rekam Medis    : "+this.noRekamMedis+"\n";
        info += "Nama              : " + this.nama + "\n";
        info += "\n";
        
        if (!riwayatKonsultasi.isEmpty()){
            info += "Riwayat konsultasi : \n";
            Collections.reverse(riwayatKonsultasi);
               for (Konsultasi konsultasi : riwayatKonsultasi){
               info += konsultasi.getInfo();
           }
        } else {
            info += "Belum ada riwayat konsultasi ";
        }
        info += "\n";
        
        return info;
    }
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat){
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
        
    }
}
