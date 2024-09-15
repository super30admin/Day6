/*
*Time complexity: O(n)
*Space Complexity: O(n)
*Accepted on leetcode
*Description of the approach: For every new character encountered in the string, we add to the hashset and continue scanning. if a previiously encountered
* character is seen again, the we add 2 to the result and remove this char from the set. At the end, if the set is not empty, we can add 1 more charater
* to the palindrome at the center, so we add 1 to the result and return.
*/
class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                length += 2;
                set.remove(c);
            }
            else
                set.add(c);
            
        }
        
        if(!set.isEmpty()){
            return length+1;
        }
        else
            return length;
    }
}