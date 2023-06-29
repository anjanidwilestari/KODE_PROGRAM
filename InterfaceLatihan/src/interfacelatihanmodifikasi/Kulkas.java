package interfacelatihanmodifikasi;

public class Kulkas extends AlatElektronik{
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void showInformasi(){
        System.out.println("KULKAS");
        showInfoAlat();
        System.out.println("Jumlah Pintu   : "+getJumlahPintu());
    }
}