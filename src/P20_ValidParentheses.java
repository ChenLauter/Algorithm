import java.util.Stack;

/**
 <a href="https://leetcode.cn/problems/valid-parentheses"></a>
 */

public class P20_ValidParentheses {

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        // (]
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!stack.empty()) {
                char pre = stack.peek();
                if (pre == '(' && cur == ')') {
                    stack.pop();
                } else if (pre == '{' && cur == '}') {
                    stack.pop();
                } else if (pre == '[' && cur == ']') {
                    stack.pop();
                } else {
                    stack.push(cur);
                }
            } else {
                stack.push(cur);
            }
        }
        return stack.empty();
    }

    public static void test() {
        String input = "()[]{}";
        System.out.println(solution(input));
    }
}
