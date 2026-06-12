package com.sohail;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {64, 25, 12, 22, 11};

        System.out.println("=== SELECTION SORT ===");
        System.out.print("Before Sorting: ");
        printArray(array);

        selectionSort(array);

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

    // SELECTION SORT METHOD
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int pass = 0; pass < n-1; pass++) {

            // Step 1 - Assume first element is minimum
            int minIndex = pass;

            System.out.println("\n--- Pass " + (pass+1) + " ---");
            System.out.println("Assumed minimum: " + arr[minIndex] 
                             + " at index " + minIndex);

            // Step 2 - Find actual minimum
            for(int j = pass+1; j < n; j++) {
                System.out.println("Comparing: " + arr[minIndex] 
                                 + " and " + arr[j]);
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("New minimum found: " 
                                     + arr[minIndex] 
                                     + " at index " + minIndex);
                }
            }

            // Step 3 - Swap minimum to correct position
            if(minIndex != pass) {
                int temp = arr[pass];
                arr[pass] = arr[minIndex];
                arr[minIndex] = temp;
                System.out.println("Swapped: " + arr[pass] 
                                 + " to index " + pass);
            } else {
                System.out.println("No swap needed!");
            }

            System.out.print("Array after Pass " 
                           + (pass+1) + ": ");
            printArray(arr);
        }
    }
}
