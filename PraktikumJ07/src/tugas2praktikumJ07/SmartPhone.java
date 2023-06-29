package tugas2praktikumJ07;
public class SmartPhone extends Phone{
    
    @Override
    public void showPhoneInfo(){
        System.out.println("Anda menggunakan Layanan Telepon Pintar saat ini");
        System.out.println("Nomor Telepon Kabel Anda "+phoneNumber);
    }
    
    @Override
    public void call(String number){
        System.out.println("Telepon Pintar menggunakan data voice call ke "+ number);
    }
    
    @Override
    public void endCall(){
        System.out.println("Telepon kabel mengakhiri data voice call");
    }
}
