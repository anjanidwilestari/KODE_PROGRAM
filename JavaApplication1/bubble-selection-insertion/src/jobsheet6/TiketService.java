package jobsheet6;
public class TiketService {
    Tiket tikets []=new Tiket[3];
    int idx;
    //setelah ini tuliskan method tambah()
    void tambah(Tiket t){
        if (idx<tikets.length){
            tikets[idx]=t;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //setelah ini tuliskan method tampil()
    void tampilAll(){
        for (Tiket t : tikets){
            t.tampilAll();
            System.out.println("-------------------");
        }
    }
    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i=0; i<tikets.length-1;i++){
            for(int j=1;j<tikets.length-i;j++){
                if(tikets[j].harga>tikets[j-1].harga){
                    //di bawah ini proses swab atau penukaran
                    Tiket look=tikets[j];
                    tikets[j]=tikets[j-1];
                    tikets[j-1]=look;
                }
            }
        }
    }
    //setelah ini tuliskan method selectionSort()
    void selectionSort(){
         for(int i=0; i<tikets.length-1;i++){
            int idxMin=i;
            for(int j=i+1;j<tikets.length;j++){
                if(tikets[j].harga<tikets[idxMin].harga){
                    idxMin=j;
                }
            }
            //di bawah ini proses swab atau penukaran
            Tiket look=tikets[idxMin];
            tikets[idxMin]=tikets[i];
            tikets[i]=look;
        }
    }    
}
