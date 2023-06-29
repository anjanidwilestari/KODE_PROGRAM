package tugasinterface;
public class Ayam extends Binatang implements Karnivora, Herbivora{
    private String warnaJambul;
    
    public Ayam (String nama, int jumlahMata, int jumlahKaki, String warnaJambul){
        super(nama, jumlahMata, jumlahKaki);
        this.warnaJambul=warnaJambul;
    }  
    
    public void tampilkanMakanan(){
        System.out.println("Jenis Binatang  : "+jenisK + " + " + jenisH);
        System.out.println("Makanan         : "+makananK+ " + " + makananH);
    }
    
    @Override
    public void memakanTumbuhan(){
        System.out.println("Ayam dapat memakan jenis tumbuhan seperti biji-bijian");
    }
    
    @Override
    public void memakanDaging(){
        System.out.println("Ayam dapat memakan jenis daging seperti cacing, semut, dan bangkai");
    }

    public void tampilkanData(){
        tampilkanMakanan();
        tampilkanInfoBinatang();
        System.out.println("Warna Jambul    : "+warnaJambul);
        System.out.println("Fakta Ayam      :");
        memakanTumbuhan();
        memakanDaging();
    }
} 

