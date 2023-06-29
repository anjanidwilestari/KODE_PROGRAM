package javaapplication1;

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int N;
        System.out.print("Masukkan nilai N = ");
        N = input.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=1; i<=N; i++){
            System.out.print("*");   
        }
        System.out.println();
    }  
}
}
