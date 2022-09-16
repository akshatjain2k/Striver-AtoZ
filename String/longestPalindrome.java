package String;

public class longestPalindrome {
    static String longestPalin(String s){
        int n = s.length();
        String longest = "";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(n-j > i){
                    String res = s.substring(i,n-j);
                    if(checkPalindrome(res))
                        longest = (longest.length() >= res.length()) ? longest : res;
                }
                
            }
        }
        return longest;
    }
    static boolean checkPalindrome(String s){
        int n = s.length();
        
        for (int i=0; i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i))
                return false;
        }
        return true;
    }
 }