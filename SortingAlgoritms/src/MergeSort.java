public class MergeSort {
   
    public void mergeSort(int[] arr){
        int arrLength = arr.length;

        if (arrLength < 2 ) {
            return;
        }
        int midIndex = arrLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex];

        for(int i = 0 ; i < midIndex ; i ++){
            leftHalf[i] = arr[i];
        }
        for(int i = midIndex ; i < arrLength ; i ++){
            rightHalf[i - midIndex] = arr[i];
                }
                mergeSort(leftHalf);
                mergeSort(rightHalf);
                merge(arr,leftHalf , rightHalf);
            }
    
    public void merge(int[] arr , int[] leftHalf , int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0;// leftHalf dizisinden arr dizisine birleştirmek için
        int j = 0;// righthalf dizisinden arr dizisine birleştirmek için
        int k = 0;// arr dizisi için

        while( i < leftSize && j < rightSize ){// burada leftHalf ve righthalf dizilerinin ilk elemanından başlayarak elemanları karşılaştırıyor.Küçük olan elemanı arr dizinine ekliyor ve iteratorları artırıyor.
            if(leftHalf[i] <=rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){// bu method leftHaft da herhangi bir eleman kalmışsa bunu arr a ekliyor
            arr[k] = leftHalf[i];
            k++;
            i++;
        }
        while(j < rightSize){// bu method rightHalf da herhangi bir eleman kalmışsa bunu arr a ekliyor
            arr[k] = rightHalf[j];
            k++;
            j++;
        }



        }
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
        }
    }
    
}
