import java.util.HashSet;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class Problem3 {

    public static int longestPalindrome(String s) {
        if(s.length() == 1) return 1;

        HashSet<Character> holder = new HashSet<>();
        int count = 1;
        for(Character c : s.toCharArray()){
            if(holder.contains(c)){
                holder.remove(c);
                count += 2;
            } else holder.add(c);
        }
        return holder.isEmpty() ? count - 1 : count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); // 7
    }

}
