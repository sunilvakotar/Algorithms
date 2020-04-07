package com.sunil.daily;

public class FindMaxSumNotAdjacent {
    public static void main(String[] args) {
        int[] list = {5, 1, -1, 1, 5};
        //int[] list = {2, 4, 6, 2, 5};
        System.out.println("Max Sum of non adjacent element:"+ findMaxSum(list));
    }

    private static int findMaxSum(int[] list) {
        if(list.length == 0){
            return 0;
        }
        int incl = list[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < list.length; i++) {

            excl_new = incl > excl ? incl : excl;

            incl = excl + list[i];
            excl = excl_new;
        }
        return incl > excl ? incl : excl;
    }
}
