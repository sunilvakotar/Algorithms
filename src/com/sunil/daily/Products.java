package com.sunil.daily;

import java.util.Arrays;

public class Products {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(productWithoutDivision(arr)));
    }

    // brute force Time complexity : O(n2)
    private static int[] products(int[] arr){
        int pro[] = new int[arr.length];
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product = 1;
            for(int j=0;j<arr.length;j++){
                if(i != j) product = product*arr[j];
            }
            pro[i] = product;
        }
        return pro;
    }

    // calculate by division Time Complexity O(2 * n)
    private static int[] productsDivision(int[] arr){
        //int pro[] = new int[arr.length];
        int product = 1;
        for (int i1 : arr) {
            product = product * i1;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = product/arr[i];
        }
        return arr;
    }

    // without division Time O(n) and Space O(n)
    private static int[] productWithoutDivision(int[] arr){
        int n = arr.length;
        int[] prefixProduct = new int[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                prefixProduct[i] = arr[i];
            }else{
                prefixProduct[i] = arr[i]*prefixProduct[i-1];
            }
        }

        int[] suffixProduct = new int[n];
        for(int i=n-1;i>=0;i--){
            if(i == n-1){
                suffixProduct[i] = arr[i];
            }else{
                suffixProduct[i] = arr[i]*suffixProduct[i+1];
            }
        }

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                result[i] = suffixProduct[i+1];
            }else if(i == n-1){
                result[i] = prefixProduct[i-1];
            }else{
                result[i] = prefixProduct[i-1] * suffixProduct[i+1];
            }
        }

        return result;
    }
}
