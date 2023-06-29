package tugasinterface;
public class Kambing extends Binatang implements Herbivora{
    private int jumlahTanduk;
    
    public Kambing (String nama, int jumlahMata, int jumlahKaki, int jumlahTanduk){
        super(nama, jumlahMata, jumlahKaki);
        this.jumlahTanduk=jumlahTanduk;
    }
          
    public void tampilkanMakanan(){
        System.out.println("Jenis Binatang  : "+jenisH);
        System.out.println("Makanan         : "+makananH);
    }
    
    @Override
    public void memakanTumbuhan(){
        System.out.println("Kambing dapat memakan jenis tumbuhan seperti rumput liar atau dedaunan");
    }
          
    public void tampilkanData(){
        tampilkanMakanan();
        tampilkanInfoBinatang();
        System.out.println("Jumlah Tanduk   : "+jumlahTanduk);
        System.out.println("Fakta Kambing   :");
        memakanTumbuhan();
    }
}
