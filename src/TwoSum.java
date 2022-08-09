import java.util.HashMap;

/***
 <a href="https://leetcode.cn/problems/two-sum"></a>
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example 1:
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 You can return the answer in any order.

 Follow-up: Can you come up with an algorithm that is less than (n2) time complexity?
 */

public class TwoSum {

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