package minggu5.tugas;
import java.util.Scanner;
public class MainNilaiAlgoritma3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //membuat inputan jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        System.out.println("");
        //membuat objek dan menginstansiasi array
        NilaiAlgoritma3 mhs[] = new NilaiAlgoritma3[jumlah];
        //membuat objek baru dan instansiasi
        NilaiAlgoritma3 al = new NilaiAlgoritma3();
        //menginputkan data mahasiswa secara berulang sesuai inputan
        for(int i = 0; i < mhs.length; i++){
            mhs[i] = new NilaiAlgoritma3();
            input.nextLine();
            System.out.println("Mahasiswa Ke-" + (i+1));
            System.out.print("Nama Mahasiswa : ");
            mhs[i].namaMhs = input.nextLine();
            System.out.print("Nilai Tugas Algoritma : ");
            mhs[i].nilaiTugas = input.nextInt();
            System.out.print("Nilai Kuis Algoritma : ");
            mhs[i].nilaiKuis = input.nextInt();
            System.out.print("Nilai UTS Algoritma : ");
            mhs[i].nilaiUTS = input.nextInt();
            System.out.print("Nilai UAS Algoritma : ");
            mhs[i].nilaiUAS = input.nextInt();
            System.out.println("");
        }
        //menampilkan total nilai masing-masing mahasiswa secara berulang
        for (int i = 0; i < mhs.length; i++){
            System.out.println("Total Nilai Mahasiswa ke-" + (i+1) + ": " + mhs[i].hitungTotalNilai());
            //menampilkan nilai rata-rata total nilai mahasiswa
            al.hitungRerata(mhs[i].hitungTotalNilai());
        }
        System.out.println("Rata-Rata Nilai Algoritma adalah " + (al.total)/jumlah);
    }
}

