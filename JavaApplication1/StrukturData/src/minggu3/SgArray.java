package minggu3;
public class SgArray {
    public static void main(String[] args) {
        Segitiga[]sgArray=new Segitiga[4];
        sgArray[0]=new Segitiga (20,30,12,18,25);
        sgArray[1]=new Segitiga (60,40,15,30,28);
        sgArray[2]=new Segitiga (21,50,25,17,23);
        sgArray[3]=new Segitiga (28,40,26,27,33);
        
        for (int i=0;i<4;i++){
            System.out.println("Luas Segitiga ke "+(i+1)+" : "+sgArray[i].hitungLuas());
        }
        for (int i=0;i<4;i++){
            System.out.println("Keliling Segitiga ke "+(i+1)+" : "+sgArray[i].hitungKeliling());
        }
    }
}
