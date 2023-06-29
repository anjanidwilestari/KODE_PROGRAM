package sistempenggajian;
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public Posisi posisiPegawai;
    public int jumlahHariMasuk;
    
    public double getTotalGaji(){
        double totalGaji=posisiPegawai.gajiPokok + jumlahHariMasuk * posisiPegawai.uangMakanPerHari;
        return totalGaji;
    }
    public void cetakInfoPegawai(){
        System.out.println("Nama : "+nama);
        System.out.println("NIP : "+nip);
        System.out.println("Alamat : "+alamat);
        System.out.println("Posisi : "+posisiPegawai.nama);
        System.out.println("Gaji : "+getTotalGaji());
    }
}
