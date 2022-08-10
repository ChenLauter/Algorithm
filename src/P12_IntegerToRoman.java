import java.util.HashMap;

/***
 <a href="https://leetcode.cn/problems/integer-to-roman/"></a>
 */

public class P12_IntegerToRoman {

    public static String solution(int num) {
        int[] integer = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder builder = new StringBuilder();
        for (int i = integer.length - 1; i > -1; i--) {
            int cur = integer[i];
            while (cur <= num) {
                num -= cur;
                builder.append(roman[i]);
            }
        }
        return builder.toString();
    }

    public static void test() {
        int num = 1235;
        String result = solution(num);
        System.out.println("IntegerToRoman result is " + result);
    }
}
