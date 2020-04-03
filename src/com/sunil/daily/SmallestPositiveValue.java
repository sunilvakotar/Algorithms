package com.sunil.daily;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveValue {

    /*
        Given an array of integers, find the first missing positive integer in linear
        time and constant space. In other words, find the lowest positive integer that does not exist in the array.
        The array can contain duplicates and negative numbers as well.

        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
    */

    public static void main(String[] args) {
        int[] list = {3, 4, -1, 1};
       // int[] list = {2, 1, 0};
        System.out.println("Smallest Positive integer:"+ firstMissingPositive(list));
        System.out.println("Smallest Positive integer:"+ firstMissingPositiveOptimal(list));
    }

    private static int firstMissingPositiveOptimal(int[] list) {
        int n = list.length;
        int val, nextVal;
        for(int i=0;i<n;i++){

            if(list[i] <= 0 || list[i] > n){
                continue;
            }
            val = list[i];

            while(list[val-1] != list[i]){
                nextVal = list[val-1];
                list[val-1] = val;
                list[i] = nextVal;
                val = nextVal;
                if(val <= 0 || val > n){
                    break;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(list[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }

    private static int firstMissingPositive(int[] list){
        Set<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }

        for(int i=1;i<list.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return set.size();
    }



}
