package minggu4;
import java.util.Scanner;
public class BankAsiaAfricaMain {
    static Scanner sc = new Scanner (System.in);
    static void setSaldo(int[]saldo,int i){
        for (int a=0;a<2;a++){
            if (a==1){
                System.out.print("Masukkan Saldo\t\t= ");
                saldo[i]=sc.nextInt();
            }
        }
    }
    static void setMenabung(int[]saldo,int i){
        for (int a=0;a<2;a++){
            if (a==1){
                System.out.print("Masukkan Saldo\t\t= ");
                saldo[i]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BankAsiaAfrica [] baa = new BankAsiaAfrica[3];
        BankAsiaAfrica ba = new BankAsiaAfrica();
        int[]saldo=new int[2];        
        for(int i=0;i<2;i++){
            baa[i]=new BankAsiaAfrica();
            System.out.println("Data Nasabah ke "+(i+1));
            System.out.print("Masukkan Nama\t\t= ");
            baa[i].nama=sc.nextLine();
            System.out.print("Masukkan Nomor Rekening = ");
            baa[i].nim=sc.nextLine();
            System.out.print("Masukkan Alamat\t\t= ");
            baa[i].alamat=sc.nextLine();
            System.out.print("Masukkan Nomor KTP\t= ");
            baa[i].noktp=sc.nextLine();
            setSaldo(saldo,i);
            System.out.println("");
            
            if(i==1){
                System.out.print("Masukkan Uang Tabungan\t= ");
                baa[i].tabung=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++){
            System.out.println("Nasabah ke    :"+(i+1));
            System.out.println("Nama          : "+baa[i].nama);
            System.out.println("Nomor Rekening: "+baa[i].nim);
            System.out.println("Alamat        : "+baa[i].alamat);
            System.out.println("Nomor KTP     : "+baa[i].noktp);
            System.out.println("Saldo         : "+saldo[i]); 
        }
    }
    
}
