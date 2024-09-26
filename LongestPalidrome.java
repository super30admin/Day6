/*
Time complexity: O(n) where n is length of string
Space comp: O(n) as set will store n length of string in worst case
Approach: here we check if element is already present imn set then we can have palindrome string so remove it and add 2 to count
at end if thre is no pair of same character we can take a single char from set and put it in middle to have palindrome of odd length
*/
class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Set<Character> charSet = new HashSet<>();

        int count = 0;

        for(char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                count += 2;
                charSet.remove(c);
            } else {
                charSet.add(c);
            }
        }

        if (!charSet.isEmpty()){
            count += 1;
        }

        return count;
    }
}