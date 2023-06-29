package utsAsd1;
public class PenampilanSaldo {
    Transaksi listTransaksi[]=new Transaksi [3];
    int idx;
    void tambah (Transaksi m){
        if(idx<listTransaksi.length){
            listTransaksi[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Transaksi m : listTransaksi){
            m.tampil();
            System.out.println("------------------");
        }
    }
    void hitungSaldo(){
        
    }
    }
