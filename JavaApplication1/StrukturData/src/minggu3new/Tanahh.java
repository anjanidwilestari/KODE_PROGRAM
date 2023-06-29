package minggu3new;
public class Tanahh {
    public int panjang; 
    public int lebar;
    public int terluas;

    public Tanahh(int p, int l) { 
        panjang = p; 
        lebar = l;
    }

    public int LuasTanah() { 
        return panjang * lebar; 
    }

    public int tanahTerluas(int a[]) {
        for (int i = 1; i < a.length; i++) { 
            if (a[i - 1] < a[i]) { 
                terluas = a[i];
            }
        }
        return terluas;
    }
}