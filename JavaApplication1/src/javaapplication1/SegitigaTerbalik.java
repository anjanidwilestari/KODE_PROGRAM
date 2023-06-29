package javaapplication1;
import java.util.Scanner;
public class SegitigaTerbalik {
    public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
        int n, i, j, k;
        
        System.out.print("Masukkan baris = ");
        n=input.nextInt();
        if(n>=5){      
            for (i=1;i<=n;i++){
                for( j=1;j<=i;j++){
                }
                for( k=n;k>=i;k--){
                    System.out.print("*");
                }
                System.out.print("\n");
                }
        }else{
            System.out.println("Nilai yang anda masukkan kurang dari 5");
        }        
    }
}
 


