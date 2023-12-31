package DoubleLinkedList2;

public class DLL {

    Node head;
    int size;

    public DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
        Node newNode = new Node(current, item, null);
        current.next = newNode;
        size++;
        }
    }
    public int size() {
        return size;
    }    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists kosong");
        }
    } 
    public void pop()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat diambil!");
        }else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next=null;
        size--;
    }
    public String peek()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }   
}
