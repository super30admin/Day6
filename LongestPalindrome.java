// Time Complexity : 0(n)
// Space Complexity : O(1); as the unique input chars are fixed 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>(); 
        int count = 0;
                      
        for (char ch : s.toCharArray()) {
            if(set.contains(ch)){   //if curent char is already present 
                count += 2;         // pair found
                set.remove(ch);     // remove the paired char from set
            }else{
                set.add(ch);        // add the new unique char in set
            }
        }
            
        if(!set.isEmpty())  // one char can be used in middle
            count++;
        
        return count;
    }
}
