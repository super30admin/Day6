import java.util.HashSet;

//TC = O(n)
//SC = O(1)
// Find the length of longest palindrome
class longestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the set contains
            if (set.contains(c)) {
                cnt = cnt + 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }

        }
        if(!set.isEmpty()){
            cnt = cnt +1;
        }
        return cnt;
    }
}