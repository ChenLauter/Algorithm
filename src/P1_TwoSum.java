import java.util.HashMap;

/***
 <a href="https://leetcode.cn/problems/two-sum"></a>
 */

public class P1_TwoSum {

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = target - nums[i];
            if (map.containsKey(cur)) {
                return new int[]{i, map.get(cur)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
