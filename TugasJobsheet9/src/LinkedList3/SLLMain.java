package LinkedList3;
import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList();
        System.out.print("Jumlah Data Yang Dimasukkan: ");
        int d = input.nextInt();
        System.out.println("________________________________________");
        for (int i = 0; i < d; i++){
            System.out.print("Data Ke-" + i + ": ");
            String data = input.next();
            input.nextLine();
            singLL.push(data);
        }
        System.out.println("________________________________________");
        singLL.print(); 
        System.out.println("________________________________________");
        System.out.println("Data pada posisi Top Stack: " + singLL.peek());
    }
}

