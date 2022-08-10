/**
 * <a href="https://leetcode.cn/problems/arranging-coins/"></a>
 */
public class P441_ArrangingCoins {


    // 暴力解
    public static int solution(int n) {
        int result = 0;
        while (n > result) {
            result++;
            n -= result;
        }
        return result;
    }

    // 等差数列前n项和，一元二次方程求x，Δ = b^2 - 4ac
    public static int solution_2(int n) {
        return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
    }

    // 二分法
    public static int solution_3(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            // 这里左边+1防止死循环
            int mid = (right - left + 1) / 2 + left;
            if ((mid + 1L) * mid <= 2L * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
