package Percobaan1;
import java.util.Scanner;
public class ProjekSewa {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        System.out.println("----------PEMINJAMAN BUKU----------");
        System.out.println("");
        System.out.println("---------------MENU----------------");
        String[] menu = {"1. peminjaman","2. pengembalian"};
        printArray(menu);
        
        System.out.println("");
        System.out.print("Masukkan Pilihan Anda (1/2) : ");
        int x = in.nextInt();
        System.out.println("");
        if(x==1){
            System.out.println("----------MENU PEMINJAMAN----------");
            System.out.println("-------------LIST BUKU-------------");
 
            String[]buku = {"1. Novel","2. Komik","3. Pendidikan","4. Majalah","5. Dongeng"};
            printArray(buku);
            System.out.print("Pilih Buku (intger) : ");
            int pilihbuku = in.nextInt();
            System.out.println("");
 
            String[]pilihan = {"1. Pinjam Buku","2. Keluar"};
            String inputpilih = "Pilih 1/2 : ";
            int z;
 
            String biaya = "-----Biaya Peminjaman-----\nBiaya Peminjaman sebesar 1.000/hari\nBiaya Denda Sebesar 2.000/hari\n";
 
            if(pilihbuku==1 || pilihbuku==2 || pilihbuku==3 || pilihbuku==4|| pilihbuku==5){
                printArray(pilihan);
                System.out.print(inputpilih);
                z=in.nextInt();
                System.out.println("");
                if(z==1){
                    System.out.print(biaya);
                    System.out.println("");
                    System.out.print("Masukkan Lama Waktu Meminjam (Hari) : ");
                    int hari=in.nextInt();
                    hari *= 1000;
                    System.out.println("");
                    System.out.println("Biaya Peminjaman Sebesar Rp." + hari);
                    System.out.println("");
                    System.out.println("---TERIMAKASIH TELAH BERKUNJUNG---");
                }else if (z==2){
                    System.out.println("---TERIMAKASIH TELAH BERKUNJUNG---");
                }else System.out.println("Mohon Maaf Pilihan Tidak Tersedia");
            }else System.out.println("Mohon Maaf Pilihan Tidak Tersedia");
 
        }else if(x==2){
            System.out.println("Anda Memilih nomer 2");
        }else{
            System.out.println("Mohon Maaf Pilihan Tidak Tersedia");
        }
 
    }
    public static void printArray(String[] Array){
        for(int i=0; i< Array.length; i++){
            System.out.println(Array[i]);
            
        }
    }
}

