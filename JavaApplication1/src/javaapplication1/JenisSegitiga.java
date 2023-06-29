import java.util.Scanner;
public class JenisSegitiga{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double a, b, c, s;
   
    System.out.println("=============================================");
    System.out.println("\tMenentukan Jenis Segitiga");
    System.out.println("=============================================");
    System.out.print("\nSudut pertama\t: ");
    a=sc.nextDouble();
    System.out.print("\nSudut kedua\t: ");
    b=sc.nextDouble();
    System.out.print("\nSudut ketiga\t: ");
    c=sc.nextDouble();
    s=a+b+c;
    if ((a==b)&&(b==c) && (c==a) && s==180){
        System.out.println("Segitiga Sama Sisi");
    }
    else if ((a==b) || (b==c) || (c==a) && s==180){
        System.out.println("\nSegitiga Sama Kaki");
    }
    else if (a==90 && b==45 && c==45 ){
        System.out.println("\nSegitiga Siku-siku");
    }
    else if (a==45 && b==90 && c==45 ){
        System.out.println("\nSegitiga Siku-siku");
    }
    else if (a==45 && b==45 && c==90 ){
        System.out.println("\nSegitiga Siku-siku");
    }
    else {
        System.out.println("\nBukan Segitiga");
    }    
    }
}