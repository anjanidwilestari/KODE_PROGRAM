package tugas2praktikumJ07;
public class TestPhone {
    public static void main (String[] args){
        CablePhone cp = new CablePhone();
        cp.setPhoneNumber("089777666555");
        System.out.println("===========================================================");
        System.out.println("                          PHONE INFO");
        System.out.println("===========================================================");
        cp.showPhoneInfo();
        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println("                          PHONE CALL");
        System.out.println("===========================================================");
        cp.call("085111222444");
        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println("                        END PHONE CALL");
        System.out.println("===========================================================");
        cp.endCall();
        
        System.out.println(" ");
        System.out.println(" ");
        SmartPhone sp = new SmartPhone();
        sp.setPhoneNumber("083222555000");
        System.out.println("===========================================================");
        System.out.println("                          PHONE INFO");
        System.out.println("===========================================================");
        sp.showPhoneInfo();
        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println("                          PHONE CALL");
        System.out.println("===========================================================");
        sp.call("081222000666");
        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println("                        END PHONE CALL");
        System.out.println("===========================================================");
        sp.endCall();
    }
}
