package belajararray;
import java.util.Scanner;
public class Pengayaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key, hasil;
        hasil=0;
        int [] a;
        System.out.print ("Masukkan jumlah elemen array : ");
        n = sc.nextInt();
        a = new int [n];
        int i;
        for ( i=0; i< n; i++){
            System.out.print ("Masukkan array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }
            System.out.print ("Masukkan key yang ingin dicari: " );
            key = sc.nextInt();
        for ( i=0; i< n; i++){
            if (key == a[i]){
                hasil=i;
                break;
            }
        }
        System.out.println("Key ada di posisi index ke: " + hasil );
    }
}


