package com.sunil.practice;

import java.util.ArrayList;
import java.util.List;


public class TestOne {
    public static void main(String[] args) {
        //Test m = new Test();
        //System.out.println("x = " + m.x + ", y = " + m.y);
        List<Integer> keys = new ArrayList<>();
        keys.add(3);
        keys.add(2);
        keys.add(5);
        TestOne.creatBST(keys);
    }

    static Node root;


    static class Node{
        int key;
        Node left , right;
        Node(int k){
            key = k;
        }
    }

    public static void creatBST(List<Integer> keys){
        TestOne testOne = new TestOne();
        TestOne.root = new Node(4);

        root.left = new Node(5);
        root.right = new Node(6);
        root.left.left = new Node(4);
    }
}
