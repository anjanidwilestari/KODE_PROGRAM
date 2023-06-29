package utsAsd1;
public class Rekening {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    
    Rekening (String no, String na,String nu,String p,String e){
        noRekening=no;
        nama=na;
        namaIbu=nu;
        phone=p;
        email=e;
    }
    void tampil(){
        System.out.println("Nomor Rekening = "+noRekening);
        System.out.println("Nama = "+nama);
        System.out.println("Nama Ibu = "+namaIbu);
        System.out.println("Nomor Phone = "+phone);
        System.out.println("Alamat Email = "+email);
    }
}
