import java.util.Scanner;
    public class UTS1{
        public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int a, b, c;
       
        System.out.println("=======================================================");
        System.out.println(" MENENTUKAN BILANGAN TERBESAR DIANTARA 3 BILANGAN BULAT");
        System.out.println("=======================================================");
        System.out.print("Masukkan bilangan 1 : ");
        a=sc.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        b=sc.nextInt();
        System.out.print("Masukkan bilangan 3 : ");
        c=sc.nextInt();
        
        if ( a>b && a>c) {
            System.out.println("Bilangan terbesar adalah " +a);
        } else if (b>a && b>c){
            System.out.println("Bilangan terbesar adalah " +b);
        } else if (c>a && c>b){
            System.out.println("Bilangan terbesar adalah " +c);
        } else {
            System.out.println("Ketiga bilangan sama besar");
        }    
        }
    }