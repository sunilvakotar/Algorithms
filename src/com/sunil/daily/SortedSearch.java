package com.sunil.daily;

import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int i = Arrays.binarySearch(sortedArray, 3);
        System.out.println(Math.abs(i));


        int count = 0;
        for(int num:sortedArray){
            if(num < lessThan)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}