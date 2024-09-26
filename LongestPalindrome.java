// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int longestPalindrome(String s) {
      //check if input string is null or empty, if yes - 
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
      //iterate till end of input string
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
          // if character matches inside the Hashset(pair formation), remove the paired value from hashset and increase count by 2 for each pair formation.
            if(set.contains(c)){
                count += 2; set.remove(c);
            }
          // else add the char in the hashset.
            else{
                set.add(c);
            }
        }
       // if hashset is not empty, increase it by one and return because of pairs the palindrome formed is of even length. And we can insert any 1 character in the middle of palindrome.
        if(!set.isEmpty()) count++;
        return count;
    }
}

// Your code here along with comments explaining your approach
