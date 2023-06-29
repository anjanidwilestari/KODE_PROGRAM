package tugaspraktikumj01;
public class Segitiga {
    public double sisi1, sisi2, sisi3, tinggi, alas;
    public double luas;
    public double keliling;
    
    public void luasSegitiga(double alas,double tinggi ){
        luas = (0.5)*alas*tinggi;
    }
    
    public void kelilingSegitiga(double sisi1,double sisi2,double sisi3){
        keliling=sisi1+sisi2+sisi3;
    }
    
    public void tampilkanDataSegitiga(){
        System.out.println("Panjang sisi-sisi Segitiga: "+sisi1+", "+sisi2+", "+sisi3);
        System.out.println("Tinggi Segitiga: "+tinggi);
        System.out.println("Alas Segitiga: "+alas);
        System.out.println("Luas Segitiga: "+luas);
        System.out.println("Keliling Segitiga: "+keliling);
    }
}
