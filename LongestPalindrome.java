/**
Time complexity: O(n)
Space complexity: O(n)
Executed on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - Create a hashset for characters.
    - Check if a character in string s is present in the hashset.
      If not, add it to the hashset.
      If present, increment the variable longest by 2 and remove the character from the hashset.
    - If any character present in the hashset after coming out of for loop, just add 1 to the variable longest.
    */

    public int longestPalindrome(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int longest = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(hashSet.contains(c)) {
                longest += 2;
                hashSet.remove(c);
            } else {
                hashSet.add(c);
            }
        }
        if(!hashSet.isEmpty()) {
            longest += 1;
        }
        return longest;
    }
}
