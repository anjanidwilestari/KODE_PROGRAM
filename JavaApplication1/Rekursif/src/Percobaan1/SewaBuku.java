package Percobaan1;
import java.util.*;
import java.util.Scanner;
public class SewaBuku {
    
    static void loading(){
    System.out.print("Please wait");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.print("Loading");
        for(int i=0; i<20;i++){
            System.out.print(". ");
        }
    }
    
    static void tanggal(){
    int detik, menit, jam, hari, bulan, tahun;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_MONTH);
    bulan = date.get(Calendar.MONTH);
    tahun = date.get(Calendar.YEAR);
    System.out.println("");
    System.out.println("Hari ini: "+hari+" "+namabulan[bulan]+" "+tahun);
    System.out.println("Waktu   : "+jam+":"+menit+":"+detik);
    }
    
    static void menu_utama(){
        tanggal();    
        Scanner in = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("                 PROGRAM PEMINJAMAN BUKU                ");
        System.out.println("========================================================");
        System.out.println("         HAPPY HUNTING FOR YOUR LOVELY BOOKS :)       ");
        System.out.println("");
        System.out.println("Pilihan Menu");
        String[]menu = {"Cari Buku", "Baca Buku", "Pinjam Buku", "Pengembalian Buku", "Perpanjangan Peminjaman", "Tutup Program"};
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+". "+menu[i]);
        }
        System.out.println("");
        System.out.print("Masukkan Angka Pilihan Menu : ");
        int pilihan = in.nextInt();
        System.out.println("");
        switch (pilihan){
            case 1:
            cari();
            break;
            case 2:
            baca();
            break;
            case 3:
            pinjam_buku();
            break;
            case 4:
            kembalikan();
            break;
            case 5:
            perpanjangan();
            break;
            case 6:
            keluar_program();
            break;
        }
    }
    
    static void ulangi(){
        Scanner input = new Scanner(System.in);
        char pilih;
        System.out.println("");
        System.out.println("Masukkan [Y] Untuk Kembali Ke Menu Utama");
        System.out.println("Masukkan [N] Untuk Keluar Dari Program");
        System.out.print("Y/N...?  ");
        pilih = input.nextLine().charAt(0);
        if (pilih=='y'||pilih=='Y') {
            menu_utama();
        }else if (pilih=='n'||pilih=='N') {
            keluar_program();
        }else {
            System.out.println("Silahkan Ulangi Kembali! Terima Kasih!");
        }
    }
    
    static void cari(){
        tanggal();
        Scanner in = new Scanner(System.in);
        String daftar [] = new String [] { "Teknik Dokumentasi", "Dasar Pemrograman", "Aplikasi Perkantoran", "Konsep Teknologi Informasi", "Bahasa Inggris", "Ilmu Komunikasi"}; 
        System.out.println("----------------------------------------------------");
        System.out.println("                  DAFTAR LIST BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("\tKode\tJudul Buku");
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+"\t"+daftar[i]);
        }
        char[]kode={1,2,3,4,5,6};
        int cari;
        int i;
        i=0;
        int index=i;
        int ketemu=0;
        System.out.println("");
        System.out.print("Masukkan Kode Buku Yang Akan Dicari : ");
        cari = in.nextInt();
        for(i=0; i<6;i++){
            if(kode[i]==cari){
                ketemu=1;
                index=(i+1);
                break;
            }
        }
        if(ketemu==1){
            System.out.println("----------------------------------------------------");
            System.out.println("Buku Terletak Di Urutan Ke-" + index);
            switch (index) {
                case 1:
                    System.out.println("Judul Buku : " + daftar[0]);
                    break;
                case 2:
                    System.out.println("Judul Buku : " + daftar[1]);
                    break;
                case 3:
                    System.out.println("Judul Buku : " + daftar[2]);
                    break;
                case 4:
                    System.out.println("Judul Buku : " + daftar[3]);
                    break;
                case 5:
                    System.out.println("Judul Buku : " + daftar[4]);
                    break;
                case 6:
                    System.out.println("Judul Buku : " + daftar[5]);
                    break;
                default:
                    break;
            }
        } else{
            System.out.println("Buku Tidak Tersedia");
        }
    System.out.println("----------------------------------------------------");
    System.out.println("");
    ulangi();    
    }
    
    static void baca(){
        tanggal();
        Scanner in = new Scanner(System.in);
        String daftar [] = new String [] { "Teknik Dokumentasi", "Dasar Pemrograman", "Aplikasi Perkantoran", "Konsep Teknologi Informasi", "Bahasa Inggris", "Ilmu Komunikasi"};
        System.out.println("----------------------------------------------------");
        System.out.println("                     BACA BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("\tKode\tJudul Buku");
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+"\t"+daftar[i]);
        }
        System.out.println("");
        System.out.print("Nama Pembaca                  : ");
        String nama =in.nextLine();
        System.out.print("Institusi Pembaca             : ");
        String institusi =in.nextLine();
        int jumlah, kode;
        System.out.print("Jumlah Buku Yang Ingin Dibaca : ");
        jumlah = in.nextInt();
        System.out.println("----------------------------------------------------");
        for(int x=0; x<jumlah; x++){
            System.out.print("Masukkan Kode Buku : ");
            kode = in.nextInt();
            switch (kode) {
                case 1:
                    System.out.println("Selamat Membaca Buku " + daftar[0]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Selamat Membaca Buku " + daftar[1]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Selamat Membaca Buku " + daftar[2]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Selamat Membaca Buku " + daftar[3]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Selamat Membaca Buku " + daftar[4]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Selamat Membaca Buku " + daftar[5]);
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Buku Tidak Tersedia");
                    System.out.println("----------------------------------------------------");
                    break;
            }
        }
        ulangi();
    }
    
    static void pinjam_buku(){
        tanggal();
        Scanner in = new Scanner(System.in);
        String daftar [] = new String [] { "Teknik Dokumentasi", "Dasar Pemrograman", "Aplikasi Perkantoran", "Konsep Teknologi Informasi", "Bahasa Inggris", "Ilmu Komunikasi"};
        System.out.println("----------------------------------------------------");
        System.out.println("                   PINJAM BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("\tKode\tJudul Buku");
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+"\t"+daftar[i]);
        }
        System.out.println("");
        System.out.print("Nama Peminjam                  : ");
        String nama =in.nextLine();
        System.out.print("Institusi Peminjam             : ");
        String institusi =in.nextLine();
        System.out.print("Nomor HP Peminjam              : ");
        String nohp =in.nextLine();
        int tanggal;
        int tgl1=0;
        System.out.print("Masukkan Tanggal Pinjam (1-31) : ");
        tanggal = in.nextInt();
        if((tanggal<0) || (tanggal>31) ){
            System.out.println("Tanggal Salah");
        }else {
            if(tanggal<25){
                tgl1=tanggal+7;
            } if (tanggal>=25) {
                tgl1=(tanggal+7)-30;
            }
        }
        System.out.println("");
        int jumlah, kode;
        System.out.print("Jumlah Buku Yang Ingin Dipinjam : ");
        jumlah = in.nextInt();
        for(int x=0; x<jumlah; x++){
            System.out.print("Masukkan Kode Buku : ");
            kode = in.nextInt();
            switch (kode) {
                case 1:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[0]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[1]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[2]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[3]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[4]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Anda Telah Meminjam Buku " + daftar[5]);
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Buku Tidak Tersedia");
                    System.out.println("----------------------------------------------------");
                    break;
                }
            }
        int biaya;
        biaya=jumlah*5000;
        System.out.println("");
        System.out.println("....................................................");
        System.out.println("                BUKTI PEMINJAMAN BUKU");
        System.out.println("....................................................");
        System.out.println("Nama Peminjam                 :" + nama);
        System.out.println("Institusi Peminjam            :" + institusi);
        System.out.println("Nomor HP Peminjam             :" +nohp);
        System.out.println("Jumlah Buku Yang Dipinjam     :" + jumlah + " Buku");
        System.out.println("Tanggal Peminjaman Buku       :" + tanggal);
        System.out.println("Tanggal Pengembalian (7 Hari) :" + tgl1);
        System.out.println("Silahkan Membayar Biaya Peminjaman Sebesar Rp " + biaya);
        System.out.println("");
        System.out.println("NB : JIKA PEMINJAMAN LEBIH DARI 7 HARI AKAN MENDAPAT DENDA");
        System.out.println("     JIKA INGIN MEMINJAM LEBIH LAMA LAKUKAN PERPANJANGAN TERLEBIH DAHULU");
        ulangi();
    }
    
    static void kembalikan(){
        tanggal();
        Scanner in = new Scanner(System.in);
        String daftar [] = new String [] { "Teknik Dokumentasi", "Dasar Pemrograman", "Aplikasi Perkantoran", "Konsep Teknologi Informasi", "Bahasa Inggris", "Ilmu Komunikasi"};
        System.out.println("----------------------------------------------------");
        System.out.println("                  PENGEMBALIAN BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("\tKode\tJudul Buku");
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+"\t"+daftar[i]);
        }
        int tanggal, lama, telat, bayar;
        int tgl1=0;
        System.out.println("");
        System.out.print("Nama Pengembali                : ");
        String nama =in.nextLine();
        System.out.print("Institusi Pengembali           : ");
        String institusi =in.nextLine();
        System.out.print("Nomor HP Pengembali            : ");
        String nohp =in.nextLine();
        System.out.print("Masukkan Tanggal Pinjam (1-31) : ");
        tanggal = in.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        tgl1 = in.nextInt();
        if (tgl1<tanggal){
            lama=(tgl1+30)-tanggal;
        }else{
            lama=tgl1-tanggal;
        }
        int jumlah, kode;
        System.out.print("Jumlah Buku Yang Ingin Dikembalikan : ");
        jumlah = in.nextInt();
        for(int x=0; x<jumlah; x++){
            System.out.print("Masukkan Kode Buku : ");
            kode = in.nextInt();
            switch (kode) {
                case 1:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[0]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[1]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[2]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[3]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[4]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Anda Telah Mengembalikan Buku " + daftar[5]);
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Buku Tidak Tersedia");
                    System.out.println("----------------------------------------------------");
                    break;
            }
        }
        if(lama<=7){
            System.out.println("....................................................");
            System.out.println("               BUKTI PENGEMBALIAN BUKU");
            System.out.println("....................................................");
            System.out.println("Nama Pengembali                 :" + nama);
            System.out.println("Institusi Pengembali            :" + institusi);
            System.out.println("Nomor HP Pengembali             :" + nohp);
            System.out.println("Jumlah Buku Yang Dikembalikan   :" + jumlah + " Buku");
            System.out.println("Tanggal Pinjam                  :" + tanggal);
            System.out.println("Tanggal Dikembalikan            :" + tgl1);
        }else{
            telat=lama-6;
            bayar=(jumlah*7000*telat);
            System.out.println("....................................................");
            System.out.println("               BUKTI PENGEMBALIAN BUKU");
            System.out.println("....................................................");
            System.out.println("Nama Pengembali                 :" + nama);
            System.out.println("Institusi Pengembali            :" + institusi);
            System.out.println("Nomor HP Pengembali             :" + nohp);
            System.out.println("Jumlah Buku Yang Dikembalikan   :" + jumlah + " Buku");
            System.out.println("Tanggal Pinjam                  :" + tanggal);
            System.out.println("Tanggal Dikembalikan            :" + tgl1);
            System.out.println("_____________________________________________________");
            System.out.println("Lama Peminjaman Anda Adalah               :" + (lama+1) + " Hari");
            System.out.println("Anda Terlambat Mengembalikan Buku selama  :" + telat + " Hari");
            System.out.println("Anda Harus Membayar Denda Sebesar Rp " + bayar);
        }
    ulangi();
    }
    
    static void perpanjangan(){
        tanggal();
        Scanner in = new Scanner(System.in);
        String daftar [] = new String [] { "Teknik Dokumentasi", "Dasar Pemrograman", "Aplikasi Perkantoran", "Konsep Teknologi Informasi", "Bahasa Inggris", "Ilmu Komunikasi"};
        System.out.println("----------------------------------------------------");
        System.out.println("             PERPANJANGAN PEMINJAMAN BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("\tKode\tJudul Buku");
        for(int i=0; i<6;i++){
            System.out.println("\t"+(i+1)+"\t"+daftar[i]);
        }
        System.out.println("");
        System.out.print("Nama Peminjam                  : ");
        String nama =in.nextLine();
        System.out.print("Institusi Peminjam             : ");
        String institusi =in.nextLine();
        System.out.print("Nomor HP Peminjam              : ");
        String nohp =in.nextLine();
        int tanggal;
        int tgl1=0;
        System.out.print("Masukkan Tanggal Pinjam (1-31) : ");
        tanggal = in.nextInt();
        if((tanggal<0) || (tanggal>31) ){
            System.out.println("Tanggal Salah");
        }else {
            if(tanggal<25){
                tgl1=tanggal+7;
            } if (tanggal>=25) {
                tgl1=(tanggal+7)-30;
            }
        }
        System.out.println("");
        int jumlah, kode;
        System.out.print("Jumlah Buku Yang Ingin Diperpanjang Peminjamannya : ");
        jumlah = in.nextInt();
        for(int x=0; x<jumlah; x++){
            System.out.print("Masukkan Kode Buku : ");
            kode = in.nextInt();
            switch (kode) {
                case 1:
                    System.out.println("Anda Telah Memperpanjang Peminjaman Buku " + daftar[0]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Anda Telah Memperpanjang Peminjaman Buku " + daftar[1]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Anda Telah Memperpanjang Peminjaman Buku " + daftar[2]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Anda Telah Memperpanjang Peminjaman Buku " + daftar[3]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Anda Telah Memperpanjang Peminjaman  Buku " + daftar[4]);
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Anda Telah Memperpanjang Peminjaman  Buku " + daftar[5]);
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Buku Tidak Tersedia");
                    System.out.println("----------------------------------------------------");
                    break;
                }
            }
        int biaya;
        biaya=jumlah*5000;
        System.out.println("");
        System.out.println("....................................................");
        System.out.println("           BUKTI PERPANJANGAN PEMINJAMAN BUKU");
        System.out.println("....................................................");
        System.out.println("Nama Peminjam                 :" + nama);
        System.out.println("Institusi Peminjam            :" + institusi);
        System.out.println("Nomor HP Peminjam             :" +nohp);
        System.out.println("Jumlah Buku Yang Dipinjam     :" + jumlah + " Buku");
        System.out.println("Tanggal Peminjaman Buku       :" + tanggal);
        System.out.println("Batas Perpanjangan Peminjaman (7 Hari) :" + tgl1);
        System.out.println("Silahkan Membayar Biaya Peminjaman Sebesar Rp " + biaya);
        System.out.println("");
        System.out.println("NB : JIKA PERPANJANGAN LEBIH DARI 7 HARI AKAN MENDAPAT DENDA");
        System.out.println("     JIKA INGIN MEMINJAM LEBIH LAMA LAKUKAN PERPANJANGAN TERLEBIH DAHULU");
        ulangi();
    }
    
    static void keluar_program(){
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("           ~~~TERIMA KASIH TELAH BERKUNJUNG~~~");
        System.out.println("========================================================");
    }
    
    public static void main(String[] args) {
        loading();
        System.out.println("");
        System.out.println("");
        menu_utama();
    }
}