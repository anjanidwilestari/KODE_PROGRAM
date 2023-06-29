package minggu4;
public class nasabah {
private bank bank; //mendeklarasikan objek class Bank
    String nama="-----"; //mendeklarasikan dan menginisialisasikan variable nama
    String nim;
    String alamat;
    String noktp;
    
    public nasabah (){// constructor class NAsabah
        bank= new bank(); // menginisialisasikan objek class Bank
       
    }
    public void menabung (int uang){
        bank.setSaldo(uang);
    }
    public void mengambil(int uang){
        bank.setSaldo(-uang);
    }
    public void cekTabungan(){
        System.out.println(bank.getSaldo());
    }
    //override di class budi
    public void punyaATM(){
        System.out.println("Tidak punya kartu ATM");
    }
   
    public void setNama (String nm) {
        nama =nm;
    }
    public String getNama(){
        return nama;
    }
}
