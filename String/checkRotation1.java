// Add both string 
package String;

public class checkRotation1 {
    static boolean checkRotat(String s1, String s2) {
        System.out.println(s1 + s2);
        return (s1.length() == s2.length()) &&
                ((s1 + s2).indexOf(s2) != -1);

    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (checkRotat(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
