package minggu2;
public class Game {
String id, namaMember, namaGame;
int lamaPinjam,hargaSatuan;

Game(){
}
Game(String i, String nm, String ng, int lp, int hs){
    id = i;
    namaMember = nm;
    namaGame = ng;
    lamaPinjam = lp;
    hargaSatuan=hs;
}
void tampilBarang(){
    System.out.println("ID Member       = "+id);
    System.out.println("Nama Member     = "+namaMember);
    System.out.println("Nama Game       = "+namaGame);
    System.out.println("Lama Peminjaman = "+lamaPinjam);
    System.out.println("Harga Satuan    = "+hargaSatuan);
}

int hitungHargaTotal(){
    return lamaPinjam*hargaSatuan;
}
}


