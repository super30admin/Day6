import java.util.HashSet;
//TC O(n)
//SC O(n)
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set = new HashSet<Character>();
        int result = 0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                result+=2;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) return result+1;
        return result;
    }
}
