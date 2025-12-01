package edu.leetcode.problems.easy.problem_257;

import edu.leetcode.auxiliary.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EasyProblem_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        final List<String> resultList = new ArrayList<>();
        final List<Integer> bufferList = new ArrayList<>();
        binaryTreePathRec(root, resultList, bufferList, 0 );

        return resultList;
    }

    public void binaryTreePathRec(final TreeNode root, final List<String> resultList, final List<Integer> bufferList, int currentIndex) {
        if (root == null ) {
            return;
        }

        bufferList.add(root.val);
        binaryTreePathRec(root.left, resultList, bufferList, ++currentIndex);
        currentIndex--;
        binaryTreePathRec(root.right, resultList, bufferList, ++currentIndex);
        currentIndex--;
        if (root.left == null && root.right == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(bufferList.get(0));
            for (int i = 1; i < bufferList.size(); i++) {
                sb.append("->").append(bufferList.get(i));
            }
            resultList.add(sb.toString());
        }
        bufferList.remove(currentIndex);
    }
}
