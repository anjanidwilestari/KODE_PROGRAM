package strukturdata;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan bilangan Fibonacci : " );
        bil = sc.nextInt();
        System.out.println("=====================================================");
        for (int d = 0; d <= bil; d++) {
            System.out.print(fibonacciKedua(d)+" ");
        }
        System.out.println();
    }
    static int fibonacci(int x){
        if(x ==0||x==2){
            return 1;
        }
        return fibonacci(x-1)+ fibonacci(x-2);
    }
    static int fibonacciKedua(int y){
        int a1=1,b2=1, fibonacci=0;
        if(y ==1|| y==2){
            return 1;
        }
        for (int i = 3; i <= y; i++) {
            fibonacci = a1+b2;
            a1 = b2;
            b2 = fibonacci;
            
        }
        return fibonacci;
    }
}

