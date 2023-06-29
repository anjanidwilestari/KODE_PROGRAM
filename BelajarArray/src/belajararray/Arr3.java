package belajararray;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m, i, j;
        System.out.print ("Masukkan jumlah baris : ");
        n= input.nextInt();
        System.out.print ("Masukkan jumlah kolom : ");
        m= input.nextInt();
        int nilai[][] = new int [n][m];
        for( i=0; i<n; i++){
            for( j=0; j<m; j++){
                System.out.print("Masukkan nilai ke-[" +i+ "][" +j+ "]");
                nilai[i][j]=input.nextInt();
            }
        System.out.println("----------------------------");
        }
        for ( i=0; i<n; i++){
            for( j=0; j<m; j++){
                System.out.print(nilai [i][j]+ " ");
            }
        System.out.println();
        }
    }
}
