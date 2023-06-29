package tugaspraktikumj02;
public class Sewa {
    public String idSewa;
    public int tglSewa;
    public int tglKembali;
    public int lamaSewa;
    public int hargaGame;
    
    public int hitungHarga(){
        lamaSewa= tglKembali-tglSewa;
        int totalHarga = hargaGame * lamaSewa;
        return totalHarga;
    }
    public void cetakStruk(){
        System.out.println("==========================================");
        System.out.println("            STRUK PEMBAYARAN");
        System.out.println("==========================================");
        System.out.println("Id Sewa \t\t : "+idSewa);
        System.out.println("Tanggal Sewa \t\t : "+tglSewa);
        System.out.println("Batas Pengembalian \t : "+tglKembali);
        System.out.println("Total Harga \t\t : Rp "+hitungHarga()); 
        System.out.println("Denda Telat Pengembalian/Hari \t : Rp 5000");
                
    }
}
