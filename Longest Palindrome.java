/*
Time Complexity : O(n)
Space Complexity : O(1) as there are only 26+26 characters, even if repeated the set just stores one copy of it
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0 || s==null){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        //iterate through the input string
        for(int i=0;i<s.length();i++){
            //check if the character is in the set
            if(set.contains(s.charAt(i))){
                //if so then remove it and increment the count by 2. this indicates that this character is even in number
                set.remove(s.charAt(i));
                count = count+2;
            }
            //otherwise add it to set
            else{
                set.add(s.charAt(i));
            }
        }
        //at this point set will have the characters with odd number of occurences hence can include of them in the palindrome string.
        if(set.size() > 0){
            count++;
        }
        return count;
    }
}