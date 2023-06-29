package javaapplication1;
import java.util.Scanner;
public class AngkaTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n, i, j;
	System.out.print("Masukkan nilai: ");
	n = sc.nextInt();
		
	if(n>=5){
            for(i=1; i<=n; i++){
            if(i%2==0){
                for(j=n; j>=1; j--){
                    System.out.print(j);
                }
            }else{
                for(j=1; j<=n; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
            }
	}else{
            System.out.println("Nilai yang anda masukkan kurang dari 5");
	}
    }
}
       