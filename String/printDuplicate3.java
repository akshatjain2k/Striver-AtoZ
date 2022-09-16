// Using Map
package String;

import java.util.HashMap;
import java.util.Map;

public class printDuplicate3 {

    static void printDupp(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), count.get(str.charAt(i)));
            } else {
                count.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.println(mapElement.getKey() + ", Count = " + mapElement.getValue());
            }
        }
    }

    public static void main(String args[]) {
        String str = "teststring";
        printDupp(str);
    }

}
