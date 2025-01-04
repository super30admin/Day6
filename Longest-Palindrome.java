// ## Problem3 (https://leetcode.com/problems/longest-palindrome)
// Given a string s which consists of lowercase or uppercase letters, return the length of the longest
// palindrome
//  that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Description: A palindrome can be both of even and odd length. So to build from given input the approach we will follow is we will insert every character when it occurs in an hashset.
// The Next time when it occurs what we will do is we will check if key is their if so we will remove that and add in a count as 2. Because 2 same characters can be their in a palindrome
// At the end if any character is their in Hashset then we will add 1 to the count as for odd length palindrome we can place it in middle.

// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        //Base Condition check
        if(s==null || s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        HashSet<Character> set = new HashSet<>();
        int cnt=0;
        //Converting an string to char array
        char[] arr=s.toCharArray();
         for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                cnt=cnt+2;
                set.remove(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
         } 
         if(!set.isEmpty()){
            cnt++;
         }  
         //At the end we will retiurn the count
         return cnt;
    }
}