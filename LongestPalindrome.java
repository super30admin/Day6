// Time Complexity : O(n) going over the string where n is number of characters
// Space Complexity : O(1) as max number of character can be 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Store the characters and their counts in a hashmap. Parse over the hashmap and get
the even number of characters from the hashmap since even occurances of character make a pair and always is a palindrome. Similarly, even if
there are odd occurances of the characters, take the even occurances of the character and add to the count.
*/
class Solution {
    public int longestPalindrome(String s) {
        int count = 0,flag_odd =0;
        HashMap<Character, Integer> store = new HashMap<Character, Integer>();
        for(int i =0; i < s.length();i++){
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i),0) + 1);          // Store characters with their count
        }
        
        for(Character key : store.keySet()){
            if(store.get(key) % 2 == 0){
                count+=store.get(key);                  // Even occurances of the character, simply add
            } else {
                count+=(store.get(key)-1);              // odd occurances of the character, get the even occurances number by -1.
                flag_odd = 1;                           // indicates that the hashmap has a single occurance of a character which can be used later
            }
        }
        if(flag_odd == 0){
        return count;
        } else {
            return count+1;                     // If flag is 1, indicates even if you add this character in the count doesnt affect the palindrome.
        }
    }
}