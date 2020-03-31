package com.sunil.algorithms;

import java.util.Arrays;

public class ForwardBackward {

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        // Initialize result
        String result = "";

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {

            // Comput sum of last
            // digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);

            // If current digit sum is
            // 1 or 3, add 1 to result
            result = (char)(s % 2 + '0') + result;

            // Compute carry
            s /= 2;

            // Move to next digits
            i--; j--;
        }

        //Character[] elements = {'A','B','C','D','E'};
        //combination(elements, 3);

        //int[] nums = {2, 7, 11, 15};
        //System.out.println(Arrays.toString(twoSum(nums, 22)));

        int N = 100_000_000;
        System.out.println(N);

        //System.out.println(primePalindrome(102));
        //System.out.println(isPrime(4));
        //int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        //plusOne(digits);
    }

    public static int[] plusOne1(int[] digits) {
        int N = digits.length;
        long multiply = 1;
        long sum = 0;
        boolean allNine = true;
        for(int i=N-1;i>=0;i--){
            sum += digits[i] * multiply;
            multiply = multiply * 10;
            if(digits[i] != 9) allNine = false;
        }

        sum++;

        if(allNine){
            N++;
            digits = new int[N];
        }
        System.out.println(sum % 10);
        for(int i=N-1;i>=0;i--){
            digits[i] = (int) (sum % 10);
            System.out.println(digits[i]);
            sum -= digits[i];
            sum = sum/10;
            System.out.println(sum);
        }

        return digits;
    }

    public static int[] plusOne(int[] digits) {
        int N = digits.length;
        for(int i=N-1;i>=0;i--){

            if(digits[i] != 9) {
                digits[i] += 1;
                break;
            }
        }


        return digits;
    }

    public static int primePalindrome(int N) {
        for (int L = 1; L <= 5; ++L) {
            //Check for odd-length palindromes
            for (int root = (int)Math.pow(10, L - 1); root < (int)Math.pow(10, L); ++root) {
                StringBuilder sb = new StringBuilder(Integer.toString(root));
                for (int k = L-2; k >= 0; --k)
                    sb.append(sb.charAt(k));
                int x = Integer.valueOf(sb.toString());
                if (x >= N && isPrime(x))
                    return x;
                //If we didn't check for even-length palindromes:
                //return N <= 11 ? min(x, 11) : x
            }

            //Check for even-length palindromes
            for (int root = (int)Math.pow(10, L - 1); root < (int)Math.pow(10, L); ++root) {
                StringBuilder sb = new StringBuilder(Integer.toString(root));
                for (int k = L-1; k >= 0; --k)
                    sb.append(sb.charAt(k));
                int x = Integer.valueOf(sb.toString());
                if (x >= N && isPrime(x))
                    return x;
            }
        }

        throw null;
    }

    private static int[] twoSum(int[] nums, int target) {
        int N = nums.length;

        int r = 0;
        int i = 0;

        int[] indices = new int[2];

        while (r >= 0){

            if(i <= N + (r - 2)){
                indices[r] = i;

                if(r == 1){
                    if(target == nums[indices[0]]+nums[indices[1]])
                       break;
                    i++;
                }else{
                    i = indices[r]+1;
                    r++;
                }

            }else{
                r--;
                if(r >= 0) i=indices[r]+1;
            }
        }
        return indices;
    }

     public static boolean isPrime(int N) {
        if (N < 2) return false;
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d)
            if (N % d == 0) return false;
        return true;
    }


    public static void combination(Object[]  elements, int k){

        // get the length of the array
        // e.g. for {'A','B','C','D'} => N = 4
        int N = elements.length;

        if(k > N){
            System.out.println("Invalid input, K > N");
            return;
        }

        // init combination index array
        int pointers[] = new int[k];


        int r = 0; // index for combination array
        int i = 0; // index for elements array

        while(r >= 0){

            // forward step if i < (N + (r-K))
            if(i <= (N + (r - k))){
                pointers[r] = i;

                // if combination array is full print and increment i;
                if(r == k-1){
                    print(pointers, elements);
                    i++;
                }
                else{
                    // if combination is not full yet, select next element
                    i = pointers[r]+1;
                    r++;
                }
            }

            // backward step
            else{
                r--;
                if(r >= 0)
                    i = pointers[r]+1;

            }
        }
    }

    private static void print(int[] pointers, Object[] elements) {
        for(int i=0;i<pointers.length;i++){
            System.out.print(elements[pointers[i]]+" ");
        }
        System.out.println();
    }

}
