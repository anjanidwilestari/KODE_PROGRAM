package DoubleLinkedList4;
public class  MhsDLL {
     MhsNode head;
    int size;

    public  MhsDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nama, double ipk) {
        if (isEmpty()) {
            head = new  MhsNode(null, nim, nama, ipk, null);
        } else {
             MhsNode newNode = new  MhsNode(null, nim, nama, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nim, String nama, double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else {
             MhsNode current = head;
            while (current.next != null) {
                current = current.next;
            }
             MhsNode newNode = new  MhsNode(current, nim, nama, ipk, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(String nim, String nama, double ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else {
             MhsNode current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                 MhsNode newNode = new  MhsNode(null, nim, nama, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                 MhsNode newNode = new  MhsNode(current.prev, nim, nama, ipk, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void print() {
        if (!isEmpty()) {
             MhsNode tmp = head;
            while (tmp != null) {
                System.out.println("NIM: "+tmp.nim);
                System.out.println("Nama : "+tmp.nama);
                System.out.println("ipk : "+tmp.ipk);
                tmp = tmp.next;
            }
            System.out.println("semua data berhasil dicetak");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
         MhsNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else if (index == 0) {
            removeFirst();
        } else {
             MhsNode current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void search(String nim)throws Exception{
        int i=0;
        boolean search=false;
         MhsNode current=head;
        if(head==null){
            System.out.println("List masih kosong!");
            return;
        }
        while(current!=null){
            if(current.nim.equalsIgnoreCase(nim)){
                search=true;
                break;
            }
            current=current.next;
            i++;
        }
        if(search){
            System.out.println("Data "+nim+" berada di node ke-"+i);
            System.out.println("IDENTITAS :");
            System.out.println("NIM : "+current.nim);
            System.out.println("Nama : "+current.nama);
            System.out.println("ipk : "+current.ipk);
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    public void bubbleSort()throws Exception{
         MhsNode current=null, idx=null;
         MhsNode tmp;
        if(head==null){
            return;
        } else{
            for(current=head; current.next!=null; current=current.next){
                for(idx=current.next; idx!=null; idx=idx.next){
                    if(current.ipk<idx.ipk){
                        tmp=current;
                        current=idx;
                        idx=tmp;
                    }
                }
            }
        }
        print();
    }
}
