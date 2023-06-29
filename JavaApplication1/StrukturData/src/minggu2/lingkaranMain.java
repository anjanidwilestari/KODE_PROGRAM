package minggu2;
public class lingkaranMain {
    public static void main(String[] args) {
        //Instantiates a lingkkaran object
        lingkaran lk = new lingkaran(3.14, 14);
        
        //Sets linkaran info
        lk.setDiameter(28);
        
        //Get lingkaran info
        System.out.println("Perhitungan Lingkaran: " + "\n" + 
                "Phi = " + lk.getPhi()+ "\n"+
                "Diameter = " + lk.getDiameter() +  "\n"+
                "Jari-jari = " + lk.getJarijari()+  "\n"+
                "Luas Lingkaran = " + lk.getLuas() +  "\n"+
                "Keliling Lingkaran = " + lk.getKeliling());
    }
}
