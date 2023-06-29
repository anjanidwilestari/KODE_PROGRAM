package strukturdata;
import java.util.Scanner;
public class Perulangan {
    static int angka,sisa;
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
        System.out.print("Masukkan NIM : ");
        nim=sc.next();
        System.out.println("========================");
            angka = Integer.parseInt(nim.substring(8,10));
            if(angka<10){
                angka+=10;
            }
        System.out.println("n : "+angka);
        
        String[] hari = {"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"};
        int i=0,j=0;
        do{
            System.out.print(hari[i]+" ");
            i++;
            if(i>6){
                i=0;
            }
            j++;
        }while(j!=angka);
    }
}

