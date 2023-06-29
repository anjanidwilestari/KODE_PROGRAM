package javaapplication1;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int N;
        int i=1;
        System.out.print("Masukkan nilai N = ");
        N = input.nextInt();
        while(i<=N){
            int j=0;
            while (j<i){
            System.out.print("*");   
            j++;
        }
        System.out.print("\n");
        i++;
    }  
}
}


