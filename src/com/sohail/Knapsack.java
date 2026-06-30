package com.sohail;

public class Knapsack {

    static int knapsack(int wt[], int val[],
                        int capacity, int n) {

        if(n == 0 || capacity == 0)
            return 0;

        if(wt[n-1] > capacity)
            return knapsack(wt, val,
                           capacity, n-1);

        return Math.max(

            val[n-1] +

            knapsack(
                wt,
                val,
                capacity - wt[n-1],
                n-1
            ),

            knapsack(
                wt,
                val,
                capacity,
                n-1
            )
        );
    }

    public static void main(String[] args) {

        int wt[] = {1,3,2};

        int val[] = {10,40,30};

        int capacity = 4;

        System.out.println(

            knapsack(
                wt,
                val,
                capacity,
                wt.length
            )
        );
    }
}