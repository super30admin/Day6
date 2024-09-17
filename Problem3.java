//Leetcode Problem no: 409: Longest Palindrome
// https://leetcode.com/problems/longest-palindrome/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


class Problem3 {
    public int longestPalindrome(String s) {
        if(s==null || s.length() ==0){
            return 0;
        }
        //hashset to store character by character
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            //the the character is already stored in the set, its a pair and can be used to build the palindrome, 
            //so we remove from set so that set has only characters which does not have a pair.
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
            }else{
                hs.add(s.charAt(i));
            }
        
        }
            //If the set has only one element or no element at the end, it means we can build a palindrome with all the characters of 
            //string, so we return the length of the string.
            if(hs.size()<=1){
                return s.length();
            }

        //The set contains the characters with characters with which palindrome cannot be built. So we retun the difference in the 
        //length of the string and the size of the array 
        
        return s.length() - hs.size() +1;
    }
}