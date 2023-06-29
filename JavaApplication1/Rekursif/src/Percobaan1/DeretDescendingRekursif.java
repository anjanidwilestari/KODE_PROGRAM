package Percobaan1;
import java.util.Scanner;
public class DeretDescendingRekursif {
    static void tampilDeretRekursif(int n){
        if(n==0){
            System.out.println(n);
        }else {
            System.out.print(n+"");
            tampilDeretRekursif(n-1);
        }
    }
    static void tampilDeretIteratif(int n){
        for(int i=n; i>=0; i--){
            System.out.print(i+"");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil=in.nextInt();
        tampilDeretRekursif(bil);
        tampilDeretIteratif(bil);
    }
}
