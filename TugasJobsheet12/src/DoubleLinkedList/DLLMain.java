package DoubleLinkedList;
import java.util.Scanner;
public class  DLLMain {

    static void menu() {
        System.out.println("===================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("===================================================");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah data");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.print("pilih : ");
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
         DLL dll = new  DLL();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.print("Masukkan data di posisi head : ");
                    int head = sc.nextInt();
                    dll.addFirst(head);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan data di posisi tail : ");
                    int tail = sc.nextInt();
                    dll.addLast(tail);
                    break;
                }
                case 3: {
                    System.out.println("Masukkan Data ");
                    System.out.println("Data node : ");
                    int node = sc.nextInt();
                    System.out.println("Alamat pointer : ");
                    int pointer = sc.nextInt();
                    dll.add(node, pointer);
                    break;
                }
                case 4: {
                    System.out.println("Hapus data pertama");
                    dll.removeFirst();
                    dll.print();
                    break;
                }
                case 5: {
                    System.out.println("Hapus data terakhir");
                    dll.removeLast();
                    dll.print();
                    break;
                }
                case 6: {
                    System.out.println("Hapus data tertentu");
                    System.out.println("Data yang di hapus : ");
                    int d = sc.nextInt();
                    dll.remove(d);
                    dll.print();
                    break;
                }
                case 7: {
                    System.out.println("Cetak data");
                    dll.print();
                    break;
                }
                case 8: {
                    System.out.println("Cari Data");
                    System.out.println("Masukkan data yang di cari : ");
                    int cari = sc.nextInt();
                    dll.FindSeqSearch(cari);
                    break;
                }
                case 9: {
                    System.out.println("Data setelah disorting dengan buble sort");
                    dll.bubblesort();
                    break;
                }
                default:
                    if (pilih > 9 && pilih < 0) {
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while (pilih != 10);
    }
}
