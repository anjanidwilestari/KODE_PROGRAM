package minggu7;
public class Nomor4 {
    public int[] data;
    public int jumData;
    public Nomor4(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jmlData];
        for(int i=0; i<jumData; i++){
            data[i] = Data[i];
        }
    }
    void bubbleSort(){
        int temp = 0;
        for(int i=0; i<jumData-1; i++){
            for(int j=1; j<(jumData-i); j++){
                if(data[j] < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }
    public void bigger(int[] arr){
        int max = arr[0];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index1 = i;
            }
        }
        int search = max;
        for(int i=0; i<arr.length; i++){
            if(search == arr[i]){
                index2 = i;
            }
        }
        System.out.println("Nilai terbesar adalah " + max + " terletak pada index " + index1 + " dan index " + index2);
    }
    public void tampilData(){
        for(int i=0; i<jumData; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}    

