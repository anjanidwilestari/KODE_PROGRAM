package Praktikum2;
import java.util.Scanner;
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int max, pilih;
        System.out.print("Masukkan Kapasitas queue: ");
        int jumlah=sc.nextInt();
        Penumpang antri=new Penumpang (jumlah);
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama\t\t: ");
                    String nama=sc.nextLine();
                    System.out.print("Kota Asal\t: ");
                    String asal=sc.nextLine();
                    System.out.print("Kota Tujuan\t: ");
                    String tujuan=sc.nextLine();
                    System.out.print("Jumlah Tiket\t: ");
                    int jml=sc.nextInt();
                    System.out.print("Harga\t\t: ");
                    int hrg=sc.nextInt();
                    Penumpang p=new Penumpang (nama,asal,tujuan,jml,hrg);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data=antri.Dequeue();
                    if (!"".equals(data.nama)&& !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) 
                            && data.jumlahTiket !=0 && data.harga !=0){
                        System.out.println("Antrian yang keluar: "+data.nama+" "+ data.kotaAsal+ " " 
                                + data.kotaTujuan+" "+ data.jumlahTiket+" "+data.harga);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        }while (pilih==1 || pilih==2 || pilih==3 || pilih==4||pilih==5);
    }
}

