package belajararray;
import java.util.Scanner;
public class DeretGeometri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, hasil;
        hasil=0;
        int [] a;
        System.out.print ("Masukkan jumlah array : ");
        n = sc.nextInt();
        a = new int [n];
        int i;
        for ( i=0; i< n; i++){
            System.out.print ("Bilangan pada array ke-" + i + " : " );
            a[i] = sc.nextInt();
        }
        System.out.print ("Baris Bilangan Geometri : "  );
        for ( i=0; i< n; i++){
            System.out.print(a[i] + " , ");
            hasil += a[i];
            } 
        System.out.println("\nJumlah Deret Geometri = " + hasil);
        }
}
