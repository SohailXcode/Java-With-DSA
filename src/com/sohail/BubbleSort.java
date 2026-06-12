package com.sohail;
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {64, 25, 12, 22, 11};

        // Print original array
        System.out.println("=== BUBBLE SORT ===");
        System.out.print("Before Sorting: ");
        printArray(array);

        // Sort karo
        bubbleSort(array);

        // Print sorted array
        System.out.print("After Sorting:  ");
        printArray(array);
    }

    // PRINT ARRAY METHOD
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // BUBBLE SORT METHOD
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int pass = 0; pass < n-1; pass++) {

            System.out.println("\n--- Pass " + 
                             (pass+1) + " ---");

            for(int j = 0; j < n-1-pass; j++) {

                System.out.println("Comparing: " + 
                                 arr[j] + " and " + arr[j+1]);

                if(arr[j] > arr[j+1]) {
                    // Swap karo
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    System.out.println("Swapped! Array: ");
                    printArray(arr);
                }
            }
        }
    }
}