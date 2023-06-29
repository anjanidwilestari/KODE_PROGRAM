package kuis2;
public class Node {
    String judul, penerbit, tahun, jumhal;
    Node next;
    public Node(String judul, String penerbit, String tahun, String jumhal, Node berikutnya){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.jumhal= jumhal;
        this.next = berikutnya;
    }
}    

