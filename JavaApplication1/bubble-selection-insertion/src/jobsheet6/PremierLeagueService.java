package jobsheet6;
public class PremierLeagueService {
PremierLeague pls []=new PremierLeague [5];
    int idx;
    //setelah ini tuliskan method tambah()
    void tambah(PremierLeague p){
        if (idx<pls.length){
            pls[idx]=p;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampilAll(){
        for (PremierLeague p : pls){
            p.tampilAll();
            System.out.println("-------------------");
        }
    }
    void insertionSort(boolean asc){
        for (int i = 1; i < pls.length; i++) {
             PremierLeague temp = pls[i];
            int j = i;
            if(asc){
                while (j > 0 && pls [j-1].points > temp.points){
                pls[j] = pls[j-1];
                j--;
            }
            }else{
                while ((j > 0) && pls[j-1].points < temp.points){
                pls[j] = pls[j-1];
                j--;
            }
            }
            pls[j] = temp;
        }
    }
}
