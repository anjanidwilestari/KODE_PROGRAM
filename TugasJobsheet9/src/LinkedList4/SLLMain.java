package LinkedList4;
public class SLLMain {
    public static void main(String[] args) {
        SingleLingkedList singLL = new SingleLingkedList();
        singLL.print();
        singLL.addFirst("Anjani", "Jln Juanda", "12345");
        singLL.print(); 
        singLL.addLast("Ardian", "Jln Soekarno Hatta", "67890");
        singLL.print(); 
        singLL.insertAfter("Anjani", "Ayi", "Jln Bung Tomo", "23456");
        singLL.print(); 
        singLL.insertAt(2,"Nanik", "Jln Mondoroko", "34567");
        singLL.print(); 
        singLL.insertBefore("Nanik","John", "Jln Cemara", "45678");
        singLL.print(); 

        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("");
        System.out.println("Data Jln Mondoroko berada di indeks ke- " + singLL.indexOf("Nanik"));
        System.out.println("");

        singLL.remove("Nanik"); 
        singLL.print(); 
        singLL.removeAt(1); 
        singLL.print(); 
        singLL.removeFirst(); 
        singLL.print(); 
        singLL.removeLast(); 
        singLL.print(); 
    }
}

