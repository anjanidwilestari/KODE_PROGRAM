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
public class Peminjaman {
    public String idPeminjam;
    public String tglPinjam;
    public String tglKembali;
    public int lamaPinjam;
    public Game pGame;
    public Member pMember;
    
    public int hitungHarga(){
        int totalHarga = pGame.hargaGame * lamaPinjam;
        return totalHarga;
        
    }
    public void cetakStruk(){
        System.out.println("==========================================");
        System.out.println("            STRUK RENTAL GAME");
        System.out.println("==========================================");
        System.out.println("ID Member\t\t : "+pMember.idMember );
        System.out.println("Nama Member \t\t : "+pMember.nama);
        System.out.println("No HP \t\t\t : "+pMember.noHP);
        System.out.println("Alamat \t\t\t : "+pMember.alamat);
        System.out.println("Kode Game \t\t : "+pGame.idGame);
        System.out.println("Nama Game \t\t : "+pGame.namaGame);
        System.out.println("Tanggal Pinjam \t\t : "+tglPinjam);
        System.out.println("Batas Pengembalian \t : "+tglKembali);
        System.out.println("Total Harga \t\t : Rp "+hitungHarga());
        System.out.println("Denda Telat/Hari \t : Rp 3000");
        System.out.println("==========================================");
        System.out.println("        JANGAN LUPA DIKEMBALIKAN");
        System.out.println("               TERIMAKASIH");
        System.out.println("==========================================");
        System.out.println();
        
    }
}
