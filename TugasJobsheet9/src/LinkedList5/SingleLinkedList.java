package LinkedList5;
public class SingleLinkedList {
    Node head; 
    Node tail; 
    public boolean isEmpty(){
        return head == null;
    }
    public void Enqueue(String nama, String alamat, String rekening) {
        Node ndInput = new Node(nama, alamat, rekening, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void Dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Kosong!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
            System.out.println("Yey, Dequeue Berhasil!!!");
        }
        System.out.println("_________________________________________");
    }
    public void peek() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == head) {
                    System.out.println("Data paling depan : ");
                    System.out.println("Nama\t\t: " + tmp.nama);
                    System.out.println("Alamat\t\t: " + tmp.alamat);
                    System.out.println("Nomor Rekening\t: " + tmp.rekening);
                }
                tmp = tmp.next;
            }
            System.out.println("	");
        } else {
        System.out.println("Queue Masih Kosong");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Data paling belakang : ");
                    System.out.println("Nama\t\t: " + tmp.nama);
                    System.out.println("Alamat\t\t: " + tmp.alamat);
                    System.out.println("Nomor Rekening\t: " + tmp.rekening);
                }
                tmp = tmp.next;
            }
            System.out.println("_________________________________________");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    public void peekAt(int indeks) {
        if(isEmpty()){
            System.out.println("Queue Masih Kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < indeks; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Indeks ke-" + indeks + " adalah ");
            System.out.println("Nama\t\t: " + tmp.nama);
            System.out.println("Alamat\t\t: " + tmp.alamat);
            System.out.println("Nomor Rekening\t: " + tmp.rekening);
            System.out.println("_________________________________________");
        }
    }
    public void peekPosition(String key) {
        Node tmp = head;
        int indeks = 0;
        while (tmp != null && (!(tmp.nama.equals(key)))) {
            tmp = tmp.next;
            indeks++;
        }
        if (tmp == null) {
            System.out.println("Queue Kosong");
        } else {
            System.out.println("Data " + key + " berada pada indeks ke " + indeks);
        }
        System.out.println("_________________________________________");
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            int urutan = 0;
            System.out.println("= = = ISI STACK = = = ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urutan + " : ");
                System.out.println("Nama\t\t: " + tmp.nama);
                System.out.println("Alamat\t\t: " + tmp.alamat);
                System.out.println("Nomor Rekening\t: " + tmp.rekening);
                System.out.println("");
                tmp = tmp.next;
                urutan++;
            }
            System.out.println("_________________________________________");
        } else {
        System.out.println("Queue kosong");
        }
    }
}


