package TugasJobsheet7;
public class Tugas2 {
    String noTransaksi,tglPembelian;
    int jmlhBarang, harga;
    
    Tugas2(String nt, String tp, int jmlh,int h){
        noTransaksi=nt;
        tglPembelian=tp;
        jmlhBarang=jmlh;
        harga=h;
    }
    int size;
    int top;
    Tugas2 data[];
    
    public Tugas2(int size){
        this.size=size;
        data=new Tugas2[size];
        top=-1;
    }
    public boolean IsEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
     public boolean IsFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Tugas2 del){
         if(!IsFull()){
             top++;
             data[top]=del;
         }else {
            System.out.println("Isi Stack Penuh !"); 
         }
     }
     public void pop(){
        if(!IsEmpty()){
            Tugas2 x = data[top];
            top--;
            System.out.println("========== STRUK BELANJA ==========");
            System.out.println("No.Trnasaksi      :" + x.noTransaksi);
            System.out.println("Tanggal Pembelian :" + x.tglPembelian);
            System.out.println("Jumlah barang     :" + x.jmlhBarang);
            System.out.println("Total Barang      :" + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
            System.out.println("========== STRUK BELANJA ==========");
            System.out.println("No.Trnasaksi      :" + data[top].noTransaksi);
            System.out.println("Tanggal Pembelian :" + data[top].tglPembelian);
            System.out.println("Jumlah barang     :" + data[top].jmlhBarang);
            System.out.println("Total Barang      :" + data[top].harga);
    }
    public void print(){
       System.out.println("Isi stack: ");
       for(int i= top; i>=0; i--){
           System.out.println("========== STRUK BELANJA ==========");
            System.out.println("No.Trnasaksi      :" + data[i].noTransaksi);
            System.out.println("Tanggal Pembelian :" + data[i].tglPembelian);
            System.out.println("Jumlah barang     :" + data[i].jmlhBarang);
            System.out.println("Total Barang      :" + data[i].harga);
       }
       System.out.println("");
    }
}

