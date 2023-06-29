package jobsheet6;
public class PremierLeague {
    String team;
    int play;
    int goal;
    int points;
    
    PremierLeague (String t, int l, int g, int o){
        team=t;
        play=l;
        goal=g;
        points=o;
    }
    void tampilAll(){
        System.out.println(team+"\t"+play+"\t"+goal+"\t"+points);
    }
}
