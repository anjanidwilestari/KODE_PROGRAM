package minggu3new;
public class Kerucut {
    double phi;
    double jari;
    double sisi;
    double tinggi;

    public double hitungLuas (){
        return phi*jari*(sisi+jari);
    } 
    public double hitungVolume(){
        return phi*jari*jari*tinggi/3;
    } 
}    
