package tugas1praktikumJ07;
public class PersegiPanjang extends BangunDatar{ 
    public double panjang;
    public double lebar;

    public PersegiPanjang(double panjang, double lebar){ 
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double getLuas() {
        double luas = panjang * lebar; 
        System.out.println("Luas\t: " +luas); 
        return luas;
    }

    @Override
    public double getKeliling() {
        double kell = 2 * (panjang + lebar); 
        System.out.println("Keliling: " +kell); 
        return kell;
    }

    @Override
    public void cetakInfo() { 
        System.out.println("Panjang\t: " +panjang); 
        System.out.println("Lebar\t: " +lebar);
    }
}

