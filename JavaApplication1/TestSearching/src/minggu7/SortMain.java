package minggu7;

public class SortMain {

    public static void main(String[] args) {
       int data[]={10,40,30,50,70,20,100,90};
       MergeSorting mSort = new MergeSorting ();
       System.out.println("data awal");
       mSort.printArray(data);
       mSort.mergeSort(data);
       System.out.println("setelah diurutkan");
       mSort.printArray(data);
    }
}
