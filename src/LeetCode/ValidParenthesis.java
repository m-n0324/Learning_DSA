package LeetCode;

import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    // Testing ke liye main method (Optional)
    public static void main(String[] args) {
        ValidParenthesis solver = new ValidParenthesis();
        System.out.println(solver.isValid("()[]{}")); // Output: true
        System.out.println(solver.isValid("(]"));     // Output: false
    }
}