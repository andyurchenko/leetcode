package edu.leetcode.problems.problem_1356;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_1356Test {

    @Test
    void sortByBits() {
        Problem_1356 p = new Problem_1356();
        int[] res = p.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        //[0,1,2,4,8,3,5,6,7]
        res = p.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1});
        //[1,2,4,8,16,32,64,128,256,512,1024]

    }
}