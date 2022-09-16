// Using Two Queue
package String;

import java.util.LinkedList;
import java.util.Queue;

public class checkRotation2 {
    static boolean checkRota(String s, String t) {
        if (s.length() != t.length())
            ;

        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q1.add(s.charAt(i));
        }

        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < t.length(); i++) {
            q2.add(t.charAt(i));
        }

        int k = t.length();
        while (k > 0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        if(checkRota(s1, s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");

    }
}
