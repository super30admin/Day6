// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>(); //For storing characters
        int result = 0; //For maintaining longest palindrome 
        
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);   //converting string to character
            
            //if hash set contains character, it means it has already occured once, so we will increment the result by 2 and remove that character from the set, else we will add character to the set
            
            if(set.contains(c)){    
                result += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        //if set is non empty, then it contains characters with single occurrence, so increment the result by 1
        if(!set.isEmpty())  result++;
        return result;
    }
}