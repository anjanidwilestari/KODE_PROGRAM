package belajararray;
import java.util.Scanner;
public class NamaBulan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	
        int n=0;
        int [] month = new int [12];
        String[] bulan={"Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.println("MENAMPILKAN NAMA BULAN SESUAI ANGKA YANG ANDA MASUKKAN");
        System.out.println("======================================================");
        
        
        for (int i=1; i< 2; i++){
            System.out.print ("Masukkan angka : " );
            month [i] = sc.nextInt();
        }
        
        for (int i=1; i<2; i++){
            if (month[i]==1){
                System.out.println("Nama Bulan 1 adalah " + bulan[0]);
            } else if (month[i]==2) {
                System.out.println("Nama Bulan 2 adalah " + bulan[1]);    
            } else if (month[i]==3) {
                System.out.println("Nama Bulan 3 adalah " + bulan[2]);    
            } else if (month[i]==4) {
                System.out.println("Nama Bulan 4 adalah " + bulan[3]);    
            } else if (month[i]==5) {
                System.out.println("Nama Bulan 5 adalah " + bulan[4]);    
            } else if (month[i]==6) {
                System.out.println("Nama Bulan 6 adalah " + bulan[5]);    
            } else if (month[i]==7) {
                System.out.println("Nama Bulan 7 adalah " + bulan[6]);    
            } else if (month[i]==8) {
                System.out.println("Nama Bulan 8 adalah " + bulan[7]);    
            } else if (month[i]==9) {
                System.out.println("Nama Bulan 9 adalah " + bulan[8]);    
            } else if (month[i]==10) {
                System.out.println("Nama Bulan 10 adalah " + bulan[9]);    
            } else if (month[i]==11) {
                System.out.println("Nama Bulan 11 adalah " + bulan[10]);    
            } else if (month[i]==12) {
                System.out.println("Nama Bulan 12 adalah " + bulan[11]);    
            }else {
                System.out.println("Nama Bulan " + month[i] + " Tidak ada");    
            }
        } 
    }
}
    
    