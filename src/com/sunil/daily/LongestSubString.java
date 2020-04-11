package com.sunil.daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

    For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".
 */
public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcba";
        int k = 2;
        System.out.println("Longest Substring:"+longestSubString(s, k));
    }

    private static String longestSubString(String s, int k) {
        if(k <= 0){
            return null;
        }
        int start = 0;
        int end = 1;

        int start_temp = 0;
        int end_temp = 0;

        Set<Character> window = new HashSet<>();
        // Map freq of added unique char so we can save add and remove operations for set.
        Map<Character, Integer> freqMap = new HashMap<>();
        for (;end_temp<s.length();end_temp++){
            window.add(s.charAt(end_temp));
            if(freqMap.get(s.charAt(end_temp)) != null){
                freqMap.put(s.charAt(end_temp), freqMap.get(s.charAt(end_temp)) + 1);
            }else{
                freqMap.put(s.charAt(end_temp), 1);
            }

            if(window.size() > k){
                //Remove from set if freq of char is 0
                if(freqMap.get(s.charAt(start_temp)) != null){
                    freqMap.put(s.charAt(start_temp),freqMap.get(s.charAt(start_temp)) - 1 );
                    if(freqMap.get(s.charAt(start_temp)) == 0)
                        window.remove(s.charAt(start_temp));
                }

                start_temp++;
            }
            if(end_temp-start_temp > end-start){
                start = start_temp;
                end = end_temp;
            }
        }

        return s.substring(start, end+1);
    }


}
