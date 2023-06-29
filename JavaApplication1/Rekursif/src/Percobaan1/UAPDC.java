import java.util.Scanner;

public class UAPDC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int JmlKartu=in.nextInt();
        int JmlPlayer=in.nextInt();
        in.next();
        String Kartu=in.nextLine();
        int Printkuy = MehodNihGan(JmlKartu,JmlPlayer,Kartu);
        System.out.println(Printkuy);

    }
    static int MehodNihGan(int JmlKartu, int JmlPlayer, String Kartu){
        boolean reverseCard=false;
        int player=1;
        String[]KartuArr = Kartu.split(" ");

        for(int i=0; i<KartuArr.length; i++){
            if(KartuArr[i].equals("reverse")){
                reverseCard = reverseCard ? false:true;
            }else{
                if(reverseCard==true){
                    player = player==1 ? JmlPlayer : --player;
                }else{
                    player = player == JmlPlayer ? 1 : ++player;
                }
            }
            
        }
        return player;
    }
}




import java.util.Scanner;

public class UAPDC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int JmlKartu=in.nextInt();
        int JmlPlayer=in.nextInt();
        in.next();
        String Kartu=in.nextLine();
        int Printkuy = MehodNihGan(JmlKartu,JmlPlayer,Kartu);
        System.out.println(Printkuy);

    }
    static int MehodNihGan(int JmlKartu, int JmlPlayer, String Kartu){
        boolean reverseCard=false;
        int player=1;
        Scanner in2 = new Scanner(Kartu);
        while(in2.hasNext()){
            String kartu = in2.next();
            if(kartu.equals("reverse")){
                reverseCard = reverseCard ? false:true;
                kartu=in2.next();
                continue;
            }else{
                if(reverseCard==false){
                    player = player==JmlPlayer ? 1 : ++player;
                }else{
                    player = player == 1 ? JmlPlayer : --player;
                }
            }
        }
        
        return player;
    }
}