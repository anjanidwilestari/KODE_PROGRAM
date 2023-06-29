package minggu2;
public class BaranggMain {
    public static void main(String[] args) {
     //Instantiates a Barangg object
        Barangg bg = new Barangg(16000, 8);
        
        //Sets linkaran info
        bg.setNama("Ice Cream");
        
        //Get lingkaran info
        System.out.println("Perhitungan Total Bayar : " + "\n" + 
                "Nama Barang   = " + bg.getNama()+ "\n"+
                "Jumlah Barang = " + bg.getJumlah() +  "\n"+
                "Harga satuan  = " + bg.getHargaSatuan()+  "\n"+
                "Harga Total   = " + bg.hitungHargaTotal() +  "\n"+
                "Harga Diskon  = " + bg.hitungDiskon() +  "\n" +
                "Harga Bayar   = " + bg.hitungHargaBayar() +  "\n");
         
    }
}
