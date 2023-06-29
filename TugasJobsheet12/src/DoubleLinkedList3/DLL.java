package DoubleLinkedList3;
public class  DLL {

     Node head;
    int size;

    public  DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nomor, String nama) {
        if (isEmpty()) {
            head = new  Node(null, nomor, nama, null);
        } else {
             Node newNode = new  Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
             Node current = head;
            while (current.next != null) {
                current = current.next;
            }
             Node newNode = new  Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.nama+" telah selesai divaksinasi.");
            removeLast();            
        } else {
            System.out.println(head.nama+" telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;            
        }
        print();
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
         Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public int size() {
        return size;
    }
    public void print() {
        if (!isEmpty()) {
             Node tmp = head;
            while (tmp != null) {
                System.out.println("|  "+tmp.nomor +"  |   "+tmp.nama+ "    |");
                tmp = tmp.next;                
            }
            System.out.println("\nsisa antrian : "+size());            
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
