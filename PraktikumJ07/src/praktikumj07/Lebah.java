package praktikumj07;
public class Lebah extends Hewan{
    public String kasta;
    
    @Override
    public void bergerak() {
        System.out.println("Lebah terbang dengan sayap");
    }
    
    @Override
    public void bernapas() {
        System.out.println("Lebah bernapas menggunakan trakea");
    } 
    
    public Lebah(double berat, String makanan, String habitat, int umur, String kasta){
        super(berat, makanan, habitat, umur);
        this.kasta = kasta;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kasta\t\t: " +this.kasta);
    }
}
