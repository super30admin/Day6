//Time: O(n), Space: O(1)
class Solution {
    public int longestPalindrome(String s) {

        // Follow up Q: return string: Using String builder : As strings are immutable.

        if (s == null)
            return 0; // Return 0 if string is empty
        HashSet<Character> set = new HashSet<>(); // Create a hashSet to keep a count of characters
        int count = 0;
        for (int i = 0; i < s.length(); i++) {// Loop for all characters in String
            char c = s.charAt(i);
            if (!set.contains(c)) {// O(1) //Check if Set contains that character
                set.add(c); // If not add to the hashset
            } else {
                count += 2; // If yes, increment count by 2 and remove the characted from hashset.
                set.remove(c);// O(1)
            }
        }
        if (!set.isEmpty()) // for remaining characters increment count as either of them can be used at the
                            // center of hashset.
            count++;
        return count;
    }
}