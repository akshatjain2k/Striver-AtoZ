package String;

import java.util.ArrayList;
import java.util.List;

public class printSubsequence {
    static List<String> al = new ArrayList<>();

    static void subSequence(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        subSequence(s.substring(1), ans + s.charAt(0));
        subSequence(s.substring(1), ans);
    }

    public static void main(String[] args) {
        String s = "abcd";
        subSequence(s, ""); // Calling a function
        System.out.println(al);
    }
}
