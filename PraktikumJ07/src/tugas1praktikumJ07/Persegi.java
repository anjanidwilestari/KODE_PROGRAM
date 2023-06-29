package tugas1praktikumJ07;
public class Persegi extends BangunDatar{ 
    public double sisi;

    public Persegi(double sisi){ 
        this.sisi = sisi;
    }

    @Override
    public double getLuas() { 
        double luas = sisi * sisi;
        System.out.println("Luas\t: " +luas); 
        return luas;
    }

    @Override
    public double getKeliling() { 
        double kell = 4 * sisi;
        System.out.println("Keliling: " +kell); 
        return kell;
    }
    @Override
    public void cetakInfo() { 
        System.out.println("Sisi\t: " + sisi);
    }
}


