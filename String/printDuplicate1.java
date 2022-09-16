package String;

public class printDuplicate1 {

    static final int CHAR = 256;

    static void fillcharCount(String str, int[] count) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            // System.out.println(count[str.charAt(i)]);
        }
    }

    static void printDups(String str) {
        int[] count = new int[CHAR];
        fillcharCount(str, count);

        for (int i = 0; i < CHAR; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + ", Count = " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "teststring";
        printDups(str);
    }
}