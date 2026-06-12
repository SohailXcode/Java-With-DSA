package com.sohail;

public class Binary_Search {
    public static void main(String[] args) {

        int[] array = {5, 12, 19, 28, 33, 47, 56};
        int target = 56;
        //we are testing github

        int left = 0;
        int right = array.length - 1;
        boolean found = false;

        while (left <= right) {

            int mid = (left + right) / 2;

            System.out.println("Left=" + left + 
                             " Right=" + right + 
                             " Mid=" + mid + 
                             " Value=" + array[mid]);

            if (array[mid] == target) {
                System.out.println("✅ Found at index: " + mid);
                found = true;
                break;

            } else if (array[mid] < target) {
                left = mid + 1;  // Go RIGHT

            } else {
                right = mid - 1; // Go LEFT
            }
        }

        if (!found) {
            System.out.println("❌ Number Not Found!");
        }
    }
}