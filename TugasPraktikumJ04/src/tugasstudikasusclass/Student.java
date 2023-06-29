package tugasstudikasusclass;
public class Student {
    protected int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;
    
    public Student() {
        //mengeksekusi konstrutor induk
        super();
            name = "";
            courseGrade = "";
            test[0] = 0;
            test[1] = 0;
            test[2] = 0;
    }
 
    public Student(String studentName) {
            this.name = studentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int[] getTestScore() {
        return test;
    }

    public void setTestScore(int testNumber, int testScore) {
        this.test[testNumber] = testScore;
    }

    public String getCourseGrade() {
        return courseGrade;
    }
}
