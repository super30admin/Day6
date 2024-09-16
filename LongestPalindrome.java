//time complexity: O(1)
//space complexity: O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashSet<Character> setChar= new HashSet<>();
        
        for(int i=0 ;i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(setChar.contains(c)){
                count +=2; //as the element is already there we are making a pair of the element by increasing count by2
                //and we remove that element from the set as its occurence as already been counted 
                setChar.remove(c); 
            }else{
                setChar.add(c);
            }
        }
        if(!setChar.isEmpty()) count++; 
        
        return count;
    }
}