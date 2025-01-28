package problems.problem_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        int middle = list.size() / 2;
        int firstIndex = 0;
        int lastIndex = list.size() - 1;
        for (int i = firstIndex, j = lastIndex; i <= middle && j >= middle; i++, j--) {
            if (!Objects.equals(list.get(i), list.get(j))) {
                return false;
            }
        }

        return true;
    }
}
