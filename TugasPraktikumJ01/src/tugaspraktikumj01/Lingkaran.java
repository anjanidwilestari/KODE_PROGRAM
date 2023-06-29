package tugaspraktikumj01;
public class Lingkaran {
    double phi = 3.14 ;
    double r;
    public double luas;
    public double keliling;
    
    public void luasLingkaran(double r ){
        luas = r*r*phi;
    }
    
    public void kelilingLingkaran(double r){
        keliling=2*phi*r;
    }
    
    public void tampilkanDataLingkaran(){
        System.out.println("Panjang jari-jari Lingkaran: "+r);
        System.out.println("Luas Lingkaran: "+luas);
        System.out.println("Keliling Lingkaran: "+keliling);
    }
}


