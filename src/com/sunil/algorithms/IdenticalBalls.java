package com.sunil.algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdenticalBalls {
    public static void main(String[] args) {
        try {
            System.out.println("Enter Number of Balls in a Bag: ");
            Scanner scanner = new Scanner(System.in);
            int balls = scanner.nextInt();
            if(balls >= 1) {
                System.out.println("Total number of balls : " + balls);
                System.out.println("Total Number of ways to remove balls from the : " + ways(balls));
            }else{
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Only Number >= 1 is allowed");
        }
    }

    private static int ways(int balls) {
        switch (balls) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return ways(balls - 1) + ways(balls - 2);
        }
    }
}
