public class ExponentialSearch {

    // Binary Search
    public static int binarySearch(int arr[], int low, int high, int key) {

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // Exponential Search
    public static int exponentialSearch(int arr[], int key) {

        int n = arr.length;

        // Check first element
        if (arr[0] == key)
            return 0;

        int i = 1;

        // Find range by doubling
        while (i < n && arr[i] <= key) {
            i = i * 2;
        }

        // Apply Binary Search in found range
        return binarySearch(arr, i / 2, Math.min(i, n - 1), key);
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        int key = 22;

        int result = exponentialSearch(arr, key);

        if (result != -1)
            System.out.println("Element Found at Index: " + result);
        else
            System.out.println("Element Not Found");
    }
}