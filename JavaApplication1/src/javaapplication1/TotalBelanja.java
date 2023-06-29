import java.util.Scanner;

public class TotalBelanja{
	public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    int total, harga1, harga2, harga3, jumlah1, jumlah2, jumlah3, hasil1, hasil2,hasil3;
    double disc, totalBayar; 
    System.out.print("BARANG A");
    System.out.print("\nHarga Barang A\t : ");
    harga1=sc.nextInt();
    System.out.print("Jumlah Barang A\t : ");
    jumlah1=sc.nextInt();
    hasil1= harga1*jumlah1;
    System.out.print("BARANG B") ;
    System.out.print("\nHarga Barang B\t : ");
    harga2=sc.nextInt();
    System.out.print("Jumlah Barang B\t : ");
    jumlah2=sc.nextInt();
    hasil2= harga2*jumlah2;
    System.out.print("BARANG C");
    System.out.print("\nHarga Barang C\t : ");
    harga3=sc.nextInt();
    System.out.print("Jumlah Barang C\t : ");
    jumlah3=sc.nextInt();
    hasil3=harga3*jumlah3;    
    total=hasil1+hasil2+hasil3;
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("\t\t\t\t\tSTRUCK NOTA\t\t\t");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("Nama Barang\t|\tHarga\t\t|\tJumlah\t\t|\tTotal\t");
    System.out.println("Barang A\t|\t" + harga1 +  "\t\t|\t" + jumlah1 + "\t\t|\t" + hasil1);
    System.out.println("Barang B\t|\t" + harga2 +  "\t\t|\t" + jumlah2 + "\t\t|\t" + hasil2);
    System.out.println("Barang C\t|\t" + harga3 +  "\t\t|\t" + jumlah3 + "\t\t|\t" + hasil3);
    System.out.println( "\n\n\t\t\t\t\t\tSubtotal\t\t:" + total );        
    if (total>1000000){
        System.out.print("\t\t\t\t\t\tDiscount\t\t:");
        System.out.print(total*=0.1);
    }
    else if (total>500000){
        System.out.print("\t\t\t\t\t\tDiscount\t\t:");
        System.out.print(total*=0.05);
    }
    else if (total>200000){
        System.out.print("\t\t\t\t\t\tDiscount\t\t:");
        System.out.print(total*=0.02);
    } 
    totalBayar= (hasil1+hasil2+hasil3)-total;
    System.out.println("\n\t\t\t\t\t\tTotal Bayar\t\t:" + totalBayar);       
}
}
