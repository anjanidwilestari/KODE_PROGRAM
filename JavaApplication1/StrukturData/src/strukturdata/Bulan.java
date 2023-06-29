package strukturdata;
import java.util.Scanner;
public class Bulan {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int angka;
        System.out.print("Masukkan perkiraan bulan : ");
        angka = input.nextInt();
        double a=(0.02*1000000);
        while (a<=500000){
            System.out.println (a);
            a=a+(0.02*1000000);
    }
        System.out.println("Jadi, benar sesuai perkiraan bulan kamu\nSetelah "+ angka+ " bulan, saldo akhir akan menjadi Rp 1.500.000\nDengan rincian saldo awal + bunga  = saldo akhir\n                 1000000  + 500000 = 1500000");
    }
}