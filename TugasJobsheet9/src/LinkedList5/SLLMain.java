package LinkedList5;
import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) {
    SingleLinkedList singLL = new SingleLinkedList();
    Scanner input = new Scanner(System.in);
    char pilih;
    int menu, ulangmenu;
        OUTER:
        do {
            System.out.println("Masukkan Operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek At");
            System.out.println("6. Peek Rear");
            System.out.println("7. Peek Position");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println("	");
            if (menu < 1 || menu > 8) {
                System.out.println("Pilin Menu 1 - 8, Pilih Menu Kembali");
            }   while (menu < 1 || menu > 8);
            switch (menu) {
                case 1:
                    do {
                        input.nextLine();
                        System.out.print("Nama Nasabah\t: ");
                        String nama = input.nextLine();
                        System.out.print("Alamat Nasabah\t: ");
                        String alamat = input.nextLine();
                        System.out.print("Nomer Nasabah\t: ");
                        String rekening = input.nextLine();
                        System.out.println("");
                        System.out.print("Apakah Anda akan menambahkan data baru Stack (y/n) : ");
                        pilih = input.next().charAt(0);
                        singLL.Enqueue(nama, alamat, rekening);
                        System.out.println("---------------------------------------");
                    } while (pilih == 'y');
                    break;
                case 2:
                    singLL.Dequeue();
                    break;
                case 3:
                    singLL.print();
                    break;
                case 4:
                    singLL.peek();
                    break;
                case 5:
                    System.out.print("Masukkan Index Data yang dicari : ");
                    int index = input.nextInt();
                    singLL.peekAt(index);
                    break;
                case 6:
                    singLL.peekRear();
                    break;
                case 7:
                    System.out.print("Masukkan Nama Nasabah yang dicari : ");
                    String cari = input.next();
                    singLL.peekPosition(cari);
                    break;
                default:
                    break OUTER;
            }
        } while (menu > 1 || menu < 8);
    }
}


