/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajararray;
import java.util.Scanner;
/**
 *
 * @author ayian
 */
public class BilanganPerpangkatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        double hasil;
        System.out.print("Masukkan bilangan : ");
        int bil=in.nextInt();
        System.out.print("Masukkan pangkat : ");
        int pangkat=in.nextInt();
        hasil=Math.pow(bil,pangkat);
        System.out.print(hasil);
    }
   
}
    

