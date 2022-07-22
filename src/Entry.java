import java.util.ArrayList;

public class Entry {

    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.lengthOfLongestSubstring();
    }

    private void lengthOfLongestSubstring() {
        String input = "apple";
        int result = LengthOfLongestSubstring.solution_1(input);
        System.out.println("length of longest substring of " + input + " is " + result);
    }
}
