package jobsheet6;
public class MainTiket {
    public static void main(String[] args) {
        TiketService list=new TiketService();
        Tiket t1=new Tiket("Adam Air", 10000000, "Indonesia", "Belanda" );
        Tiket t2=new Tiket("Garuda Air", 30000000, "Indonesia", "Kanada" );
        Tiket t3=new Tiket("Lion Air", 20000000, "Indonesia", "Green Land" );
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
                
        System.out.println("Data maskapai sebelum sorting = ");
        list.tampilAll();
        
        System.out.println("Data maskapai setelah sorting berdasarkan harga");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("Data maskapai setelah sorting berdasarkan harga");
        list.selectionSort();
        list.tampilAll();
    }
}
