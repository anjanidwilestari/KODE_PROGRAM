package strukturdata;
import java.util.Scanner;
public class PerulanganFibonacci {
    static void fibonancci(int i) {
        int x = 0, y = 1, z, w;
        for (w = 0; w <= i; w++) {
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Fibonancci : ");
        int bilangan = sc.nextInt();
        fibonancci(bilangan);
    }
}
