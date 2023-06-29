package minggu3new;
public class Balok {
    int p;
    int l;
    int t;
    
    public int hitungLuas (){
        return 2*((p*l)+(p*t)+(t*l));
    } 
    public int hitungVolume(){
        return p*l*t;
    } 
}    
