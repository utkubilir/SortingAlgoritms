public class QuickSort{
   
    public void quickSort(int[] arr , int lowIndex,int highIndex){
        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) { 
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer <rightPointer){
                rightPointer--;
            }
            swap(arr , leftPointer ,rightPointer);
        }
        swap(arr,leftPointer,highIndex);
        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer+1, highIndex);
    }
    
    public void swap(int[] arr ,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    
    
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
}