// Time Complexity: Traversing only once through the string characters, and performing constant operations inside - O(n)
// Space Complexity: Auxilliary Set used which may take only upto 52 characters if all are distinct O(52) => O(1)
// Did you complete it at leetcode: Yes
// Any problems faced with this question: Understood in class

// Explain your code here
// Idea here is to identify total number of pair of characters, a palindrom can have at most 1 single character, rest have to be pair.
// To perform that we iterate through the string and keep adding the characters if it is not present in set.
// if a character is present in set, it means it is paired, we increase the count to +2 and remove the existing character from set.
// finally we check if after removal of all the paired characters is set empty? if not we can have 1 single character in palindrome ==> count incremented by 1.
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i< s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                count+=2;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if(set.size()>0) {
            count++;
        }
        return count;
    }
}