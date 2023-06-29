package belajararray;
import java.util.Scanner;
public class Pengayaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key, hasil;
        hasil=0;
        int [] a;
        System.out.print ("Jumlah elemen array : ");
        n = sc.nextInt();
        a = new int [n];
        int i;
        for ( i=0; i< n; i++){
            System.out.print ("Array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }   
        for ( i=0; i< n; i++){
            for(int j=1; j<(n-i); j++){
                if (a[j-1] > a[j]){
                    hasil=a[j-1];
                    a[j-1] = a[j];
                    a[j]= hasil;
                }
            }
        }
        System.out.print("Hasil Pengurutan : ");
        for ( i=0; i< n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}