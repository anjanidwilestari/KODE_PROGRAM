package tugaspraktikumj01;
public class Nilai {
    double x,y,z;
    double max, sum, avg;
    
    public void mencariNilaiTerbesar(double x, double y, double z){
        max=(y>=x)? y: x;
        max=(z>=max)? z: max;
    }
    public void mencariTotal(double x, double y, double z){
        sum=x+y+z;
    }
    public void mencariRerata(double x, double y, double z){
        avg=(x+y+z)/3;
    }
    public void tampilkanNilai(){
        System.out.println("Nilai Tugas : "+x);
        System.out.println("Nilai Quiz : "+y);
        System.out.println("Nilai Ujian: "+z);

        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Total dari Keseluruhan = "+sum);
        System.out.println("Rata-rata = "+avg);
    }
}
