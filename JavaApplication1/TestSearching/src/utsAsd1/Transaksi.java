package utsAsd1;
public class Transaksi {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tglTransaksi;
    String type;
    
    Transaksi (double a, double b, double c, String d, String e){
       saldo=a;
       saldoAwal=b;
       saldoAkhir=c;
       tglTransaksi=d;
       type=e;
    }
    
    public void tampil(){
        System.out.println("Saldo = "+saldo);
        System.out.println("Saldo Awal = "+saldoAwal);
        System.out.println("Saldo Akhir = "+saldoAkhir);
        System.out.println("Tanggal Transaksi = "+tglTransaksi);
        System.out.println("Type = "+type);
    }
}    

