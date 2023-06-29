import java.util.Scanner ;

public class MenghitungUsia {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in) ;
	int tahunKelahiran ;
    int tahunSekarang ;
    double usia;
	    
	System.out.print("Masukan Tahun Kelahiran : ") ;
	tahunKelahiran = sc.nextInt () ;
	System.out.print("Masukan Tahun Sekarang : ") ;
	tahunSekarang = sc.nextInt () ;
      
	usia = tahunSekarang - tahunKelahiran;
	System.out.println("Usia : " + usia);
    }  
}