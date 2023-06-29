/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author LENOVO
 */
import backend.*;
public class TestBackend {
    public static void main(String[] args) {
        Kategori kat1 = new Kategori("Novel","Koleksi buku novel");
        Kategori kat2 = new Kategori("Refrensi","Buku refrensi ilmiah");
        Kategori kat3 = new Kategori("Komik","Komik anak-anak");
        Kategori kat4 = new Kategori("asd","Komik anak-anak");
        //kat4.save();
//test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
        //test update
//        kat2.setKeterangan("koleksi buku refensi ilmiah");
//        kat2.save();
        //test delete
        //kat3.delete();
        //test select all
        for(Kategori k : new Kategori().getAll()){
            System.out.println("Nama : "+k.getNama()+",ket: "+k.getKeterangan());
        }
        //test search
//        System.out.println("TEST search");
//        for (Kategori k : new Kategori().search("ilmiah")) {
//            System.out.println("Nama : "+k.getNama()+",ket: "+k.getKeterangan());
//        }
    }
}
