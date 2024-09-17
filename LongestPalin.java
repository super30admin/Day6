// Time Complexity : O(n) walk the array once to get all chars and counts.
// Space Complexity : O(n) n = all unique chars in string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //comming up with logic to calculate chars used based on char count.
// Your code here along with comments explaining your approach
  //hashmap of chars and count of each char .
  //if count is even we ll end up using all such chars with even count.
  //so len += even count char.
  //for odd we only need to use even number counts.
  //so oddcount = 3 -> 3/2 = 1 -> 1*2 = 2. or oddcount = 1 -> 1/2 = 0 -> 0*2 = 0.
  //at the end if len is still less than string size, we know atleast one
  //char can be added in the middle of the current chars to get a palindrome.
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }
        int len = 0;
        for(int count: charMap.values()){
                len+= (count/2)*2;
        }

        if(len < s.length()){
            len++;
        }

        return len;
    }
}
