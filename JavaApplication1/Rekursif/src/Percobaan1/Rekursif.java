package Percobaan1;
import java.util.Scanner;
public class Rekursif {
    static int fibonacci(int n){
        if(n<=0||n<=1){
            return(n);
        }else {
            return(fibonacci(n-1)+fibonacci(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Masukkan bulan ke- : ");
        int bulan=in.nextInt();
        System.out.print("Total pasangan : ");
                for(int i=0;i<bulan;i++);
                    System.out.println(fibonacci(bulan)+"");
    }
}
