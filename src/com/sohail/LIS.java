package com.sohail;

public class LIS {

    public static void main(String[] args) {

        int arr[] = {10,22,9,33,21,50,41,60};
        //1 1 1 1
        //22>10

        int n = arr.length;

        int dp[] = new int[n];

        for(int i=0;i<n;i++) {
            dp[i] = 1;
        }

        for(int i=1;i<n;i++) {

            for(int j=0;j<i;j++) {

                if(arr[i] > arr[j]) {

                    dp[i] = Math.max(
                        dp[i],
                        dp[j] + 1
                    );
                }
            }
        }

        int max = dp[0];

        for(int x : dp) {

            if(x > max)
                max = x;
        }

        System.out.println(
            "LIS Length = " + max
        );
    }
}