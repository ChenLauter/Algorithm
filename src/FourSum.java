import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 <a href="https://leetcode.cn/problems/4sum"></a>

 Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

 0 <= a, b, c, d < n
 a, b, c, and d are distinct.
 nums[a] + nums[b] + nums[c] + nums[d] == target
 You may return the answer in any order.

 Example 1:
 Input: nums = [1,0,-1,0,-2,2], target = 0
 Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

 Example 2:
 Input: nums = [2,2,2,2,2], target = 8
 Output: [[2,2,2,2]]

 * */
public class FourSum {

    // [1,2,3,4,5,6] target = 10
    // [1,1,1,1] target = 2
    public static List<List<Integer>> solution_1(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        return result;
    }
}
