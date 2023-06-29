/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class DemoGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Peminjaman pinjam = new Peminjaman();
        Member mm = new Member();
        Peminjaman[] pjm = new Peminjaman[2];
        Game gm = new Game();
        int pilihMenu;
        char menu ='y';
        System.out.println("====================================");
        System.out.println("       SISTEM RENTAL VIDEO GAME");
        System.out.println("             TERLENGKAP");
        System.out.println("        Jl.Polinema JTI Malang");
        System.out.println("====================================");
        System.out.println("------------------------------------");
        System.out.println("              MENU UTAMA");
        System.out.println("------------------------------------");
        System.out.println("1. Peminjaman");
        System.out.println("2. Pengembalian");
        System.out.println("------------------------------------");
        System.out.print("Masukkan pilihan : ");
        pilihMenu = sc.nextInt();
        System.out.println();
        switch(pilihMenu){
            case 1:
                for(int i=0;i<pjm.length;i++){
                System.out.println("------------------------------------");
                System.out.println("             PEMINJAMAN");
                System.out.println("------------------------------------");
                pjm[i] = new Peminjaman();
                System.out.print("ID Member \t : ");
                mm.idMember = sc.nextInt();
                System.out.print("Nama Member \t : ");
                sc.nextLine();
                mm.nama = sc.nextLine();
                System.out.print("No HP \t\t : ");
                mm.noHP = sc.nextLine();
                System.out.print("Alamat \t\t : ");
                mm.alamat = sc.nextLine();
                pjm[i].pMember = mm;
                System.out.print("Kode Game \t : ");
                gm.idGame = sc.nextLine();
                System.out.print("Judul Game \t : ");
                gm.namaGame = sc.nextLine();
                System.out.print("Harga Game \t : ");
                gm.hargaGame = sc.nextInt();
                pjm[i].pGame = gm;
                System.out.print("Tanggal Pinjam \t : ");
                sc.nextLine();
                pjm[i].tglPinjam = sc.nextLine();
                System.out.print("Lama Pinjam \t : ");
                pjm[i].lamaPinjam = sc.nextInt();
                System.out.print("Tanggal Kembali  : ");
                sc.nextLine();
                pjm[i].tglKembali = sc.nextLine();
                System.out.println("------------------------------------");
                System.out.println();
                    if(i>0){
                        if(pjm[i-1].pMember.idMember == pjm[i].pMember.idMember){
                            System.out.println("Mohon maaf, anda hanya dapat meminjam 1 kali :),Mohon kembali besok");
                            
                        } else {
                            pjm[i].cetakStruk();
                        }
                    } else {
                        pjm[i].cetakStruk();
                    }
                }
                break;
            case 2:
                System.out.println("Mohon maaf server sedang down");
                break;
            default : System.out.println("Maaf, angka yang anda masukkan salah");
        }
    }
}
