package tugasstudikasusclass;
public class TestStudent {
    public static void main(String[] args) {
        GraduateStudent a = new GraduateStudent();
        UnderGraduateStudent b = new UnderGraduateStudent();
        a.setName("Wijanarto");
        a.setTestScore(0, 69);
        a.setTestScore(1, 70);
        a.setTestScore(2, 71);
        a.computeCourseGrade();
        b.setName("Joko");
        b.setTestScore(0, 65);
        b.setTestScore(1, 60);
        b.setTestScore(2, 73);
        b.computeCourseGrade();
        System.out.println(""+a.getName()+" dinyatakan "+a.getCourseGrade());
        System.out.println(""+b.getName()+" dinyatakan "+b.getCourseGrade());
    }
}
