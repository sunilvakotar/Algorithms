package com.sunil.daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class TwoSum {
    public static void main(String[] args) {
        int[] list = {10, 15, 3, 7, 3, 15};
        int k = 30;

        //System.out.println(twoSumSet(list, k));
        System.out.println(twoSumBinarySearch(list, k));
    }

    // This would be O(N) since lookups of sets are O(1) each.
    private static boolean twoSumSet(int[] list, int k) {
        Set<Integer> set = new HashSet<>();

        for (int num : list) {
            if(set.contains(k - num)) return true;
            set.add(num);
        }
        return false;
    }


    private static boolean twoSumBinarySearch(int[] list, int k) {
        sort(list);

        for (int i=0;i<list.length;i++) {
            int target = k - list[i];
            //System.out.println("target="+target);
            int j = binarySearch(list, target);
            //System.out.println(j);

            if(j < 0){
                continue;
            }else if(j != i){
                return true;
            }else if(j-1 >= 0 && target == list[j-1]){
                return true;
            }else if(j+1 < list.length && target == list[j+1]){
                return true;
            }
        }
        return false;
    }

}
