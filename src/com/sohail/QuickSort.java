public class QuickSort {
    static void main(String[] args) {
        int[] array = {10,80,30,90,40,50,70};

        System.out.println("Quick Sort");
        System.out.println("Before Sorting");
        printArray(array);

        quickSort(array,0,array.length -1);

        System.out.println("After Sorting : ");
        printArray(array);


    }
    static  void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            System.out.println("Pivot"+arr[pivotIndex] + "Settle at index " + pivotIndex);

            quickSort(arr,low,pivotIndex -1);

            quickSort(arr,pivotIndex + 1 ,high);
        }
    }

   static int partition(int[]arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;

       System.out.println("Partitioning with pivot = " + pivot);
       for (int j = low;j<high;j++){
           if (arr[j]<pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               System.out.println("Swapped" + arr[i] + " and " + arr[j+1] + "-> Array : ");
               printArray(arr);
           }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

       System.out.println("After Partition : ");
       printArray(arr);
       return i +1;
   }
}
