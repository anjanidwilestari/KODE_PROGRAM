package tugas1praktikumJ07;
public class BangunDatarDemo {
    public static void main (String[] args){ 
        System.out.println("=============================");
        System.out.println("            PERSEGI");
        System.out.println("=============================");
        Persegi persegi1 = new Persegi(7); 
        persegi1.cetakInfo(); persegi1.getLuas(); 
        persegi1.getKeliling(); System.out.println();
        
        System.out.println("=============================");
        System.out.println("        PERSEGI PANJANG");
        System.out.println("=============================");
        PersegiPanjang perpan = new PersegiPanjang(8, 12); 
        perpan.cetakInfo();
        perpan.getLuas(); perpan.getKeliling(); 
        System.out.println();
        
        System.out.println("=============================");
        System.out.println("           LINGKARAN");
        System.out.println("=============================");
        Lingkaran lingkaran1 = new Lingkaran(5); 
        lingkaran1.cetakInfo(); 
        lingkaran1.getLuas(); 
        lingkaran1.getKeliling();
    }
}
