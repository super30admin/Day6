//time - O(n)
//space - O(1)
class Solution {
    public int longestPalindrome(String s) {
        int[] sTable = new int[128];
        int maxOdd = 0;
        int maxPalindrome = 0;
        for(int i=0; i<s.length(); i++) {
            int val = (int) s.charAt(i);
            sTable[val] = sTable[val] + 1;
        }
        for(int i=0; i<127; i++) {
            if(sTable[i]%2 == 0)
                maxPalindrome += sTable[i];
            else
                maxOdd = Math.max(maxOdd, sTable[i]);
        }
        return maxPalindrome+maxOdd;
        
    }
}