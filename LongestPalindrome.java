import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int len = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(!charSet.contains(ch)){
                charSet.add(ch);
            }else{
                charSet.remove(ch);
                len += 2;
            }
        }

        if(!charSet.isEmpty())  len++;

        return len;
    }
}
