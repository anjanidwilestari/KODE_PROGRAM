import java.util.Scanner;
public class PerulanganPotongan1{
	public static void main(String[] args){
    Scanner input= new Scanner (System.in);
    int n = 5;
    boolean stop = false;
    int i = 1;
    while (!stop) {
        if (i >= n) {
            stop = true;
        } else {
        if (i % 2 == 1) {
            System.out.print("#");
        } else {
            System.out.print("*");
        }
            i++;
        }
    }
}
}