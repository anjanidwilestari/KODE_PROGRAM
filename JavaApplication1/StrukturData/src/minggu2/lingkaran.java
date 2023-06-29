package minggu2;
public class lingkaran {
    //Instance Fields
    private double phi;
    private double diameter;
    private double jarijari;
    
    //Constructor
    public lingkaran (double p, double r ){
        phi = p;
        jarijari=r;
    }
    
    //Mutators
    public void setPhi(double p){
        phi=p;
    }
    public void setJarijari(double r){
        jarijari=r;
    }
    public void setDiameter(double d){
        diameter=d;
    }
    
    //Accessor Methods
    public double getPhi (){
        return phi;
    }
    public double getDiameter (){
        return diameter;
    }
    public double getJarijari (){
        return jarijari;
    }
    
    //Calculation method that returns the luas and keliling
    public double getLuas (){
        return phi*jarijari*jarijari;
    }
    public double getKeliling (){
        return phi*diameter;
    }
}
