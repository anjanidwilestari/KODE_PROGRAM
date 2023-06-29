package tugasinterface;
public class Main {
    public static void main (String[] args){
        LabaLaba l = new LabaLaba("Laba-laba Tarantula", 8, 8, 2);
        l.tampilkanData();
        System.out.println( );
        Kambing k = new Kambing("Kambing Etawa", 2, 4, 2);
        k.tampilkanData();
        System.out.println( );
        Ayam a = new Ayam("Ayam Cemani", 2, 2, "Hitam");
        a.tampilkanData();
    }
}
