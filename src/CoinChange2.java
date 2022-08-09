/***
 <a href="https://leetcode.cn/problems/coin-change-2"></a>
 */
public class CoinChange2 {
    // 题目：返回所有组合


    // [1,2] 4
    public static int solution(int amount, int[] coins) {
        int[] all = new int[amount + 1];
        all[0] = 1;
        for (int item: coins) {
            for (int i = item; i <= amount; i++) {
                //
                all[i] += all[i - item];
            }
        }
        return all[amount];
    }
}
