package belajararray;
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p, l;
        int [] a;
        System.out.print ("Masukkan jumlah array : ");
        n = sc.nextInt();
        a = new int [n];
        int i;
        for ( i=0; i< n; i++){
            System.out.print ("Masukkan array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }
        for ( i=0; i< n; i++){
            if (a[i] % 2 ==0){
                p = a[i];
                System.out.println("Angka Genap  : " + p);
            }
        }
        for ( i=0; i< n; i++){
            if (a[i] % 2 ==1){
                l = a[i];
                System.out.println("Angka Ganjil : " + l);
            }
        }
    }
}

