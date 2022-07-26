import java.util.ArrayList;
import java.util.List;

/***
 <a href="https://leetcode.cn/problems/add-two-numbers"></a>

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example 1:
 Input: l1 = [2,4,3], l2 = [5,6,4]
 Output: [7,0,8]
 Explanation: 342 + 465 = 807.

 Example 2:
 Input: l1 = [0], l2 = [0]
 Output: [0]

 Example 3:
 Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 Output: [8,9,9,9,0,0,0,1]

 */
public class AddTwoNumbers {

    public static ListNode solution(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        System.out.println(list1);
        System.out.println(list2);
        List<Integer> big;
        List<Integer> small;
        if (list1.size() > list2.size()) {
            big = list1;
            small = list2;
        } else {
            big = list2;
            small = list1;
        }
        int s_size = small.size();
        ListNode pre = new ListNode(0);
//        ListNode temp = pre.next;
        ListNode temp = pre;
        // [1,2]
        // [3,4]
        int carry = 0;
        for (int i = 0; i < big.size(); i++) {
            int b = big.get(i);
            int s = 0;
            if (i < s_size) {
                s = small.get(i);
            }
            int res = b + s + carry;
            if (res > 9) {
                res = res % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode cur = new ListNode(res);
            temp.next = cur;
            temp = cur;
        }
        // 最后一位需要检查是否需要进1
        if (carry == 1) {
            temp.next = new ListNode(1);
        }
        return pre.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
