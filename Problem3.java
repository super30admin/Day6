// Time Complexity : O(1) since maximum number of alphabets are 26+26(lowercase and uppercase)
// Space Complexity : O(1) since Hashset can have at max 26+26 characters in it
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>(); //prepare a HashSet to add characters in it. 
        int count = 0;
        for(int i=0; i<s.length();i++) 
        {
            char c = s.charAt(i);
            if (set.contains(c)) // if set alreay has same character then these two characters can be used to form a palindrome
            {
                count +=2; // increase count by two bcs we found the matching character to be used for forming a palindrome
                set.remove(c); // remove character from HashSet since we have already increased count for these two
            }
            else
            {
                set.add(c); // if character is not present in HasSet we add it ot our set
            }
        }
        if (!set.isEmpty()) count++; // towards the end if there are any characters present in our HashSet, that means we can use either of the character to form a hashSet 
        return count; 
    }
}
