package com.sunil.daily;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BinaryTreeSerialize {

    public static void main(String[] args) {
        TreeNode node = new TreeNode("1", new TreeNode("2", new TreeNode("4", new TreeNode("6"), null), new TreeNode("5")), new TreeNode("3"));
        System.out.println(serialize(node));
        TreeNode treeNode = deserialize(serialize(node));
        System.out.println(serialize(treeNode));
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        List<String> nodes = new ArrayList<>();
        serializeNode(root, nodes);
        return String.join(",", nodes);
    }

    private static void serializeNode(TreeNode node, List<String> nodes) {
        if (node != null) {
            nodes.add(node.value);
            serializeNode(node.left, nodes);
            serializeNode(node.right, nodes);
        } else {
            nodes.add("#");
        }
    }

    // Decodes your encoded data to tree.
    private static TreeNode deserialize(String data) {
        List<String> nodes = Arrays.asList(data.split(","));
        Iterator<String> iterator = nodes.iterator();
        return deserializeNode(iterator);
    }

    private static TreeNode deserializeNode(Iterator<String> iterator) {
        TreeNode node = null;
        String value = iterator.next();
        if (value.equalsIgnoreCase("#"))
            return null;
        node = new TreeNode(value);
        node.left = deserializeNode(iterator);
        node.right = deserializeNode(iterator);
        return node;
    }
}