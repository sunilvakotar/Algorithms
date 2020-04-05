package com.sunil.daily;

public class UnivalTree {

    /*
            0
           / \
          1*  0
             / \
            1*  1*
           / \
          1*  1*
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode("0", new TreeNode("1"), new TreeNode("0",new TreeNode("1", new TreeNode("1"), new TreeNode("1")), new TreeNode("0")));
        System.out.println("unival subtree count:"+ findUnivalTree(root));
    }
    static Integer count = 0;
    private static Integer findUnivalTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftCount = findUnivalTree(root.left);
        int rightCount = findUnivalTree(root.right);
        int totalCount = leftCount+rightCount;

        if( root.left != null && !root.value.equals(root.left.value)){
            return totalCount;
        }else if( root.right != null && !root.value.equals(root.right.value)){
            return totalCount;
        }else{
            return totalCount + 1;
        }
    }
}
