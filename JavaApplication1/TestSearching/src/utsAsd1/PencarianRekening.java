package utsAsd1;
public class PencarianRekening {
    Rekening listRekening[]=new Rekening [3];
    int idx;
    void tambah (Rekening m){
        if(idx<listRekening.length){
            listRekening[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Rekening m : listRekening){
            m.tampil();
            System.out.println("------------------");
        }
    }
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j=0; j<listRekening.length; j++){
            if (listRekening[j].nama.equalsIgnoreCase(cari)){
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
            System.out.println("Nomor Rekening : "+listRekening[pos].noRekening);
            System.out.println("Nama : "+x);
            System.out.println("Nama Ibu : "+listRekening[pos].namaIbu);
            System.out.println("Nomor Phone : "+listRekening[pos].phone); 
            System.out.println("Alamat Email : "+listRekening[pos].email);
        }else {
            System.out.println("Data "+x+" tidak ditemukan");        
        }
    }
}
