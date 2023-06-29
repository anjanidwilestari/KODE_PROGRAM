package javaapplication1;
import java.util.Scanner;
public class KotakKosong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int nilai, i, j;
        System.out.print("Masukkan nilai: ");
	nilai = sc.nextInt();
        
        if(nilai>=3){
            for(i=1; i<=nilai; i++){
                for(j=1; j<=nilai; j++){
                    if(i==1 || i==nilai || j==1 || j==nilai){
                        System.out.print(nilai + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
	}else{
            System.out.println("Nilai yang anda masukkan kurang dari 3");
	}
    }
}
