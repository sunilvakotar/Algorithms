package com.sunil.algorithms;

import java.util.List;

public class GCD {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        System.out.println();
        return result;
    }

    int minimumHours(int rows, int columns, List<List<Integer>> grid)
    {
        int hours = 1;
        int M = grid.size();
        int N = 0;
        if(M > 0){
            N = grid.get(0).size();
        }

        if(M == 0 && N == 0){
            return 0;
        }

        //while(true){
        //for(int i = 0; i<grid.size();)
        //}

        return hours;
        // WRITE YOUR CODE HERE
    }

    public static void main(String[] args)
    {
        int arr[] = { 2, 4, 5, 8, 16 };
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
}
