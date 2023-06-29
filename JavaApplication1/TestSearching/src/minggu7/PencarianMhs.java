package minggu7;
public class PencarianMhs {
    Mahasiswa listMhs[]=new Mahasiswa [5];
    int idx;
    
    void tambah (Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------");
        }
    }
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].nama.equalsIgnoreCase(cari)){
                posisi=j;
                break;
            }
        }
    return posisi;
    }
    
    public void Tampilposisi(String x, int pos){
        if (pos!=-1){
            System.out.println("Data : "+ x+ " ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data : "+x+" tidak ditemukan");
        }
    }
    public void TampilData(String x, int pos){
        if (pos!=-1){
            System.out.println("Nim   : "+listMhs[pos].nim);
            System.out.println("Nama  : "+x);
            System.out.println("Umur  : "+listMhs[pos].umur);
            System.out.println("IPK  : "+listMhs[pos].ipk);        
        }else {
            System.out.println("Data "+x+" tidak ditemukan");        
        }
    }
}
