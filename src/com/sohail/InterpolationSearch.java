public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        int target = 70;

        int low = 0;
        int high = array.length - 1;
        boolean found = true;

        while (low <= high){
            int pos = low + ((target - array[low]) *  (high - low)) / (array[high] - array[low]);
            System.out.println("Checking index " + pos + " = " + array[pos]);

            if (array[pos]==target){
                System.out.println("Found at index " + pos);
                found = true;
                break;
            }else if (array[pos]<target){
                low = pos + 1;
            }else {
                high = pos - 1;
            }

        }
        if (!found){
            System.out.println("NOT FOUND");
        }

    }
}
