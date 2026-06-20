public class JumpSearchDemo {
    public static int jumpSearch(int arr[],int key){
        int n = arr.length;
        int jump = (int) Math.sqrt(n);

        int prev = 0;

        while (prev< n && arr[Math.min(jump,n)-1]<key){
            prev = jump;
            jump += (int) Math.sqrt(n);

            if (prev>=n)
                return -1;
        }

        while (prev< Math.min(jump,n)){
            if (arr[prev]==key)
                return prev;
            prev ++;
        }
        return -1;
    }


    public static void main(String[] args) {
       int arr[] = {1,3,5,7,9,11,13,15,17,19,21,23};
       int key = 21;

       int result = jumpSearch(arr,key);
        if (result != -1){
            System.out.println("Element Found At " + result);
        }
        else {
            System.out.println("element not found");
        }

    }
}
