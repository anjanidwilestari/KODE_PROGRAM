package tugas2praktikumJ07;
public class CablePhone extends Phone{

    @Override
    public void showPhoneInfo(){
        System.out.println("Anda menggunakan Layanan Telepon Kabel saat ini");
        System.out.println("Nomor Telepon Kabel Anda "+phoneNumber);
    }
    
    @Override
    public void call(String callNumber){
        System.out.println("Telepon kabel sedang melakukan panggilan ke "+ callNumber);
    }
    
    @Override
    public void endCall(){
        System.out.println("Telepon kabel mengakhiri panggilan");
    }
}
