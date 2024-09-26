//time complexity: O(n), n is length of array
//space complexity:O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        int maxLen = 0;
        
        for(int i=0; i<s.length(); i++ ) {
            char c=s.charAt(i);

            //if set contains c that means we have encountered it 
            //and can be used to build pallindrome
            if(set.contains(c)) {
                //remove c from set and increment maxLen by 2
                set.remove(c);
                maxLen+=2;
            } else {
                set.add(c);
            }
        }
        
        //after iterating through the string, if there are still characters
        //we add 1 to max len 
        //specifying picking one char from the set to form odd length pallindrom
        if(!set.isEmpty())
            maxLen++;
        
        return maxLen;
    }
}
