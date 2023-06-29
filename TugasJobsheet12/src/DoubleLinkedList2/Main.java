package DoubleLinkedList2;
import java.util.Scanner;
public class  Main {
    
    public static void menu(){
        System.out.println("========================");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("========================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");        
        System.out.println("=========================");
    }
    public static void main(String[] args)throws Exception {
        DLL dll = new  DLL();        
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:{
                    System.out.println("Masukkan judul Buku : ");
                    String data = s.nextLine();
                    dll.addLast(data);
                    break;
                }
                case 2:{                    
                    dll.pop();
                    System.out.println("Buku pada tumpukan teratas telah diambil");
                    break;
                }
                case 3:{    
                    System.out.println("Cek Buku Teratas");
                    System.out.println("--------------------");
                    System.out.println(dll.peek());
                    break;
                }
                case 4:{
                    System.out.println("Cetak Seluruh judul buku");
                    System.out.println("-------------------------");
                    dll.print();                    
                    break;
                }                
            }
            
        } while(pilih !=5);
    }
}

