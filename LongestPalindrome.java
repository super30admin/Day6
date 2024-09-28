// Time Complexity :O(N) where n is the length of the string
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:Store the character in the hashset. If a character is already presnt add 2 to count
//and remove the character from the hashset. 
class Solution {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i = 0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                count+=2;
                set.remove(s.charAt(i));
            }
            else
                set.add(s.charAt(i));
            
        }
        if(set.size()>0)
            count++;
        return count;
    }
}