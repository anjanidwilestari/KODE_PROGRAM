/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author ayian
 */
public class Motor {
    private String merek;
    private boolean statusMesin;
    private int kecepatan;
    
    public void setMerek(String merek){
        this.merek=merek;
    }
    
    public String getMerek(){
        return merek;
    }
    
    public void setStatusMerek (boolean statusMesin){
        this.statusMesin=statusMesin;
    }
    
    public boolean getStatusMesin(){
        return statusMesin;
    }
    
    public void setKecepatan (int kecepatan){
        if (!statusMesin&&kecepatan>0){
            System.out.println("Kecepatan tidak bisa lebih dari ")
        }
    }
    
    public boolean getStatusMesin(){
        return statusMesin;
    }
    
    public void printInfo(){
    System.out.println("Merek : "+merek);
    
    if(statusMesin){
        System.out.println("Mesin on");
    }else {
        System.out.println("Mesin off");
    }
        setKecepatan(kecepatan);
    System.out.println("Kecepatan : "+kecepatan);
    System.out.println("====================================");
}
}
