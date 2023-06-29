package minggu4;
import java.util.Scanner;
public class nasabahmain {
    
        static Scanner sc = new Scanner (System.in);
        static void setSaldo(int[]saldo,int i){
            for (int a=0;a<2;a++){
                if (a==1){
                    System.out.print("Masukkan Saldo\t\t= ");
                    saldo[i]=sc.nextInt();
                }
            }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        nasabah [] baa = new nasabah[2];
                int[]saldo=new int[2];        
        for(int i=0;i<2;i++){
            baa[i]=new nasabah();
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
            }
        
        for(int i=0;i<2;i++){
            System.out.println("Nasabah ke    :"+(i+1));
            System.out.println("Nama          : "+baa[i].nama);
            System.out.println("Nomor Rekening: "+baa[i].nim);
            System.out.println("Alamat        : "+baa[i].alamat);
            System.out.println("Nomor KTP     : "+baa[i].noktp);
            System.out.println("Saldo         : "+saldo[i]); 
        }
        System.out.println("\n");
        nasabah nb = new nasabah ();
        nb.setNama("Anjani Dwilestari");
       
        System.out.println("Nama : "+nb.getNama());
        System.out.println("Keterangan: ");
        nb.punyaATM();
        System.out.println();
        System.out.println("menabung : 1000000");
        nb.menabung(1000000);
        System.out.println("jumlah tabungan : ");
        nb.cekTabungan();
        System.out.println("Menabung : 500000");
        nb.menabung(500000);
        System.out.println("Jumlah Tabungan : ");
        nb.cekTabungan();
        System.out.println("Mengambil : 70000");
        nb.mengambil(70000);
        System.out.println("Jumlah Tabungan : ");
        nb.cekTabungan();
    }
        
    //mengoverride method di class nasabah
    public void punyaATM(){
        System.out.println("Punya kartu ATM");
    }
}
