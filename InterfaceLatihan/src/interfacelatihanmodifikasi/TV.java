package interfacelatihanmodifikasi;

public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar (String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }
    @Override
    public void naikkanVolume(){
        System.out.println("Tekan tombol untuk menaikkan volume");
    }
    @Override
    public void turunkanVolume(){
        System.out.println("Tekan tombol untuk menurunkan volume");
    }
    public void showInformasi(){
        System.out.println("TELEEVISI");
        showInfoAlat();
        System.out.println("Jenis Layar TV : "+getJenisLayar());
        System.out.println("Volume saat ini: "+this.volume);
        System.out.println("Cara Menyetel Volume TV :");
        naikkanVolume();
        turunkanVolume();
    }
}
