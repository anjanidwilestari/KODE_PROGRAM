package strukturdata;
public class ArrayRoyalGarden {
    public static void main(String[] args) {
        int total;
        int stockBunga;
        int i,j;
        String jenisBunga[]={"Algonema", "Keladi", "Alocasia", "Mawar"};
        int [][] bunga = {
            {10,5,15,7}, 
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        for (i=0; i<bunga.length; i++){
            stockBunga = 0;
            for (j=0; j<bunga[i].length;j++){
                stockBunga+=bunga[j][i];
            }
            System.out.println("Stock Bunga ke- : " + (i+1)+ ": " + stockBunga+"(di seluruh cabang)");
        } 
        bunga[0][0]-=1;
        bunga[0][1]-=2;
        bunga[0][2]-=0;
        bunga[0][3]-=5;
        total = (bunga[0][0]*75000)+(bunga[0][1]*50000)+(bunga[0][2]*60000)+(bunga[0][3]*10000);
        System.out.println("Total Pendapatan Bunga : " + total);
    }
}
