package minggu4;
public class bank {
private int saldo;
    //overloading constructor bank
    public bank(){
       
    }
    public bank(int uang){
        saldo+=uang;
    }
    public void setSaldo (int uang) {
        saldo+=uang;
    }
    public int getSaldo(){
        return saldo;
       
    }
}
