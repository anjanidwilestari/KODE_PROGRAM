package minggu3new;
import java.util.Scanner;
public class ipkMahasiswa {
    static Scanner sc = new Scanner (System.in);
    static void setIpk(double[]ipk,int i){
        for (int a=0;a<3;a++){
            if (a==1){
                System.out.print("Masukkan IPK\t= ");
                ipk[i]=sc.nextDouble();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa [] mhs = new Mahasiswa[3];
        Mahasiswa ma = new Mahasiswa();
        double[]ipk=new double[3];        
        for(int i=0;i<3;i++){
            mhs[i]=new Mahasiswa();
            System.out.println("Data Mahasiswa ke "+(i+1));
            System.out.print("Masukkan Nama\t= ");
            mhs[i].nama=sc.nextLine();
            System.out.print("Masukkan NIM\t= ");
            mhs[i].nim=sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin\t= ");
            mhs[i].jeniskelamin=sc.nextLine();
            setIpk(ipk,i);
            System.out.println("");
        }
        for(int i=0;i<3;i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("Nama          : "+mhs[i].nama);
            System.out.println("Nim           : "+mhs[i].nim);
            System.out.println("Jenis Kelamin : "+mhs[i].jeniskelamin);
            System.out.println("Nilai IPK     : "+ipk[i]); 
        }
        System.out.print("IPK Rata-rata seluruh mahasiswa = " + ma.hitungRatarata(ipk));
    }
}
