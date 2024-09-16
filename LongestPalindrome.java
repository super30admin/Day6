// Time Complexity :O(n)
// Space Complexity :O(1)
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] totalAlphabetCounts = new int[60];
        for (int i = 0; i < s.length(); i++) {
            totalAlphabetCounts[s.charAt(i) - 65] += 1;
        }
        int totalSum = 0;
        boolean oddPresenceInCounts = false;
        for (int alphabet : totalAlphabetCounts) {
            if (alphabet % 2 == 0) 
                totalSum += alphabet;
             else {
                oddPresenceInCounts = true;
                totalSum += alphabet - 1;
            }
        }
        return totalSum + (oddPresenceInCounts ? 1 : 0);
        
    }
}
