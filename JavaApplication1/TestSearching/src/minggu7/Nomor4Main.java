package minggu7;
public class Nomor4Main {
    public static void main(String[] args) {
        int a[] = {12,17,2,1,70,50,90,17,2,90};
       
       Nomor4 urut = new Nomor4(a, a.length);
       System.out.println("Data sebelum urut");
       urut.tampilData();
       urut.bubbleSort();
       System.out.println("Data sesudah urut Bubble Sort (ASC)");
       urut.tampilData();
       urut.bigger(a);
      }  
}
    
    
