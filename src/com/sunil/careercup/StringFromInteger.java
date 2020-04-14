package com.sunil.careercup;
/*
      Write a function to return string when passed integer . Note : do not use tostring() in built function.
      E.g 123 --> "123"
 */
public class StringFromInteger {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println("Number to string:"+ numberToString(number));
    }

    private static String numberToString(int number) {
        StringBuilder sb = new StringBuilder();
        int zero= '0';
        while(number != 0){
            sb.insert(0, (char) (zero + (number%10)));
            number = number/10;
        }
        return sb.toString();
    }
}
