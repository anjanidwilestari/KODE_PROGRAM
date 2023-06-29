import java.util.Scanner;

public class Tugas2{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
    int umur;
    
    //menentukan boleh atau tidak boleh berkendara
    System.out.print("Masukkan umur Anda: ");
    umur=sc.nextInt();
    

    if (umur>=17){
        System.out.print("Anda telah diperbolehkan berkendara");
    }
    else {
        System.out.print("Anda belum diperbolehkan berkendara");
    }  
}
}