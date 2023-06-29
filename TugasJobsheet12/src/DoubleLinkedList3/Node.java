package DoubleLinkedList3;
public class  Node {

    String nama, nomor;
     Node prev, next;
    
     Node( Node prev, String nomor, String nama,  Node next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
