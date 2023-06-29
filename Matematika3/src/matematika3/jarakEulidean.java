/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika3;

/**
 *
 * @author ayian
 */
public class jarakEulidean {
static double jarakEuclidean(int x1, int x2, int y1, int y2) {
return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
}
public static void main(String[] args) {
int umurSaya = 26 ;
int BBSaya=67;
int umurAnton = 25;
int BBAnton = 65;
int umurAndi = 27;
int BBAndi = 70;
double d_saya_anton= jarakEuclidean(umurAnton,umurSaya,BBAnton,BBSaya);
double d_saya_andi= jarakEuclidean(umurAndi,umurSaya,BBAndi,BBSaya);
System.out.println("jarak antara saya dengan anton = " + d_saya_anton);
System.out.println("jarak antara saya dengan andi = " + d_saya_andi);
}
}