package edu.leetcode.problems.easy.problem_257;

import edu.leetcode.auxiliary.Aux;
import edu.leetcode.auxiliary.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblem_257Test {

    @Test
    void binaryTreePaths() {
        EasyProblem_257 easyProblem257 = new EasyProblem_257();

        List<String> list = easyProblem257.binaryTreePaths(Aux.getTree_2());
    }
}

/*
          1
       2     3
      4 5   6 7
 */