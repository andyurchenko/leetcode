package edu.leetcode.problems.problem_101;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRec(root, root);
    }

    boolean isSymmetricRec(TreeNode originalNode, TreeNode mirrorNode) {
        if (originalNode == null && mirrorNode == null) {
            return true;
        }

        if (originalNode != null && mirrorNode == null) {
            return false;
        }

        if (originalNode == null) {
            return false;
        }

        if (originalNode.val != mirrorNode.val) {
            return false;
        }

        return isSymmetricRec(originalNode.left, mirrorNode.right) && isSymmetricRec(originalNode.right, mirrorNode.left);
    }

//    void isSymmetricRec(TreeNode originalNode, TreeNode mirrorNode, Boolean result) {
//        if (originalNode == null && mirrorNode != null) {
//            result = false;
//        }
//
//        if (originalNode != null && mirrorNode == null) {
//            result = false;
//        }
//
//        if (originalNode != null && mirrorNode != null && originalNode.val != mirrorNode.val) {
//            result = false;
//        }
//
//        if (originalNode != null && mirrorNode != null) {
//            isSymmetricRec(originalNode.left, mirrorNode.right, result);
//            isSymmetricRec(originalNode.right, mirrorNode.left, result);
//        }
//    }

}
