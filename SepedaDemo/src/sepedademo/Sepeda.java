package sepedademo;
public class Sepeda {
    public String merek;
    public int kecepatan;
    public int gear;
    
    public void gantiGear(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void rem(int decrement){
        kecepatan =kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merk: "+merek);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Gear: " +gear);
    }
}
