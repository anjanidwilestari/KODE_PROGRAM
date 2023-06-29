package minggu5.tugas;
public class TugasNo4 {
   public int jumlah;
    public String kandidat[];
       TugasNo4(int jumlah) {
        this.jumlah = jumlah;
        this.kandidat = new String[jumlah];
    }
        public int cariMayoritas(String[] nama, int i, int j, int k) {
        int m = j / 2;
        int n = m - 1;
        int p = nama.length - 1;
        int test = rekursifDC(nama, i, k, p, n, m);
        return test;
    }
    public int rekursifDC(String[] nama, int i, int k, int p, int n, int m) {
        System.out.println("I = " + i + ", K = " + k + ", M = " + m + ", N = " + n + ", P = " + p);
        if (p == (n + 1) && n == (i + 1)) {
            return k;
        } else {
            if (i != n) {
                if (nama[i].equalsIgnoreCase(nama[n])) {
                    return k = i;
                } else {
                    return rekursifDC(nama, i, k, p, (n - 1), m);
                }
            }
            else {
                if (nama[m].equalsIgnoreCase(nama[p])) {
                    return k = m;
                } else {
                    return rekursifDC(nama, m, k, (p - 1), n, m);
                }
            }
        }
    }
}
