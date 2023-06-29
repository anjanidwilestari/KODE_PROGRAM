package Praktikum2;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Buku st = new Buku(8);
        
        boolean ulang=true;
        while (ulang==true){
            System.out.println("==================================================");
            System.out.println("                    OPERASI STACK");
            System.out.println("==================================================");
            System.out.println(" 1. PUSH "
                    + "\n 2. POP "
                    + "\n 3. PEEK"
                    + "\n 4. PRINT"
                    + "\n 5. KELUAR");
            System.out.print("Pilih Angka Menu: ");
            int pil=sc.nextInt();
        switch (pil){
            case 1:
                System.out.print("Judul\t\t: ");
                String judul=sc.next();
                System.out.print("Nama Pengarang\t: ");
                String nama=sc.next();
                System.out.print("Tahun Terbit\t: ");
                int tahun=sc.nextInt();
                System.out.print("Jumlah Halaman\t: ");
                int jml=sc.nextInt();
                System.out.print("Harga\t\t: ");
                int hrg=sc.nextInt();
                Buku bk=new Buku(judul, nama, tahun, jml, hrg);
                st.push(bk);
                break;
            
            case 2:
                System.out.println("______________________________________________");
                st.pop();
                break;
            case 3:
                System.out.println("______________________________________________");
                st.peek();
                break;
            case 4:
                System.out.println("______________________________________________");
                st.print();
                break;
            case 5:
                System.out.println("______________________________________________");
                ulang=false;
                break;
            }
        }
    }
}

