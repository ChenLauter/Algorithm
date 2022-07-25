import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 <a href="https://leetcode.cn/problems/3sum"></a>
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
    and nums[i] + nums[j] + nums[k] == 0.
 Notice that the solution set must not contain duplicate triplets.


 Example 1:
 Input: nums = [-1,0,1,2,-1,-4]
 Output: [[-1,-1,2],[-1,0,1]]
 Explanation:
 nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 The distinct triplets are [-1,0,1] and [-1,-1,2].

 Notice that the order of the output and the order of the triplets does not matter.

 Example 2:
 Input: nums = [0,1,1]
 Output: []
 Explanation: The only possible triplet does not sum up to 0.

 Example 3:
 Input: nums = [0,0,0]
 Output: [[0,0,0]]
 Explanation: The only possible triplet sums up to 0.

 */

public class ThreeSum {

    public static List<List<Integer>> solution_1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            // 长度小于3，不满足条件
            return result;
        }
        Arrays.sort(nums);
        if (nums[0] > 0) {
            // 排序后第一个就大于0了，后续的也不满足条件
            return result;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            // 第一个数去重
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // 养成好习惯，避免遍历的时候重复取nums[i]
            int cur = nums[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int sum = cur + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> shoot = new ArrayList<>();
                    shoot.add(cur);
                    shoot.add(nums[left]);
                    shoot.add(nums[right]);
                    result.add(shoot);
                    // 第二个数去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 第三个数去重
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left ++;
                    right --;
                } else if (sum > 0) {
                    // 结果偏大了，右指针左移，减少值
                    right --;
                } else  {
                    // 结果偏小了，左指针右移，增加值
                    left++;
                }
            }
        }
        return result;
    }
}
