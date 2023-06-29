package tugasstudikasusclass;
public class UnderGraduateStudent extends Student{
    private int rerata;

    public int computeCourseGrade() {
        int total = 0;
        for(int a=0; a<super.NUM_OF_TESTS; a++) {
            total = total + test[a];
        }
        rerata = total/super.NUM_OF_TESTS;
        return rerata;
    }
 
    public String getCourseGrade() {
        if(rerata<=69) {
            return "Tidak Lulus";
        }else {
            return"Lulus";
        } 
    }  
}
