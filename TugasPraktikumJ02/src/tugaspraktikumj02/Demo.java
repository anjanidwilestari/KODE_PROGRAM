package tugaspraktikumj02;
public class Demo {
    public static void main(String[] args){
        Game gme = new Game();
        gme.idGame="GM991";
        gme.namaGame="GTA 5";
        gme.hargaGame=25000;
        
        Member mb = new Member();
        mb.idMember="MEMBER01";
        mb.nama="Anjani";
        mb.noHp="088233444777";
        mb.alamat="Pasuruan";
        
        Sewa sw = new Sewa();
        sw.idSewa="SEWA120921";
        sw.tglSewa=12;
        sw.tglKembali=17;
        sw.hargaGame=25000;
        
        System.out.println("==========================================");
        System.out.println("            DETAIL SEWA GAME");
        System.out.println("==========================================");
        System.out.println("Informasi Member yang Menyewa Game");
        mb.getMember();
        System.out.println(" ");
        System.out.println("Informasi Game yang Disewa");
        gme.getGame();
        gme.getHargaGame();
        System.out.println(" ");
        System.out.println("Informasi Biaya Sewa");
        System.out.println("Biaya yang harus Anda bayar sebesar RP "+sw.hitungHarga());
        System.out.println(" ");
        sw.cetakStruk();
        
        
    }
}
