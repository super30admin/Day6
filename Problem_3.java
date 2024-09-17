// Time complexity : O(n)
// Space complexity : O(1)

// Used hashset for storing characters. If a character appears twice, its removed and count is incremented by 2. If set is not empty then count is increased by 1.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                count +=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
           return count;
    }
}
