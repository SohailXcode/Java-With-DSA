public class RadixSort {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Radix Sort");
        radixSort(array);
        System.out.println("Sorted array");
        printArray(array);
    }

    static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    static void radixSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        for (int palce = 1; max / palce > 0; palce *= 10) {
            countingSortByDigit(arr, palce);
        }
    }

    static void countingSortByDigit(int[] arr, int palce) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];


        for(int i=0;i<n;i++){
            int digit = (arr[i]/palce) % 10;
            count[digit]++;

        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i-1];

        }
        for (int i = n-1;i>=0;i--){
            int digit = (arr[i]/palce) % 10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }
        for (int i =0;i<n;i++){
            arr[i] = output[i];
        }

    }


}
