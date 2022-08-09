import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Entry {

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

    private void pow() {
        double result = Pow.solution_3(2,-2);
        System.out.println("Pow result is " + result);
    }

    private void coinChange2() {
        int[] input = new int[]{1,2,5};
        int amount = 15;
        int result = CoinChange2.solution(amount, input);
        System.out.println("coin changes2 result is " + result);
    }

    private void arrangingCoins() {
        int result = ArrangingCoins.solution_3(Integer.MAX_VALUE);
        System.out.println("arranging coin result is " + result);
    }

    private void coinChange() {
        int[] input = new int[]{1,2,5};
        int amount = 15;
        int result = CoinChange.solution(input, amount);
        System.out.println("coin changes result is " + result);
    }

    private void romanToInteger() {
        String input = "MCMXCIV";
        int result = RomanToInteger.solution_2(input);
        System.out.println("RomanToInteger result is " + result);
    }

    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.romanToInteger();
    }
}
