package belajararray;
import java.util.Scanner;
public class ArrayTerbalik {
    public static void main(String[] args) {
        int a[]= new int [5];
        int b[]= new int [a.length];
        int i;
        Scanner sc = new Scanner(System.in);
        for ( i=0; i< a.length; i++){
            System.out.print ("Masukkan isi array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }
        for ( i=0; i< a.length; i++){
            int akhir;
            akhir = a[a.length-i-1];
            b[i]=akhir;
        }
        System.out.println("");
        System.out.println("Isi array dengan urutan terbalik");
        for(i=0;i<b.length;i++){                                  
            System.out.println("Isi array ke-" + i + " : " + b[i]);
        }
    }
}
