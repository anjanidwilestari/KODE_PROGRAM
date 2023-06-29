import java.util.Scanner;
public class MenentukanSegitiga{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    double s1, s2, s3;
   
    System.out.println("=============================================");
    System.out.println("\tMenentukan Jenis Segitiga");
    System.out.println("=============================================");
    System.out.print("\nPanjang sisi pertama\t: ");
    s1=sc.nextDouble();
    System.out.print("\nPanjang sisi kedua\t: ");
    s2=sc.nextDouble();
    System.out.print("\nPanjang sisi ketiga\t: ");
    s3=sc.nextDouble();
    
    if ((s1==s2)&&(s2==s3 && s1==s2)){
        System.out.println("Segitiga Sama Sisi");
    }
    else if ((s2==s1) || (s2==s3 || s1==s3)){
        System.out.println("\nSegitiga Sama Kaki");
    }
    else if (s1==s2 && s2==s3 && s3==s1 && s2==s3){
        System.out.println("\nSegitiga Sama Sisi");
    }
    else {
        System.out.println("\nSegitiga Sembarang");
    }    
    }
}