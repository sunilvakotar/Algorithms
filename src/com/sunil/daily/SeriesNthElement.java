package com.sunil.daily;

/*
    Like as Series
    1,3,6,8,11,13,16,18,21,23,26,28,31,33
    find the nth term?
 */

import java.time.Instant;

public class SeriesNthElement {
    static int y = 10;
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Instant.now());
        System.out.println("N th element:"+findNthElement(n));
        System.out.println("N th element Optimal:"+findOptimalWay(n));

    }

    public static int findOptimalWay(int n) {
        int a = 1 ;
        int b=3;
        int c =6;
        int d,e;
        d= b-a;
        e= c-b;
        int value;
        int sum = d+e;

        if(n%2!=0)
            value = a + (n/2)*sum;
        else
            value = b +(n/2-1)*sum;
     return value;
    }

    private static int findNthElement(int n){
        if(n <=1){
            return 1;
        }
        int sum = 1;
        for (int i=2;i<=n;i++){
            if(i % 2 == 0){
                sum +=2;
            }else{
                sum += 3;
            }
        }
        return sum;
    }
}
