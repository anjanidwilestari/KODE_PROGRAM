import java.util.Scanner;
public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in );
        int i, nilai, faktor;
        System.out.print("Masukkan angka : ");
        nilai = input.nextInt();
        System.out.print("Faktor ganjilnya adalah ");
        faktor = 0;
        for (i = 0;  i<= nilai; i++) {
            faktor++;
            if (nilai % faktor == 0) {
                if(faktor%2==1){
                    System.out.print(faktor + " ");
                }          
            }
        }
    }
}