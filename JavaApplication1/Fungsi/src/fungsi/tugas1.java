package fungsi;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
       int nil1=in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nil2=in.nextInt();
        System.out.print("Masukkan nilai 3 : ");
        int nil3=in.nextInt();  
        max3(nil1,nil2,nil3);
    }   
    
    static void max3(int nil1 , int nil2, int nil3){
        if((nil1>nil2)&&(nil1>nil3)){
        System.out.println("Bilangan terbesar adalah nilai 1 ");
    }
        if((nil2>nil1)&&(nil2>nil3)){
        System.out.println("Bilangan terbesar adalah nilai 2 ");
    }
        if((nil3>nil1)&&(nil3>nil2)){
            System.out.println("Bilangan terbesar adalah nilai 3 ");
        }
    }
}