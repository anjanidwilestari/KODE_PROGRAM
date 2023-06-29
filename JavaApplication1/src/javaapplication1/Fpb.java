package javaapplication1;
import java.util.Scanner;
public class Fpb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in );
        int x, y, fpb;
        System.out.print("Masukkan bilangan 1 : ");
        x=input.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        y=input.nextInt();
        
        fpb = y % x;
        while (fpb != 0) {
            x = y;
            y = fpb;
            fpb = x % y;
        }
        System.out.println("\nFPB dari kedua bilangan adalah "+y);
    }
}


