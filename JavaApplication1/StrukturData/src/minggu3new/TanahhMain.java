package minggu3new;
import java.util.Scanner;
public class TanahhMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah tanah yang akan dihitung : ");
        int jml = in.nextInt();

        Tanahh[] tnh = new Tanahh[jml];
        for (int i = 0; i < tnh.length; i++) {
            System.out.println("Tanah Ke-" + (i + 1));
            System.out.print("Masukkan panjang tanah : ");
            int p = in.nextInt();
            System.out.print("Masukkan lebar tanah : ");
            int l = in.nextInt();
            
            tnh[i]= new Tanahh(p,l);
        }
        int i=0;
        for (Tanahh tanahh : tnh) {
            ++i;
            
            System.out.println("Luas Tanah ke "+i+": "+tnh[i].LuasTanah());
            
            int luas[]=new int [jml];
            int terluas=0;
            for (int j = 0; j <tnh.length; j++) {
                luas[j]=tnh[j].LuasTanah();
                terluas=tnh[j].tanahTerluas(luas);
                
                System.out.println("========");
                System.out.println("Tanah terluas : "+terluas);
                
            }
        }
    }
}