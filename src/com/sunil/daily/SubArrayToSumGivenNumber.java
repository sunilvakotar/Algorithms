package com.sunil.daily;

import java.util.Arrays;

/*
    Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 */
public class SubArrayToSumGivenNumber {

    public static void main(String[] args) {
        int array[] = {1,5,3,6,7,9,2};
        int sum = 9;

        System.out.println("Sub Arrays is: "+ Arrays.toString(findSubArray(array, sum)));
    }

    private static int[] findSubArray(int[] array, int sum) {
        int start = 0, end = 0;

        int sum_temp = array[start];

        for (;end<array.length;end++) {
            if (end > 0) {
                sum_temp += array[end];
            }

            if (sum_temp > sum) {
                while (sum_temp > sum) {
                    sum_temp -= array[start];
                    start++;
                }
            }
            if (sum_temp == sum) {
                return Arrays.copyOfRange(array, start, end+1);
            }
        }

        return new int[0];
    }
}
