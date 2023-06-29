import java.util.Scanner;
public class SudutSegitiga{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double a, b, c, s;
   
    System.out.println("=============================================");
    System.out.println("   Menentukan Segitiga atau Bukan Segitiga");
    System.out.println("=============================================");
    System.out.print("\nSudut pertama\t: ");
    a=sc.nextDouble();
    System.out.print("\nSudut kedua\t: ");
    b=sc.nextDouble();
    System.out.print("\nSudut ketiga\t: ");
    c=sc.nextDouble();
    s= a+b+c;
    if ( s == 180 ){
        System.out.println("Bangun tersebut termasuk segitiga");
    } else {
        System.out.println("Bangun tersebut bukan termasuk segitiga");
    }

}
}