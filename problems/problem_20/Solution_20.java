package problems.problem_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution_20 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        if (chars[0] == ')' || chars[0] == '}' || chars[0] == ']') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                if (brackets.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
}
