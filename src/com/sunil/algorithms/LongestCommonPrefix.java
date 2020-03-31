package com.sunil.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        //System.out.println(str[3].length());
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(str));
        List g = new ArrayList();
    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String prefix = "";
        if (n > 0) {
            int wordIndex = 0;
            int wordLength = strs[0].length();
            for (int i = 0; i < n; i++) {
                if (wordLength > strs[i].length())
                    wordLength = strs[i].length();
            }

            if (wordLength > 0) {
                char letter;
                boolean match;
                while (wordIndex < wordLength) {
                    letter = strs[0].charAt(wordIndex);
                    match = true;
                    for (int i = 1; i < n; i++) {
                        if (letter != strs[i].charAt(wordIndex)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        prefix = prefix + letter;
                    } else {
                        break;
                    }
                    wordIndex++;
                }
            }
        }

        return prefix;
    }
}
