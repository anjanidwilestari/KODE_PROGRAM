package interfacelatihanmodifikasi;

public abstract class AlatElektronik {
    protected double harga;
    protected String warna;
    protected String merk;

    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void showInfoAlat(){
        System.out.println("Harga unit     : "+getHarga());
        System.out.println("Warna unit     : "+getWarna());
        System.out.println("Merek          : "+getMerk());
        
    }
}
