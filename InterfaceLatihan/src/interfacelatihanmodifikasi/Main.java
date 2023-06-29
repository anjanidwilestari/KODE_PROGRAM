package interfacelatihanmodifikasi;
public class Main {
        public static void main (String[] args){
        System.out.println("========================================");
        System.out.println("              Toko Elektro");
        System.out.println("========================================");  
        
        TV t = new TV ("Retina HDR Ultra", 50, 5000000, "Hitam", "Starsple");
        t.showInformasi();
        System.out.println(" ");
        Kipas k = new Kipas ("Kipas Duduk", 3000000, "Putih", "Masterlion");
        k.showInformasi();
        System.out.println(" ");
        Kulkas ku = new Kulkas (2, 6000000, "Merah", "LifeG");
        ku.showInformasi();
        System.out.println(" ");
        SmartFridge sf = new SmartFridge(80, 4, 9000000, "Silver", "Panafast");
        sf.showInformasi();
        
}
}
