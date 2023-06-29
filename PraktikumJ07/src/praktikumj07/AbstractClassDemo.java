package praktikumj07;
public class AbstractClassDemo {
    public static void main(String[] args){
        Lebah lebah1 = new Lebah(0.01, "Madu", "Hutan", 1, "Ratu");
        lebah1.bertambahUmur();
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
    }
}
