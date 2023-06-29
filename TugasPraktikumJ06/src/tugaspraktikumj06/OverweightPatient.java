package tugaspraktikumj06;
public class OverweightPatient extends Patient{
    private double nilaiBmi=0;
    
    public void computeBmiGrade() {
        double tinggiBadan=0;
        for(int a=0; a<super.NUM_OF_BMI; a++) {
            tinggiBadan=super.bmiNum[1]*super.bmiNum[1];
        }
        nilaiBmi=super.bmiNum[0]/tinggiBadan;
        System.out.println("Nilai BMI Anda = "+nilaiBmi);
    }
 
    public String getBmiGrade() {
        if(nilaiBmi>18.5 && nilaiBmi<22.9) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }
}
