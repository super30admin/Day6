import java.util.HashSet;

public class longestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int result = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (map.contains(c)){
                result +=2;
                map.remove(c);
            } else {
                map.add(c);
            }
        }
        if (!map.isEmpty()){
            result+=1;
        }
        return result;
    }
}
