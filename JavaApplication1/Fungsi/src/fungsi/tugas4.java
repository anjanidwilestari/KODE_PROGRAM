package fungsi;
import java.util.Scanner;
public class tugas4 {
    static int nilaiMhs(){
        Scanner in=new Scanner (System.in);
        int []nilaiMHS=new int [10];
        for (int i=0; i<nilaiMHS.length; i++){
            System.out.print("Masukkan nilai ke- " +i+" : ");
            nilaiMHS[i]=in.nextInt();
        }
    return 0;
    }
    static int max(){
        int a[]=new int [10];
        int b[]=new int [10];
        b=a;
        Scanner in = new Scanner (System.in);
        for (int i=0;i<b.length;i++){
            System.out.print("Masukkan nilai ke- " +i+" : ");
            b[i]=in.nextInt();
        }
        int max =b[0];
        for (int i=0;i<b.length;i++){
            if(b[i]>max){
                max=a[i];
            }
        }
        return max;
        }
        static int min(){
        int a[]=new int [10];
        int b[]=new int [10];
        b=a;
        Scanner in = new Scanner (System.in);
        for (int i=0;i<b.length;i++){
            System.out.print("Masukkan nilai ke- " +i+" : ");
            a[i]=in.nextInt();
        }
        int min =b[0];
        for (int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        return min;
        }
    public static void main(String[] args) {
        System.out.println("Nilai Terbesar adalah : "+max());
        System.out.println("Nilai Terkecil adalah : "+min());
    }
    
}
