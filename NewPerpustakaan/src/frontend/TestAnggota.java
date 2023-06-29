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
public class TestAnggota {
    public static void main(String[] args) {
        System.out.println("TEST anggota");
        Anggota a = new Anggota("aldi","suhat","1234");
        Anggota b = new Anggota("bareto","malang","4567");
        Anggota c = new Anggota("Slamet","surabaya","7899");
        a.save();
        //b.save();
        //a.delete();
        for (Anggota k: new Anggota().getAll()) {
            System.out.println(k.getNama()+" "+k.getAlamat()+" "+k.getTelepon());
        }
    }
}
