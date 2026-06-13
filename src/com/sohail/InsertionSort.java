package com.sohail;
public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {64, 25, 12, 22, 11};

        System.out.println("=== INSERTION SORT ===");
        System.out.print("Before Sorting: ");
        printArray(array);

        insertionSort(array);

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

    // INSERTION SORT METHOD
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {

            // Step 1 - Pick the key
            int key = arr[i];
            int j = i - 1;

            System.out.println("\n--- Step " + i + " ---");
            System.out.println("Key picked: " + key);

            // Step 2 - Shift bigger elements right
            while(j >= 0 && arr[j] > key) {
                System.out.println("Shifting " + 
                                 arr[j] + " to right");
                arr[j + 1] = arr[j];
                j--;
            }

            // Step 3 - Insert key at correct position
            arr[j + 1] = key;
            System.out.println("Inserted " + key + 
                             " at index " + (j + 1));

            System.out.print("Array after Step " + i + ": ");
            printArray(arr);
        }
    }
}
