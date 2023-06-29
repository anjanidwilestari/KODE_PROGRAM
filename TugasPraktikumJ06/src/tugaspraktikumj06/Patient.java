package tugaspraktikumj06;
public class Patient {
    protected int NUM_OF_BMI = 2;
    protected String name;
    protected double[] bmiNum = new double[NUM_OF_BMI];
    protected String bmiGrade;
    
    public Patient() {
        //mengeksekusi konstrutor induk
        super();
            name = "";
            bmiGrade = "";
            bmiNum[0] = 0;
            bmiNum[1] = 0;
    }
    public Patient(String patientName) {
            this.name = patientName;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public double[] getTestBmi() {
        return bmiNum;
    }
    public void setTestScore(int bmiNumber, double bmiScore) {
        this.bmiNum[bmiNumber] = bmiScore;
    }
    public String getBmiGrade() {
        return bmiGrade;
    }
}
