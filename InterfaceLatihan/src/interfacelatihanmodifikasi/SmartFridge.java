package interfacelatihanmodifikasi;

public class SmartFridge extends Kulkas implements Audible{
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super (jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }
    @Override
    public void naikkanVolume(){
        System.out.println("Tekan tombol untuk menaikkan volume");
    }
    @Override
    public void turunkanVolume(){
        System.out.println("Tekan tombol untuk menurunkan volume");
    }
    @Override
    public void showInformasi(){
        System.out.println("KULKAS PINTAR");
        showInfoAlat();
        System.out.println("Volume saat ini: "+this.volume);
        System.out.println("Cara Menyetel Volume Kulkas Pintar :");
        naikkanVolume();
        turunkanVolume();
    }
}