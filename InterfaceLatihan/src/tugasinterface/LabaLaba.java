package tugasinterface;
public class LabaLaba extends Binatang implements Karnivora{
    private int jumlahTaring;
    
    public LabaLaba (String nama, int jumlahMata, int jumlahKaki, int jumlahTaring){
        super(nama, jumlahMata, jumlahKaki);
        this.jumlahTaring=jumlahTaring;
    }
    
    public void tampilkanMakanan(){
        System.out.println("Jenis Binatang  : "+jenisK);
        System.out.println("Makanan         : "+makananK);
    }
    
    @Override
    public void memakanDaging(){
        System.out.println("Laba-laba dapat memakan jenis daging seperti serangga atau laba-laba lain");
    }

    
    public void tampilkanData(){
        tampilkanMakanan();
        tampilkanInfoBinatang();
        System.out.println("Jumlah Taring   : "+jumlahTaring);
        System.out.println("Fakta Laba-laba :");
        memakanDaging();
    }
} 

