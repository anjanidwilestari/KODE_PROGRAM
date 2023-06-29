package minggu3new;
public class Mahasiswa {
    String nama;
    String nim;
    String jeniskelamin;
  
    public double hitungRatarata(double...ipk){
        double total=0;
        for (int i=0; i<ipk.length;i++){
            total +=ipk[i];
        } return total/ipk.length;
    }
}
