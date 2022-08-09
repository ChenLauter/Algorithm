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
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+ "");
        }
        return res;
    }
}
