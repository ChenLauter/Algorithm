/**
 <a href="https://leetcode.cn/problems/powx-n"></a>
 */

public class P50_Pow {

    /***
     *
     * 遇到时间复杂度小于O(n)的，考虑二分法
     */

    // 暴力解法
    public static double solution_1(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    // 快速幂，分治法递归
    public static double solution_2(double x, int n) {
        long ln = n;
        if (n < 0) {
            x = 1 / x;
            ln = -ln;
        }
        return inner(x, ln);
    }

    private static double inner(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double res = inner(x, n/2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }

    // 快速幂，二进制思路
    public static double solution_3(double x, int n) {
        long ln = n;
        if (ln < 0) {
            ln = -ln;
            x = 1/x;
        }
        double result = 1;
        while (ln > 0) {
            if ((ln & 1) == 1) {
                result *= x;
            }
            x *= x;
            ln >>= 1;
        }
        return result;
    }
}
