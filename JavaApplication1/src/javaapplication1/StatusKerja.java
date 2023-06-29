import java.util.Scanner;
public class StatusKerja{
	public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    int status1, status2, umur; 
    int pendapatan, tanggungan, biayaHidup;
    String status;
    System.out.print("Masukkan umur : ");
    umur=sc.nextInt();
    
    if (umur>=18) {
        System.out.print("Apakah Anda bekerja (1 = ya, 0 = tidak) ? ");
            status1=sc.nextInt();
        if (status1==0) {
            System.out.print("Penduduk Miskin");
        } else if (status1==1){
            System.out.print("Masukkan Pendapatan perbulan\t\t: ");
            pendapatan=sc.nextInt();
            System.out.print("Masukkan Jumlah tanggungan\t\t: ");
            tanggungan=sc.nextInt ();   
            biayaHidup=pendapatan/tanggungan;
            System.out.println("Biaya hidup Anda saat ini adalah\t: " +biayaHidup);
            if (biayaHidup < 300000){
                System.out.print("Penduduk Miskin");
            } else {
            System.out.print("Bukan Penduduk Miskin");
            }
        }  
    }  
    if (umur<18){
        System.out.print("Apakah Anda masih sekolah (1 = ya, 0 = tidak) ? ");
        status2=sc.nextInt();
        if (status2==0){
            System.out.print("Penduduk Miskin");
        }else if (status2==1){
            System.out.print("Bukan Penduduk Miskin");
        }
    }
}
}