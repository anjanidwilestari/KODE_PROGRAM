package strukturdata;
import java.util.Scanner;
public class RumusBangun {
    
    static void menuUtama(){  
        Scanner in = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("         PROGRAM MENGHITUNG LUAS BANGUN DATAR ");
        System.out.println("========================================================");
        System.out.println("Pilihan Menu");
        String[]menu = {"Menghitung luas segitiga","Menghitung luas persegi panjang","Menghitung luas lingkaran","Tutup Program"};
        for(int i=0; i<4;i++){
            System.out.println("\t"+(i+1)+". "+menu[i]);
        }
        System.out.println("");
        System.out.print("Masukkan Angka Pilihan Menu : ");
        int pilihan = in.nextInt();
        System.out.println("");
        switch (pilihan){
            case 1:
            segitiga();
            break;
            case 2:
            persegiPanjang();
            break;
            case 3:
            lingkaran();
            break;
            case 4:
            keluarProgram();
            break;
        }
    }
    static void ulangi(){
        Scanner input = new Scanner(System.in);
        char pilih;
        System.out.println("");
        System.out.println("Masukkan [Y] Untuk Kembali Ke Menu Utama");
        System.out.println("Masukkan [N] Untuk Keluar Dari Program");
        System.out.print("Y/N...?  ");
        pilih = input.nextLine().charAt(0);
        if (pilih=='y'||pilih=='Y') {
            menuUtama();
        }else if (pilih=='n'||pilih=='N') {
            keluarProgram();
        }else {
            System.out.println("Silahkan Ulangi Kembali! Terima Kasih!");
        }
    }   
    static void keluarProgram(){
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("                ~~~TERIMA KASIH~~~");
        System.out.println("========================================================");
    }
    static void segitiga(){
        Scanner sc= new Scanner (System.in) ;
        int alas ;
	int tinggi ;
	float luas ;
        System.out.println("Program Menghitung Luas Segitiga");
	System.out.print("Masukan Alas\t: ") ;
	alas = sc.nextInt () ;
	System.out.print("Masukan Tinggi\t: ") ;
	tinggi = sc.nextInt () ;
      
	luas = alas * tinggi / 2 ;
	System.out.println("Luas Segitiga\t: " + luas);
        ulangi();
    }
    static void persegiPanjang(){
        Scanner sc= new Scanner (System.in) ;
        int panjang ;
	int lebar ;
	float luas ;
        System.out.println("Program Menghitung Luas Persegi Panjang");
	System.out.print("Masukan Panjang\t: ") ;
	panjang = sc.nextInt () ;
	System.out.print("Masukan Lebar\t: ") ;
	lebar = sc.nextInt () ;
      
	luas = panjang * lebar;
	System.out.println("Luas Persegi Panjang : " + luas);
        ulangi();
    }
    static void lingkaran(){
        Scanner sc= new Scanner (System.in) ;
        double luas, r;
        final double phi = 3.14;
        System.out.println("Program Menghitung Luas Ligkaran");
	System.out.print("Masukkan panjang jari-jari lingkaran : ") ;
	r = sc.nextInt () ;
	
	luas = phi*r*r;
	System.out.println("Luas Lingkaran : " + luas);
        ulangi();
    }
    public static void main(String[] args) {
        
        menuUtama();
    }
}