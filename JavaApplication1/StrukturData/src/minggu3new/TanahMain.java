package minggu3new;
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Jumlah tanah : ");
        n= sc.nextInt();
        Tanah [] tn = new Tanah[n];
        for(int i=0;i<n;i++){
            tn[i]=new Tanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang\t= ");
            tn[i].panjang=sc.nextInt();
            System.out.print("Lebar\t= ");
            tn[i].lebar=sc.nextInt();
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.println("Luas Tanah"+(i+1)+  " = " + tn[i].LuasTanah());
        }
        tn[0].hitungLuas(tn);
        }
    }

