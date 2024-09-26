// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for(int i=0; i < s.length(); ++i){
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        int len =0;
        boolean consideredOdd = false;

        for(int freq : freqMap.values()){

            if(freq%2 == 0){
                len +=freq;
            }
            else{
                if(!consideredOdd){
                    len += freq;
                    consideredOdd = true;
                }
                else{
                    len += (freq - 1);
                }
            }
        }
        return len;
    }
}