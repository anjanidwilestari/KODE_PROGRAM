package minggu3;
public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisi1;
    public int sisi2;
    public int sisi3;
    Segitiga(){
    }
    Segitiga(int a, int t, int s,int ss, int sss){
        alas=a;
        tinggi=t;
        sisi1=s;
        sisi2=ss;
        sisi3=sss;
    }
    public void setAlas(int a){
        alas=a;
    }
    public void setTinggi(int t){
        tinggi=t;
    }
    public void setSisi1(int s){
        sisi1=s;
    }
    public void setSisi2(int ss){
        sisi2=ss;
    }
    public void setSisi3(int sss){
        sisi3=sss;
    }
    public int hitungLuas (){
        return alas*tinggi/2;
    }
    public int hitungKeliling (){
        return sisi1+sisi2+sisi3;
    }
}


