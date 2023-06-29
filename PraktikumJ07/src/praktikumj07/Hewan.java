package praktikumj07;
public abstract class Hewan {
    public double berat;
    public String makanan;
    public String habitat;
    public int umur;

    public abstract void bergerak();
    
    public abstract void bernapas();
    
    public void bertambahUmur(){
        this.umur += 1;
    }
 
    public Hewan(double berat, String makanan, String habitat, int umur){
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
        this.umur = umur;
    }
 
    public void cetakInfo(){
        System.out.println("Berat\t\t: " +this.berat);
        System.out.println("Makanan\t\t: " +this.makanan);
        System.out.println("Habitat\t\t: " +this.habitat);
        System.out.println("Umur\t\t: " +this.umur);
    }
}
