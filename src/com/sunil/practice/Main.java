package com.sunil.practice;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String myString = "This is\nMy new\nCar.";
        System.out.println(myString);

        byte[] byteArray = myString.getBytes();

        FileOutputStream fous = new FileOutputStream("C:/out.txt");
        fous.write(byteArray);
        fous.close();
    }
}