import java.util.ArrayList;
import java.util.HashMap;

/**
 Given a string s, find the length of the longest substring without repeating characters.

 Example 1:
 Input: s = "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.

 Example 2:
 Input: s = "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.

 Example 3:
 Input: s = "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LengthOfLongestSubstring {

    public static int solution_1(String s) {
        // 移动窗口，简单直白的队列思想，右边加数据判断是否重复，重复情况下一直移除左边数据直到不重复
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            char cur = s.charAt(i);
            while (list.contains(cur)) {
                list.remove(0);
            }
            list.add(cur);
            // 每次加减数据都需要保存下最大值
            max = Math.max(max, list.size());
        }
        return max;
    }

    public static int solution_2(String s) {
        // 同样是滑动窗口的思想，left是窗口的左下标，i是右下标，窗口的大小为（i - left + 1）
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                // abba这种情况，要确保left一直往右边走
                left = Math.max(left, map.get(cur) + 1);
            }
            map.put(cur, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
