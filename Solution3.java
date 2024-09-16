// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution3 {
    public int longestPalindrome(String s) {
        if(s==null||s.length()==0)
            return -1;
        int count =0;
        //store unique characters
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        // pick up characters existing already to create a palindrome
        if(set.contains(c)){
            count=count+2;
            set.remove(c);
        }
        else
            set.add(c);
        }
        //"abgba"
        if(set.size()!=0)
            count++;
        
        return count;
    }
}