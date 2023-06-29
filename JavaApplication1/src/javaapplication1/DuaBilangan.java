import java.util.Scanner;
public class DuaBilangan{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double a, b, c;
   
    System.out.println("=============================================");
    System.out.println(" \t Bagaimana Hubungan Kami? :)");
    System.out.println("=============================================");
    System.out.print("Bilangan pertama\t: ");
    a=sc.nextDouble();
    System.out.print("Bilangan kedua\t\t: ");
    b=sc.nextDouble();
    if (a==b) {
        System.out.println("Bilangan Pertama Sama Dengan Bilangan Kedua");
    }
    else if (a>b) {
        System.out.println("Bilangan Pertama Lebih Besar Bilangan Kedua"); 
    }
    else{
        System.out.println("Bilangan Kedua Lebih Besar Bilangan Pertama");
    }
    }
}