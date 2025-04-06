package edu.leetcode.auxiliary;

public class Aux {
    public static TreeNode getTree_1() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode l2 = new TreeNode();
        l2.val = 2;

        TreeNode l3 = new TreeNode();
        l3.val = 3;

        root.left = l2;
        root.right = l3;

        TreeNode l4 = new TreeNode();
        l4.val = 4;

        TreeNode l5 = new TreeNode();
        l5.val = 5;

        l2.left = l4;
        l2.right = l5;

        TreeNode l6 = new TreeNode();
        l6.val = 6;

        TreeNode l7 = new TreeNode();
        l7.val = 7;

        l5.left = l6;
        l5.right = l7;

        TreeNode l8 = new TreeNode();
        l8.val = 8;

        TreeNode l9 = new TreeNode();
        l9.val = 9;

        l3.right = l8;
        l8.left = l9;

        return root;
    }

/*
          1
       2     2
      3 4   4 3
 */
    public static TreeNode getTree_2() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode l2Left = new TreeNode();
        l2Left.val = 2;

        TreeNode l2Right = new TreeNode();
        l2Right.val = 2;

        root.left = l2Left;
        root.right = l2Right;

        TreeNode l3Left = new TreeNode();
        l3Left.val = 3;

        TreeNode l4Right = new TreeNode();
        l4Right.val = 4;

        l2Left.left = l3Left;
        l2Left.right = l4Right;

        TreeNode l3Right = new TreeNode();
        l3Right.val = 3;

        TreeNode l4Left = new TreeNode();
        l4Left.val = 4;

        l2Right.left = l4Left;
        l2Right.right = l3Right;

        return root;
    }

/*
          1
       2     2
        3     3
 */
    public static TreeNode getTree_3() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode l2Left = new TreeNode();
        l2Left.val = 2;

        TreeNode l2Right = new TreeNode();
        l2Right.val = 2;

        root.left = l2Left;
        root.right = l2Right;

        TreeNode l3Right_One = new TreeNode();
        l3Right_One.val = 3;
        l2Left.right = l3Right_One;

        TreeNode l3Right_Two = new TreeNode();
        l3Right_Two.val = 3;
        l2Right.right = l3Right_Two;

        return root;
    }

/*
            3
       9         20
              15    7
 */
    public static TreeNode getTree_4() {
        TreeNode root = new TreeNode();
        root.val = 3;

        TreeNode l_9_Left = new TreeNode();
        l_9_Left.val = 9;

        TreeNode l_20_Right = new TreeNode();
        l_20_Right.val = 20;

        root.left = l_9_Left;
        root.right = l_20_Right;

        TreeNode l_15_Left = new TreeNode();
        l_15_Left.val = 15;

        TreeNode l_7_Right = new TreeNode();
        l_7_Right.val = 7;

        l_20_Right.left = l_15_Left;
        l_9_Left.right = l_7_Right;

        return root;
    }


/**
 *
 *
          1
       /    \
      2      3
    /  \      \
  4     5      8
       / \    /
      6   7  9


 */

    public static TreeNode getTree_5() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode l_2_Left = new TreeNode();
        l_2_Left.val = 2;

        TreeNode l_3_Right = new TreeNode();
        l_3_Right.val = 3;

        root.left = l_2_Left;
        root.right = l_3_Right;

        TreeNode l_4_Left = new TreeNode();
        l_4_Left.val = 4;

        TreeNode l_5_Right = new TreeNode();
        l_5_Right.val = 5;

        l_2_Left.left = l_4_Left;
        l_2_Left.right = l_5_Right;

        TreeNode l_6_Left = new TreeNode();
        l_6_Left.val = 6;

        TreeNode l_7_Right = new TreeNode();
        l_7_Right.val = 7;
        l_5_Right.left = l_6_Left;
        l_5_Right.right = l_7_Right;

        TreeNode l_8_Right = new TreeNode();
        l_8_Right.val = 8;
        l_3_Right.right = l_8_Right;

        TreeNode l_9_Left = new TreeNode();
        l_9_Left.val = 9;
        l_8_Right.left = l_9_Left;


        return root;
    }

/**
8 <- 7 <- 6 <- 5 <- 4 <- 3 <- 2 <- 1 -> null
*/

    public static TreeNode getTree_6() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode node = new TreeNode();
        node.val = 2;
        root.left = node;

        node.left = new TreeNode();
        node = node.left;
        node.val = 3;

        node.left = new TreeNode();
        node = node.left;
        node.val = 4;

        node.left = new TreeNode();
        node = node.left;
        node.val = 5;

        node.left = new TreeNode();
        node = node.left;
        node.val = 6;

        node.left = new TreeNode();
        node = node.left;
        node.val = 7;

        node.left = new TreeNode();
        node = node.left;
        node.val = 8;


        return root;
    }

    /**
     8 <- 7 <- 6 <- 5 <- 4 <- 3 <- 2 <- 1 -> null
     */

    public static TreeNode getTree_7() {
        TreeNode root = new TreeNode();
        root.val = 1;

        TreeNode node = new TreeNode();
        node.val = 2;
        root.left = node;

        node.left = new TreeNode();
        node = node.left;
        node.val = 3;

        return root;
    }
}
