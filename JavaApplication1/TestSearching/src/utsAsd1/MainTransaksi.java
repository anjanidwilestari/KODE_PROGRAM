package utsAsd1;
import java.util.Scanner;
public class MainTransaksi {
    
    static void menuUtama(){  
        Scanner s= new Scanner (System.in);
        Scanner s1= new Scanner (System.in);
        System.out.println("========================================================");
        System.out.println("         SISTEM INFORMASI PERBANKAN ");
        System.out.println("========================================================");
        System.out.println("Pilihan Menu");
        String[]menu = {"Tampil Data Rekening","Tampil Data Transaksi", "Mencari Saldo > 500000", "Tutup Program"};
        for(int i=0; i<4;i++){
            System.out.println("\t"+(i+1)+". "+menu[i]);
        }
        System.out.println("");
        System.out.print("Masukkan Angka Pilihan Menu : ");
        int pilihan = s.nextInt();
        System.out.println("");
        switch (pilihan){
            case 1:
            PencarianRekening data;
            data = new PencarianRekening();
            System.out.print("Masukkan Jumlah Rekening : ");
            int jumRek=s.nextInt();
            System.out.println("=====================================================");
            System.out.println("Masukkan data Rekening secara urut dari NIM terkecil");
            for(int i=0; i< jumRek; i++){
            System.out.println("-----------------------");
            System.out.print("No Rekening   : ");
            String noRekening=s1.nextLine();
            System.out.print("Nama  : ");
            String nama=s1.nextLine();
            System.out.print("Nama Ibu  : ");
            String namaIbu =s1.nextLine();
            System.out.print("Nomor Phone   : ");
            String phone =s1.nextLine();
            System.out.print("Alamat Email   : ");
            String email =s1.nextLine();
            Rekening m=new Rekening(noRekening, nama, namaIbu, phone, email);
            data.tambah(m); }
            System.out.println("=====================================================");
            System.out.println("Data keseluruhan Rekening : ");
            data.tampil();
            System.out.println("_____________________________________________________");
            System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Pemilik Rekening yang dicari : ");
        System.out.print("Nama : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
            break;
            
            case 2:
                
            PenampilanSaldo dataa;
            dataa = new PenampilanSaldo();
            System.out.print("Masukkan Jumlah Transaksi : ");
            int jumTf=s.nextInt();
            System.out.println("=====================================================");
            System.out.println("Masukkan data Transaksi secara urut dari NIM terkecil");
            for(int i=0; i< jumTf; i++){
            System.out.println("-----------------------");
            System.out.print("Saldo   : ");
            double saldo=s.nextDouble();
            System.out.print("Saldo Awal  : ");
            double saldoa=s.nextDouble();
            System.out.print("Saldo Akhir  : ");
            double saldok=s.nextDouble();
            System.out.print("Tanggal Transaksi   : ");
            String tgl =s1.nextLine();
            System.out.print("Type   : ");
            String type =s1.nextLine();
            Transaksi m=new Transaksi(saldo, saldoa, saldok, tgl, type);
            dataa.tambah(m); }
            System.out.println("=====================================================");
            System.out.println("Data keseluruhan Transfer : ");
            dataa.tampil();
            System.out.println("_____________________________________________________");
            break;
            
            case 3:
                
            break;
            
            case 4:
                keluarProgram(); 
            break;
    }
    }
    static void keluarProgram(){
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("                ~~~TERIMA KASIH~~~");
        System.out.println("========================================================");
    }
    
    public static void main(String[] args) {
        menuUtama();
    }    
}
      
