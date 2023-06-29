import java.util.Scanner;

public class Suhu {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        final double re = 0.8, fa = 1.8;
        double suhu, celcius, reamur, fahrenheit, kelvin;
        System.out.print("Masukkan suhu : ");
        suhu = sc.nextDouble();
        
        celcius = suhu;
        reamur = re * celcius;
        fahrenheit = (fa * celcius) + 32;
        kelvin = celcius + 273;
        System.out.print (String.format("\nSuhu Celcius \t: %s \nSuhu Reamur \t: %s \nSuhu Fahrenheit : %s \nSuhu Kelvin \t: %s ", celcius, reamur, fahrenheit, kelvin));    
    }
}