// Time Complexity :O(N^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Providing the wrong output(maybe becuase for the letters in the end of string it is running only till the length of the string)


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        int max=0;
        String pal;
        //Iterating through the entire string to find all the possible substrings that could be a plaindrome
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String temp = s.substring(i,j);
                if(isPalindrome(temp) && temp.length() > max){
                    max=temp.length();
                    pal=temp;
                }
            }
        }
        return max;
    }
    
    //Palindrome function to check if the given string is a palindrome
    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
     }
  }

  return true;
}
}