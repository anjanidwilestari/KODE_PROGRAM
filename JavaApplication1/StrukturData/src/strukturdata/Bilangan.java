package strukturdata;
import java.util.Scanner;
public class Bilangan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan deret (n) : " );
    int n=sc.nextInt();
    System.out.println ("Deret Bilangan Genap kecuali kelipatan 4");
    for(int i=1;i<=(n*4);i++){
        if(i%2==0){
            if(i%4==0){
                continue;
            }
        System.out.print (i+" ");    
        }
    }
}
}
