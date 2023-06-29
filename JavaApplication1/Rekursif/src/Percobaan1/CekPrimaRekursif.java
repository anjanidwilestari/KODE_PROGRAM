package Percobaan1;
import java.util.Scanner;
public class CekPrimaRekursif {
    static int CekPrimaRekursif(int bil, int n){
        if(bil==1){
            return(1);
        }else if (bil%n==0){
            return (1+(CekPrimaRekursif(bil,--n)));
        } else{
            return (0+(CekPrimaRekursif(bil,--n)));
        }
    }
    static boolean CekPrima(int bil){
        if(bil>1){
            return(CekPrimaRekursif(bil,bil)==2);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil=in.nextInt();
            if (bil>1){
                System.out.println("Bilangan prima");
            }else{
                System.out.println("Bukan bilangan prima"); 
            }
        System.out.print("Masukkan bilangan : ");
        int angka=in.nextInt();
            if (bil>1){
                System.out.println("Bukan bilangan prima");
            }else{
                System.out.println("Bilangan prima"); 
            }        
    }
}
