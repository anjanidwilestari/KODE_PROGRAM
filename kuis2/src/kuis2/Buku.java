package kuis2;
public class Buku {
    Node head;
    Node tail;
    
    public boolean isEmpty(){
        return head==null;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            int urutan = 0;
            System.out.println("=======ISI TUMPUKAN=======");
            while (tmp != null) {
                System.out.println("Buku ke-" + urutan + " : ");
                System.out.println("Judul\t\t: " + tmp.judul);
                System.out.println("Penerbit\t: " + tmp.penerbit);
                System.out.println("Tahun Terbit\t: " + tmp.tahun);
                System.out.println("Jumlah Halaman\t: " + tmp.jumhal);
                System.out.println("");
                tmp = tmp.next;
                urutan++;
            }
            System.out.println("_________________________________________");
        } else {
        System.out.println("Tumpukan kosong");
        }
    }
    public void addData(String j, String p, String t, String h){
        Node ndInput =new Node (j, p, t, h, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void peekPosition(String key) {
        Node tmp = head;
        int indeks = 0;
        while (tmp != null && (!(tmp.judul.equals(key)))) {
            tmp = tmp.next;
            indeks++;
        }
        if (tmp == null) {
            System.out.println("Tumpukan Kosong");
        } else {
            System.out.println("Data " + key + " berada pada indeks ke " + indeks);
        }
        System.out.println("_________________________________________");
    }
}
