public class Main{
    public static void main(String[] args) {
        int[] arr = {10,20,73,3,95,37,25,75};
      QuickSort qs = new QuickSort();
      qs.quickSort(arr,0, 7);
      qs.printArray(arr);

        }
}