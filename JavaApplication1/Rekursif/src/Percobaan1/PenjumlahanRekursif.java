package Percobaan1;
import java.util.Scanner;
public class PenjumlahanRekursif {
    static int PenjumlahanRekursif(int n){
        if (n==1){
            return(1);
        }else if(n>1){
            return (n+PenjumlahanRekursif(n-1));
        }
    return 0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil=in.nextInt();
        System.out.print("Hasilnya adalah : ");
        System.out.println(PenjumlahanRekursif(bil));
    }
}
