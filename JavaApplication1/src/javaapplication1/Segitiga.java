import java.util.Scanner ;

public class Segitiga {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in) ;
	int alas ;
	int tinggi ;
	float luas ;
    
	System.out.print("Masukan Alas : ") ;
	alas = sc.nextInt () ;
	System.out.print("Masukan Tinggi : ") ;
	tinggi = sc.nextInt () ;
      
	luas = alas * tinggi / 2 ;
	System.out.println("Luas Segitiga : " + luas);
    }  
}