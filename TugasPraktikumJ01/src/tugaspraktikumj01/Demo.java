package tugaspraktikumj01;
public class Demo {
    public static void main(String[] args) {
        Mobil mbl1 = new Mobil ();
        mbl1.merek="Toyota";
        mbl1.kecepatan=100;
        mbl1.gear=2;
        mbl1.tambahKecepatan(10);
        mbl1.rem(5);
        mbl1.gantiGear(1);
        mbl1.cetakStatus();
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println(" ");
        Segitiga sgt1 = new Segitiga ();
        sgt1.sisi1=11;
        sgt1.sisi2=12;
        sgt1.sisi3=14;
        sgt1.tinggi=8;
        sgt1.alas=4;
        sgt1.luasSegitiga(8,4);
        sgt1.kelilingSegitiga(11,12,14);
        sgt1.tampilkanDataSegitiga();
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println(" ");
        Lingkaran lgk1 = new Lingkaran();
        lgk1.r=14;
        lgk1.luasLingkaran(14);
        lgk1.kelilingLingkaran(14);
        lgk1.tampilkanDataLingkaran();
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println(" ");
        Nilai n = new Nilai();
        n.x=70;
        n.y=80;
        n.z=90.5;
        n.mencariNilaiTerbesar(70,80,90.5);
        n.mencariTotal(70,80,90.5);
        n.mencariRerata(70,80,90.5);
        n.tampilkanNilai();
        
    }
}
