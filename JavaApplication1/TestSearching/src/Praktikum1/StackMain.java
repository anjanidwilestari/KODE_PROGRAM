package Praktikum1;
public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();
        stk.push(18);
        stk.push(40);
        stk.pop();
        stk.peek();
        stk.print();
    }
}

