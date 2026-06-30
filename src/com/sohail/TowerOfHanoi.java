package com.sohail;

public class TowerOfHanoi {

    public static void tower(int n, char source, char helper, char destination) {

        if(n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        tower(n-1, source, destination, helper);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        tower(n-1, helper, source, destination);
    }

    public static void main(String[] args) {

        int n = 3;

        tower(n, 'A', 'B', 'C');
    }
}
