import java.util.HashSet;

public class LongestPalindrome {
	public static int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(hs.contains(chr)){
                count += 2;
                hs.remove(chr);
            }
            else{
                hs.add(chr);
            }
        }
        if(!hs.isEmpty())
            count++;
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(LongestPalindrome.longestPalindrome("abccccdd"));
		System.out.println(LongestPalindrome.longestPalindrome("a"));
		System.out.println(LongestPalindrome.longestPalindrome("bb"));
	}
}
