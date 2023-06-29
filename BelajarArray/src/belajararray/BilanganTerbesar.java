package belajararray;
import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 0;
        int min = 1000;
        int [] a;
        System.out.print ("Masukkan jumlah array : ");
        n = sc.nextInt();
        a = new int [n];
        int i;
        for ( i=0; i< n; i++){
            System.out.print ("Bilangan pada array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
 System.out.println("Bilangan Terbesar : " + max);
 System.out.println("Bilangan Terkecil : " + min);
    }  
}
