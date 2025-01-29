/*Time Complexity: O(n) one pass through the string.
 * Space complexity: O(1) constant space complexity because there are only 26 alphabets which is constant.
 * leetcode : yes
 * Any Problems : nope
*/
import java.util.HashSet;
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hset = new HashSet<>(); // internal data structure is boolean[].
        int result = 0;
        for(int i=0; i<s.length(); i++)
        {
            //if the character appears before then remove it and add two to the result as we found a pair
            if(hset.contains(s.charAt(i)))
            {
                hset.remove(s.charAt(i));
                result += 2;
            }
            //else just add it to the hashset
            else
                hset.add(s.charAt(i));

        }
        //finally we just check if the hashset is empty or not, if empty then just return the resulr, 
        //if not that mean we can still add one more letter to our palindrome in the middle.
        if(!hset.isEmpty())
            result++;
        return result;
    }
}