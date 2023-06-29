package javaapplication1;
import java.util.Scanner;
public class SegitigaRataKanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in );
        int n, i, j, s;
        System.out.print("Masukkan baris : ");
        n=input.nextInt();
        if(n>=3){
            for (i=1;i<=n;i++){
                s=n-i;
                for(j=1;j<=s;j++) 
                    System.out.print(" "); 
                for(j=1;j<=i;j++){
                    System.out.print (j); 
                    }
                System.out.print("\n");
            }
        }else{
            System.out.println("Nilai yang anda masukkan kurang dari 3");
        }
    }
}
    
    
