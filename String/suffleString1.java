
package String;

import java.util.Arrays;

public class suffleString1 {

    static boolean checkLength(String first, String second, String result) {
        if (first.length() + second.length() != result.length()) {
          return false;
        }
        else {
          return true;
        }
      }
    

    static String sortString(String s){

        char[] ch = s.toCharArray();
        System.out.println(ch);
        Arrays.sort(ch);
        s = String.valueOf(ch);
        System.out.println(s);

        return s;
    }

    static boolean sufflechec(String first, String second, String result){
        first = sortString(first);    
        second = sortString(second);    
        result = sortString(result); 
        
        int i = 0, j = 0, k = 0;

        while (k != result.length()) {
            if(i < first.length() && first.charAt(i) == result.charAt(k))
                i++;
            else if(j < second.length() && second.charAt(j) == result.charAt(k))
                j++;
            else{
                return false;
            }
            k++;
        }
        if( i < first.length() || j < second.length()){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};
    
        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
          if (checkLength(first, second, result) == true && sufflechec  (first, second, result) == true) {
            System.out.println(result + " is a valid shuffle of " + first + " and " + second);
          }
          else {
            System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
          }
        }
      }
}
