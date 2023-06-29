package tugasstudikasusclass;
public class GraduateStudent extends Student{
    private int rerata= 0;

    public void computeCourseGrade() {
        int total = 0;
        //mengeksekusi sebuah method dari class induk
        for(int a=0; a<super.NUM_OF_TESTS; a++) {
            total = total + test[a];
        }
        rerata = total/super.NUM_OF_TESTS;
    }
 
    @Override
    public String getCourseGrade() {
        if(rerata>=70) {
            return "Lulus";
        }else {
            return "Tidak Lulus";
        }
    }
}
