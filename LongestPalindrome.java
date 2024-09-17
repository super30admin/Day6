/**
* Time Complexity O(n) and Space complexity O(n)
* Use a hashset which will store unique elements. If the element already exists increment count by 2 and pop the element
* At the end of iteration if the set still contains element, increment count by 1 (accomodate negative element)
*/
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> pal = new HashSet<Character>();
        int longest = 0;
        char[] strArr = s.toCharArray();
        for (int i = 0; i< strArr.length ;i++) {
            if (pal.contains(strArr[i])) {
                longest += 2;
                pal.remove(strArr[i]);
            }
            else
            {
                pal.add(strArr[i]);
            }
        }
        if (!pal.isEmpty()) {
            longest += 1;
        }
        return longest;
    }
}
