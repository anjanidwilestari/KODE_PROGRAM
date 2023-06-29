import java.util.Scanner ;

class MenghitungWaktu {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in) ;
	int mulaiBekerja ;
    int selesaiBekerja ;
    double waktuBekerja;
	    
	System.out.print("Masukan Waktu Mulai Bekerja : ") ;
	mulaiBekerja = sc.nextInt () ;
	System.out.print("Masukan Waktu Selesai Bekerja : ") ;
	selesaiBekerja = sc.nextInt () ;
      
	waktuBekerja = selesaiBekerja - mulaiBekerja ;
	System.out.println("Lama Waktu Bekerja : " + waktuBekerja);
    }  
}