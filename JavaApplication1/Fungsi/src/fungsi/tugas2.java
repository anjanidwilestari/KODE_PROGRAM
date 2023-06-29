package fungsi;
import java.util.Scanner;
public class tugas2 {
    static int nilaiMhs(){
        Scanner input = new Scanner(System.in);
        int [] nilaiMHS = new int[10];
        int total = 0;
        for(int i=0; i<nilaiMHS.length; i++ ){
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+":");
            nilaiMHS[i]=input.nextInt();
        }
        for (int i=0; i<nilaiMHS.length; i++){
            total +=nilaiMHS [i];
        }
        return total;
        }
        static double rataNilai (){
            double rata = nilaiMhs()/10;
            return rata;
        }
    public static void main(String[] args) {
        System.out.println("Rata-rata nilai mahasiswa : " +rataNilai());
    }
}

