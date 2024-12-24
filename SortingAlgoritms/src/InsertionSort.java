public class InsertionSort {
    public void ınsertionSort(int[] arr){//TİME COMPLEXİTY O(N^2) SPACE COMPLEXİTY O(1)
        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i;
            while( j > 0 && arr[ j - 1]> temp ){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

    }



    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
}
