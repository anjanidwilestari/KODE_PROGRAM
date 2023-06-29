package tugaspraktikumj06;
public class TestBmi {
    public static void main(String[] args) {
        OverweightPatient a = new OverweightPatient();
        NormalPatient b = new NormalPatient();
        UnderweightPatient c = new UnderweightPatient();
        a.setName("Anik");
        a.setTestScore(0, 72);
        a.setTestScore(1, 1.46);
        
        b.setName("Ayi");
        b.setTestScore(0, 54);
        b.setTestScore(1, 1.55);
        
        c.setName("Sola");
        c.setTestScore(0, 44);
        c.setTestScore(1, 1.67);
        
        System.out.println(""+a.getName()+" dinyatakan "+a.getBmiGrade());
        a.computeBmiGrade();
        System.out.println(" ");
        System.out.println(""+b.getName()+" dinyatakan "+b.getBmiGrade());
        b.computeBmiGrade();
        System.out.println(" ");
        System.out.println(""+c.getName()+" dinyatakan "+c.getBmiGrade());
        c.computeBmiGrade();
    }
}
