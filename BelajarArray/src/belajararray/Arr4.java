package belajararray;
import java.util.Scanner;
public class Arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Masukkan jumlah baris : ");
        int m= sc.nextInt();
        System.out.print ("Masukkan jumlah kolom : ");
        int n= sc.nextInt();
        System.out.println("================================================");
        int nilai[][] = new int [m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Masukkan angka array pada baris ke-" +i+ ", kolom ke-" +j+ ": ");
                nilai[i][j]=sc.nextInt();
            }
        }
        System.out.println("================================================");
        System.out.println("Isi array nilai adalah : ");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(nilai[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println("================================================");
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (nilai[i][j]%2==1 && nilai[i][j]<=7)
                System.out.println("Angka ganjil : " +nilai[i][j]+" Pada indeks["+i+"]["+j+"]");
            }
        System.out.println();
        } 
    }
}

            
