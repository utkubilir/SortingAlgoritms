public class SelectionSort {
    
    public void selectionSort(int[] arr){// TİME COMPLEXİTY O(N^2) SPACE COMPEXİTY O(1)
        for(int j = 0 ; j < arr.length ; j++){
            int minimumIndex = j;
            for(int i = j+1 ; i < arr.length ; i++){
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                    
                }
            }if(minimumIndex != j){
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }

    }
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
    

}
