class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            // Check if unbalanced character is present
            if(set.contains(c))
            {
                set.remove(c); // found 2 occurrences of the character, so remove and add in count
                count +=2;
            }
            else
                set.add(c); // first occurrence of the character
        }
        // Can add one unbalanced character in the middle, so check if there's a character present
        count = set.isEmpty() ? count : count+1;
        return count;
    }
}

// Time Complexity- O(1)
// Space Complexity- O(N)
/* Logic-
- Store a new character in a hashset for the first time
- If the same character occurs again, increase the count by 2 and remove the character from hashset
- At the end of iteration, the hashset should be either empty or contain unbalanced characters
- If the hashset is not empty, then add one unbalanced character to the count
- return count
*/
