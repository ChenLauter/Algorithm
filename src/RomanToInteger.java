import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger {

    public static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(map.get(s.charAt(i)));
        }
        int i = 0;
        while (i < s.length()) {
            int cur = list.get(i);
            if (i < s.length() - 1 && cur < list.get(i+1)) {
                cur = list.get(i + 1) - cur;
                i++;
            }
            res += cur;
            i++;
        }
        return res;
    }

    public static int solution_2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int pre = map.get(s.charAt(0));
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            int cur = map.get(s.charAt(i));
            if (pre < cur) {
                res -= pre;
            } else {
                res += pre;
            }
            pre = cur;
        }
        res += pre;
        return res;
    }
}
