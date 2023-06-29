package frontend;
import backend.*;
public class TestBackend {
    public static void main(String[] args) {
        
//  TEST BACKEND KATEGORI        
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");

        //test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();

//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//
//        // test delete
//        kat1.delete();
//
//        // test select all
//        for(Kategori k : Kategori.getAll()) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//
//        // test search
//        for(Kategori k : Kategori.search("referensi")) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
    


// TEST BACKEND BUKU
      Kategori novel = new Kategori("Novel", "Koleksi buku novel");
      Kategori referensi = new Kategori("Referensi", "Buku referensi ilmiah");

        //test getById
        Kategori kat1 = Kategori.getById(25);

        if (kat1 != null) { 
            System.out.println(kat1.getNama());
        }

        novel.save(); 
        referensi.save();

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin"); 
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

//        // test insert 
//        buku1.save();
//        buku2.save();
//        buku3.save();

        // test update 
        buku2.setJudul("Aljabar Linier"); 
        buku2.save();

        //test getById
        Buku buku = Buku.getById(1);

        if (buku != null) {
            System.out.println("Kategori: " + buku.getKategori().getNama() + ", Judul: " + buku.getJudul());
        }

        // test delete 
        buku3.delete();

        // test select all
        for(Buku b : Buku.getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for(Buku b : Buku.search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    
    }
}


//  Cara reset id auto_increment ke id "1" lagi di localhost/phpmyadmin
//  ALTER TABLE kategori drop idkategori;
//  ALTER TABLE kategori ADD idkategori int(11) not null auto_increment primary key first;
//  ALTER TABLE `buku` ADD FOREIGN KEY (`idkategori`) REFERENCES `kategori`(`idkategori`) ON DELETE RESTRICT ON UPDATE RESTRICT;