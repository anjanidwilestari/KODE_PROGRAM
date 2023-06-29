package minggu7;
import java.util.Scanner;
public class MahasiswaMain {
  
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        Scanner s1= new Scanner (System.in);
        PencarianMhs data;
        data = new PencarianMhs();
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs=s.nextInt();
        System.out.println("=====================================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for(int i=0; i< jumMhs; i++){
            System.out.println("-----------------------");
            System.out.print("Nim   : ");
            int nim=s.nextInt();
            System.out.print("Nama  : ");
            String nama=s1.nextLine();
            System.out.print("Umur  : ");
            int umur=s.nextInt();
            System.out.print("IPK   : ");
            double ipk=s.nextDouble();
            Mahasiswa m=new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m); }
        System.out.println("=====================================================");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("_____________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
        System.out.print("Nama : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        String posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }    
}
