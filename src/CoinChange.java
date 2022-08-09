import java.util.Arrays;

/***
 <a href="https://leetcode.cn/problems/coin-change"></a>
 */
public class CoinChange {
    public static int solution(int[] coins, int amount) {
        int[] all = new int[amount + 1];
        Arrays.fill(all, amount + 1);
        all[0] = 0;
        for (int i = 1; i <= amount ; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    all[i] = Math.min(all[i], all[i - coin] + 1);
                }
            }
        }
        int res = all[amount];
        return res > amount ? -1 : res;
    }
}
