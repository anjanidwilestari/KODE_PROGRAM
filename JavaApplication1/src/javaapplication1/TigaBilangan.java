import java.util.Scanner;
public class TigaBilangan{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double a, b, c;
   
    System.out.println("=============================================");
    System.out.println(" Manakah Bilangan Terbesar diantara kami? :)");
    System.out.println("=============================================");
    System.out.print("Bilangan pertama\t: ");
    a=sc.nextDouble();
    System.out.print("Bilangan kedua\t\t: ");
    b=sc.nextDouble();
    System.out.print("Bilangan ketiga\t\t: ");
    c=sc.nextDouble();
    
    if ( a>b && a>c) {
        System.out.println("Bilangan terbesar adalah " +a);
    } else if (b>a && b>c){
        System.out.println("Bilangan terbesar adalah " +b);
    } else if (c>a && c>b){
        System.out.println("Bilangan terbesar adalah " +c);
    } else {
        System.out.println("Ketiga bilangan memiliki nilai yang sama besar");
    }    
    }
}