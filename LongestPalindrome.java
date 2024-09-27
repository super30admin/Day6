import java.util.HashSet;

//TC: O(n)
//SC: O(n)
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int counter = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length() ; i++) {
            if(set.contains(s.charAt(i))) {
                counter = counter + 2;
                set.remove(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) counter++;
        return counter;
    }
}
