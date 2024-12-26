public class BubbleSorting {//Highest number in array bubble to top
    
    public void bubbleSort(int[] arr){// TİME COMPLEXİTY O(N^2) SPACE COMPLEXİTY O(N)
        int n = arr.length;
        for(int i = 0 ; i < n -1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void anotherBubbleSort(int[] arr){
        boolean swapped = true;
        while(swapped){
            swapped = false;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if (arr[i]> arr[i+1]) {
                swapped = true;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
    }

    }
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
    
}
