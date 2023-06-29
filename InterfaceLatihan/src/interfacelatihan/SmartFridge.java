package interfacelatihan;
public class SmartFridge extends Kulkas{
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super (jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }
}