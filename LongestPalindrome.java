/*
-Time Complexity : O(n) 
-Space Complexity : O(n)
-code here along with comments explaining approach

1. for every character I will add the character in the set if not present in the set. 
if character is present in the set i remove that char from the set so this tells that this was one pair and can contribute to making string palindrome.
2. and if char if not present i add that char in the set
3. at the end length of string - set size would be the longest palindrom we can make from given characters.
*/
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        if(set.size() == 0)
            return s.length();
        return s.length()-set.size()+1;
    }
}
