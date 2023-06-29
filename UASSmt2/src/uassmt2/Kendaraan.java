package uassmt2;
import java.util.Scanner;
public class Kendaraan {

    int id;
    String nama,perlu;
    Kendaraan next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id        : ");
        id=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan keperluan : ");
        perlu=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+id+" \t|| "+nama+" \t|| "+perlu+" \t||");
    }
    
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=6){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.View Data\n5.Bayar Pajak \n6.Exit\n : ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)que.datakendaraan();
            else if(menu==5)que.bayar();
            else if(menu==6)System.out.println("- keluar -");
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}
class linked{
    Kendaraan head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void datakendaraan(){
        System.out.println("1. TNKB : 123456 \n 2. nama : Vario \n 3. jenis : matic roda 2 "
                + "\n 4. cc : 150cc \n 5. tahun : 2019 \n 6. bulan : april");
    }
    public void bayar(){
        Scanner in = new Scanner(System.in);
        int tanggal, lama, telat, bayar;
        int tgl1=0;
        System.out.println("");
        System.out.print("Nama : ");
        String nama =in.nextLine();
        System.out.print("Masukkan Tanggal Pajak (1-31) : ");
        tanggal = in.nextInt();
        System.out.print("Masukkan Tanggal Bayar Pajak (1-31) : ");
        tgl1 = in.nextInt();
        if (tgl1<tanggal){
            lama=(tgl1+30)-tanggal;
        }else{
            lama=tgl1-tanggal;
        }
        if(lama<=7){
        System.out.println("....................................................");
        System.out.println(" BUKTI PEMBAYARAN");
        System.out.println("....................................................");
        System.out.println("Nama:" + nama);
        System.out.println("Tanggal Pajak :" + tanggal);
        System.out.println("Tanggal Bayar Pajak :" + tgl1);
        }else{
        telat=lama-6;
        bayar=(10000*telat);
        System.out.println("....................................................");
        System.out.println(" BUKTI PEMBAYARAN");
        System.out.println("....................................................");
        System.out.println("Nama Pengembali :" + nama);
        System.out.println("Nama:" + nama);
        System.out.println("Tanggal Pajak :" + tanggal);
        System.out.println("Tanggal Bayar Pajak :" + tgl1);

       System.out.println("_____________________________________________________");
        System.out.println("Lama Pengaktifan Pajak Anda Adalah :" + (lama+1) 
       + " Hari");
        System.out.println("Anda Terlambat Bayar Pajak selama :" + telat + 
       " Hari");
        System.out.println("Anda Harus Membayar Denda Sebesar Rp " + bayar);
        }
    }
    public void enque(){
        Kendaraan baru=new Kendaraan();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(Kendaraan a=head; a!=null; a=a.next) a.read();
        }
    }
}    

