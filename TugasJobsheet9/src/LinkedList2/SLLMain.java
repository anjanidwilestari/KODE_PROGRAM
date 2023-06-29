package LinkedList2;
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print(); 
        singLL.addFirst('F'); 
        singLL.print(); 
        singLL.addLast('J'); 
        singLL.print(); 
        singLL.insertAt(1, 'H'); 
        singLL.print();
        singLL.insertAfter('F', 'G'); 
        singLL.print(); 
        singLL.insertBefore('J', 'I'); 
        singLL.print();
    }
}

