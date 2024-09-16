// Time Complexity: O(N)
//Space Complexity: O(N)
//Runtime: 17 ms, faster than 92.81% of Java online submissions for Contiguous Array.
//Memory Usage: 48.9 MB, less than 28.83% of Java online submissions for Contiguous Array.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                count += 2;
            }else{
                set.add(ch);
            }
        }
        if(set.size() > 0)
            count += 1;
        return count;
    }
}
