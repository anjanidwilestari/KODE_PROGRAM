package minggu2;
public class GameMain {
    public static void main(String[] args) {
    Game gm = new Game("123456789", "Anjani Dwilestari", "GTA 5", 5, 5000);
    gm.tampilBarang();
    int hargaTotal=gm.hitungHargaTotal();
    System.out.println("Harga Sewa Game = "+hargaTotal);
    }   
}
