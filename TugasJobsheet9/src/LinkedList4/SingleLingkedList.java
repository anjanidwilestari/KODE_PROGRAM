package LinkedList4;
public class SingleLingkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("Nama\t\t: " + tmp.nama);
                System.out.println("Alamat\t\t: " + tmp.alamat);
                System.out.println("Nomor Rekening\t: "+ tmp.rekening);
                System.out.println("____________________________________________");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(String n, String a, String r){
        Node ndInput = new Node(n, a, r, null);
        if (isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(String n, String a, String r){
        Node ndInput = new Node(n, a, r, null);
        if (isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertBefore(String key, String n, String a, String r){
        int index = indexOf(key);
        insertAt(index, n, a, r);
    }
    
    public void insertAfter(String key, String n, String a, String r){
        Node ndInput = new Node(n, a, r, null);
        Node temp = head;
        do {
            if (temp.nama.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                    if (ndInput.next == null) tail = ndInput;
                    break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, String n, String a, String r){
        if (index < 0){
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(n, a, r);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(n, a, r, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public String getData(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nama;
    }
    
    public int indexOf(String key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && !tmp.nama.equals(key)){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else{
            return index;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else{
            Node temp = head;
            while(temp.next != tail){
            temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

public void remove(String key){
    if (isEmpty()) {
        System.out.println("Linked list masih kosong, tidak dapat dihapus!");
    } else{
        Node temp = head;
        while(temp != null){
            if ((temp.nama.equals(key)) && (temp == head)) {
                this.removeFirst();
                break;
        } else if (temp.next.nama.equals(key)) {
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }   
            break;
        }
        temp = temp.next;
        }
    }
}

    public void removeAt(int index){
        if (index == 0) {
            removeFirst();
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}


