package tugas1praktikumJ07;
public class Lingkaran extends BangunDatar{ 
    public double r;
        public Lingkaran(double r){ this.r= r;
    }
        
    @Override
    public double getLuas() {
        double luas = 3.14 * (r * r); 
        System.out.println("Luas\t: " +luas); 
        return luas;
    }
    
    @Override
    public double getKeliling() { 
        double kell = 2 * 3.14 * r;
        System.out.println("Keliling: " +kell); 
        return kell;
    }
    
    @Override
    public void cetakInfo() { 
        System.out.println("r\t: " +r);
    }
}

