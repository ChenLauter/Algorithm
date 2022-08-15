import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/generate-parentheses"></a>
 */
public class P22_GenerateParentheses {

    static List<String> list = new ArrayList<>();

    public static List<String> solution(int n) {
        generate("", n, n);
        return list;
    }

    public static void generate(String str, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }
        if (left == right) {
            generate(str + "(", left -1 , right);
        } else {
            if (left > 0) {
                generate(str + "(", left -1, right);
            }
            generate(str + ")", left, right - 1);
        }
    }

    public static void test() {
        int input = 3;
        solution(input);
        System.out.println(list);
    }
}
