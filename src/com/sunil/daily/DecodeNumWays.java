package com.sunil.daily;

import java.util.ArrayList;
import java.util.List;

/*
    Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

    For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 */
public class DecodeNumWays {

    public static void main(String[] args) {
        String message = "2623";
        Integer[] memo = new Integer[message.length()+1];
        System.out.println("number of ways:"+decoce(message, message.length(), memo));
    }

    private static int decoce(String message, int k, Integer[] memo){
        if(k == 0){
            return 1;
        }
        int s = message.length() - k;
        if(message.charAt(0) == '0'){
            return 0;
        }
        if(memo[k] != null){
            return memo[k];
        }

        int ways =  decoce(message, k-1, memo);
        if(k>=2 && Integer.parseInt(message.substring(s, s+2)) <= 26){
            ways += decoce(message, k-2, memo);
        }
        memo[k]= ways;
        return ways;
    }

}
