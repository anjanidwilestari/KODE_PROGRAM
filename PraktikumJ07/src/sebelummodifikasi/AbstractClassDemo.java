package sebelummodifikasi;
public class AbstractClassDemo {
    public static void main(String[] args){
        Hewan hewan1 = new Hewan();
        hewan1.bergerak();
        hewan1.bernapas();

        Lebah lebah1 = new Lebah();
        lebah1.bergerak();
        lebah1.bernapas();
    }
}
