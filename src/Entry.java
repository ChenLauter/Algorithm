import java.util.ArrayList;
import java.util.List;

public class Entry {

    public static void main(String[] args) {
        Entry entry = new Entry();
//        entry.lengthOfLongestSubstring();
        entry.addTowNumbers();
    }

    private void lengthOfLongestSubstring() {
        String input = "apple";
        int result = LengthOfLongestSubstring.solution_1(input);
        System.out.println("length of longest substring of " + input + " is " + result);
    }

    private void fourSum() {
        // [1,-2,-5,-4,-3,3,3,5]
        //-11
        int[] input = new int[]{1,-2,-5,-4,-3,3,3,5};
        // sort [-5,-4,,3]
        int target = -11;
        List<List<Integer>> result = FourSum.solution_1(input, target);
        System.out.println(result);
    }

    private void threeSum() {
        int[] input = new int[]{0,0,0,0,0};
        List<List<Integer>> result = ThreeSum.solution_1(input);
        System.out.println("three sum result is " + result);
    }

    private void addTowNumbers() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(1, new AddTwoNumbers.ListNode(2));
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(3, new AddTwoNumbers.ListNode(4));
        AddTwoNumbers.ListNode result = AddTwoNumbers.solution(l1, l2);
        List<Integer> list = new ArrayList<>();
        while (result != null) {
            list.add(result.val);
            result = result.next;
        }
        System.out.println(list);
    }
}
