public class SelectionSort {//array in ilk elemanını min olarak alıyoruz.Arrayı dolaşıp daha küçük bir eleman var mı diye bakıyoruz eğer varsa min i onunla swap ediyoruz.
    
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

    public void anotherSelectionSort(int[] arr){
        int length = arr.length;
        
        for(int i = 0; i < length ; i ++){
            int min =  arr[i];
            int minIndex = i;
            for(int j = i+1 ; j < length ; j++ ){
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
    

}
