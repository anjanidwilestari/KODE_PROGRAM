package TugasJobsheet7;
public class TugasNo1 {
    int size,top;
    String data;
    
    public void konversi (String Q){
        char c;
        for (int i = 0; i < size; i++) {
            c = Q.charAt(i);
            push (c);
        }
    }
    public TugasNo1(int s, String d) {
        this.size = s;
        this.data = d;
        top = -1;
    }
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }    
    public void push(char dt) {
        if (!IsFull()) {
            top++;
            dt = data.charAt(top) ;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }   
    public void print(){
        System.out.println("Hasil : ");
        for (int i = top; i >= 0; i--) {
            System.out.print( data.charAt(i));
        }System.out.println("");
    }  
}
