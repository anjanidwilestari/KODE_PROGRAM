package javaapplication1;
import java.util.Scanner;
public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in );
        int i;
        System.out.print("Masukkan tahun : ");
        i = input.nextInt();
            if (i%100==0 && i % 400 != 0 ){
                System.out.println("Bukan termasuk Tahun Kabisat");
            } else if (i%100!=0 && i%4==0){
                System.out.println("Termasuk Tahun Kabisat" );
            } else if (i%100==0 && i % 400 == 0){
                System.out.println("Termasuk Tahun Kabisat" );
            } else if (i%2==1) {
               System.out.println("Bukan termasuk Tahun Kabisat"); 
            } else {
                System.out.println("Bukan termasuk Tahun Kabisat");
            }
    }
}
