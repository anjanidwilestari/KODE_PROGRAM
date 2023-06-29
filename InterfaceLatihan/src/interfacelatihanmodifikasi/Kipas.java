package interfacelatihanmodifikasi;

public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis (String jenis) {
        this.jenis = jenis;
    }
    public void showInformasi(){
        System.out.println("KIPAS");
        showInfoAlat();
        System.out.println("Jenis Unit     : "+getJenis());
    }
}
