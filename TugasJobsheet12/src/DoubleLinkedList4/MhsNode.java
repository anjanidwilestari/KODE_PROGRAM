package DoubleLinkedList4;
public class  MhsNode {

    String nim, nama;
    double ipk;
     MhsNode prev, next;
    
     MhsNode( MhsNode prev, String nim, String nama, double ipk,  MhsNode next){
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }
}

