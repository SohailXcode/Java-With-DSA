package com.sohail;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 10, 25, 37, 42, 58, 71, 89 };
        int target = 42;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Checking index " + i + " -> " + numbers[i]);
            if (numbers[i] == target) {
                System.out.println("Found at index" + i);
                found = true;
                break;
                
            }
        }
        if (!found) {
            System.out.println("Number not found");
            
        }
       

    }

}
