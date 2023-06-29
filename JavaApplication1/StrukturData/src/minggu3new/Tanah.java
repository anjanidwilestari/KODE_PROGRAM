package minggu3new;
public class Tanah {
    public int panjang; 
    public int lebar;
    public int max=0;

    public int LuasTanah() { 
        return panjang * lebar; 
    }
    void hitungLuas(Tanah[]tn){
        for (int i = 0; i < tn.length; i++) {
            if (tn[i].LuasTanah() > max) {
                max=tn[i].LuasTanah();
            }
        }
        for (int i = 0; i < tn.length; i++) {
            if (max==tn[i].LuasTanah()) {
                System.out.print("Tanah terluas : Tanah " +(i+1));
            }
        }
    }
}    

