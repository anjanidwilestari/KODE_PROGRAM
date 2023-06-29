package jobsheet6;
public class MainLeague {
    public static void main(String[] args) {
    PremierLeagueService pls=new PremierLeagueService();
        PremierLeague p1 =new PremierLeague("Liverpool\t", 29, 45, 82);
        PremierLeague p2 =new PremierLeague("Manchester City\t", 27, 39, 57);
        PremierLeague p3 =new PremierLeague("Leicester\t", 28, 26, 50);
        PremierLeague p4 =new PremierLeague("Chelsea\t\t", 29, 9, 48);
        PremierLeague p5 =new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        
        pls.tambah(p1);
        pls.tambah(p2);
        pls.tambah(p3);
        pls.tambah(p4);
        pls.tambah(p5);
        
        System.out.println("Data Premier League sebelum sorting = ");
        pls.tampilAll();
        
        boolean asc = true, desc = false;
        System.out.println("Data Premier League setelah sorting berdasarkan points");
        pls.insertionSort(desc);
        pls.tampilAll();
        System.out.println("Data Premier League setelah sorting berdasarkan points");
        pls.insertionSort(asc);
        pls.tampilAll();
    }
}
