package fungsi;
import java.util.Scanner;
class Prak4 {
    static int Kali (int C, int D){
        int H;
        H=(C+10)% (D+19);
        return H;
    }
    static int Kurang(int A, int B){
        int X;
        A=A+7;
        B=B+4;
        X=Kali(A,B);
        return X;
    }
    static String cek(int A,int B){
        String C;
        if (A>=0 && B>=0){
            String D = " Sudah Memenuhi ";
            C=D;
        }
        else {
            String E= " Belum Memenuhi " ;
            C=E;
        }
        return C;
    }
    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan Nilai 1 : ");
        nilai1=input.nextInt();
        System.out.print("Masukkan Nilai 2 : ");
        nilai2=input.nextInt();
        int hasil = Kurang (nilai1, nilai2);
        System.out.println("Hasil akhir adalah "+hasil);
        System.out.println("Apakah Nilai yang dimasukkan >=0 ?" + cek(nilai1,nilai2));   
    }
}
