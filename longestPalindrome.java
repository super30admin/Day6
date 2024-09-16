// Time Complexity : O(n)
// Space Complexity :O(1) since we are storing 26 alphabets at a constant space.
// Did this code successfully run on Leetcode : yes
/*Approach - If a particular character is already present in the hashmap, remove and add 2 to the count
 as it contributes to the length of the longest palindrome string else put the character with a count
 value as 1. If the hashmap is not empty, add 1 to the length of palindrome string as it means
  we could add anyone of the characters present in the hashmap into the palindrome string.
  That is we can accommodate only single character in the middle of the palindrome string that
  contains even no. count of every character ex: abcdcba here d is that single character  */
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;
        char[] ch=s.toCharArray();
        for(char c:ch){
        if(hm.containsKey(c)){
            count=count+2;
            hm.remove(c);
        }
        else
            hm.put(c,1);
        }
        if(!hm.isEmpty())
            count=count+1;
        return count;
    }
}
