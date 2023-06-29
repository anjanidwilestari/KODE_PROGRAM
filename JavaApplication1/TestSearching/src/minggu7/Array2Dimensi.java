package minggu7;
public class Array2Dimensi {
  public int nilai[][];
  public int jumNilai1;
  public int jumNilai2;
  
  public Array2Dimensi(int n[][], int jumlNilai1, int jumlNilai2){
      jumNilai1 = jumlNilai1;
      jumNilai2 = jumlNilai2;
      nilai = new int[jumlNilai1][jumlNilai2];
      for (int i = 0; i < jumNilai1 ; i++) {
          for (int j = 0; j < jumNilai2; j++) {
              nilai[i][j] = n[i][j];
          }
      }
  }
  public int findSearch(int cari){
      int posisi = -1;
      int posisi1 = 0;
      for (int i = 0; i < jumNilai1 ; i++) {
          for (int j = 0; j < jumNilai2; j++) {
              if (nilai[i][j] == cari) {
                  posisi1 = i;
                  posisi = j;
                    System.out.println("data : " +cari+ " ditemukan pada baris ke- " +posisi1+ " kolom ke-" +posisi);
                  break;
              }
          }
      }
      return posisi;
  }
  public void tampilData(){
      for (int i = 0; i < jumNilai1 ; i++) {
          for (int j = 0; j < jumNilai2; j++) {
              System.out.print(nilai[i][j]+" ");
          }
          System.out.println("");
      }
  }  
}
