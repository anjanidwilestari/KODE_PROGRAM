package DoubleLinkedList3;
import java.util.Scanner;
public class  Main {
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");                
        System.out.println("+++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args)throws Exception {
         DLL dll = new  DLL();        
        Scanner  sc = new Scanner(System.in);
        Scanner  s = new Scanner(System.in);
        
        int pilih;
        do{
            menu();
            pilih =  sc.nextInt();
            
            switch(pilih){
                case 1:{
                    System.out.println("Masukkan data Peneria vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian : ");
                    String nomor =  s.nextLine();
                    System.out.println("Nama Penerima : ");
                    String nama =  s.nextLine();
                    dll.addLast(nomor, nama);
                    break;
                }
                case 2:{                    
                    dll.removeFirst();
                    break;
                }
                case 3:{   
                    System.out.println("|   No  |   Nama    |");
                    System.out.println("---------------------");
                    dll.print();
                    break;
                }                                
            }
            
        } while(pilih !=4);
    }
}
