package tugaspraktikumj03;
public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public String getNomorKTP() {
        return nomorKTP;
    }
    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }
    public void setLimitPeminjaman(double limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }
    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    public void setJumlahPinjaman(double jumlahPeminjaman) {
        this.jumlahPinjaman = jumlahPeminjaman;
    }  
    public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }   
    public void pinjam(double nominalPinjam){
        
        if(nominalPinjam > limitPeminjaman){
            System.out.println("Maaf, Jumlah pinjaman melebihi limit");
        } 
        else {
            setJumlahPinjaman(nominalPinjam);
        }
    }
    public void angsur(double nominal){
        double sisaPinjaman;
        //MODIFIKASI TUGAS SOAL NOMOR 2
        double batas;
        batas = 0.1 * jumlahPinjaman;
        if(nominal<batas){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } else{
            sisaPinjaman = getJumlahPinjaman() - nominal;
            setJumlahPinjaman(sisaPinjaman);
           
        } 
    }
}
