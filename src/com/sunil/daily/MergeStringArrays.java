package com.sunil.daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeStringArrays {

        public static String[] uniqueNames(String[] names1, String[] names2) {
            Set<String> uniqueNames = new HashSet<String>();
            uniqueNames.addAll(Arrays.asList(names1));
            uniqueNames.addAll(Arrays.asList(names2));
            String[] uniqueNameArray = new String[uniqueNames.size()];
            return uniqueNames.toArray(uniqueNameArray);
        }

        public static void main(String[] args) {
            String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
            String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
            System.out.println(String.join(", ", MergeStringArrays.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
        }
}
