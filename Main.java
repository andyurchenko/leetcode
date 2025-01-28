import problems.problem_1.Solution;
import problems.problem_13.Solution_13;
import problems.problem_20.Solution_20;
import problems.problem_9.Solution_9;

public class Main {
    public static void main(String[] args) {
        Solution_20 solution = new Solution_20();
        System.out.println(solution.isValid("(("));
        System.out.println(solution.isValid("({[((({[[[()]]]})))]}("));
    }
}
