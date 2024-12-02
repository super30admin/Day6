/**
 * The idea here is that, the even occurences of symbols can be used to
 * construct palindrome. For the symbols occuring odd counts, we can consume one
 * less in the palindrome, and among the odd ones left out, we can use a symbol
 * by placing it at the center.
 * 
 * One approach would be to use a hashmap, iterate over the input string and do
 * the above computation. Another approach as discussed would be to use a set,
 * if we encounter a symbol that is in the set, just remove it from set and
 * increase count by 2. At the end, only 1 instance of symbols occuring odd
 * times would be left, we can use one of them in our palindrome.
 * 
 * Space Complexity: O(n) 
 * Time Complexity: O(n)
 * 
 * Leetcode Result: 
 * Runtime: 4 ms, faster than 51.39% of Java online submissions
 * for Longest Palindrome. 
 * Memory Usage: 35.5 MB, less than 100.00% of Java
 * online submissions for Longest Palindrome.
 */
class LongestPalindrome {
    /**
     * Given a string which consists of lowercase or uppercase letters, find the
     * length of the longest palindromes that can be built with those letters.
     * 
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        // consume all letter occuring even number of times for constructing palindrome
        // if there are letters occuring odd number of time, we can use all but one of
        // these as well at end the letters that are left alone, we use one of it
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (set.isEmpty()) {
            return count;
        }
        return ++count;
    }
}