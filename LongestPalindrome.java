// Time Complexity : The time complexity is O(n) where n is the length of the string since we are iterating thouth the length of the string
// Space Complexity : The space complexity is O(1) since in the map we are storing distinct characters and the max number of distinct characters is 100
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int output = 0;

        // Iterate through the stirng and store the character and its frequency in a map.
        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }

        // Iterate through the map keys
        for(char ch:map.keySet()){

            // If the frequency is even, it will form a palindrome
            if(map.get(ch) % 2 == 0){
                output += map.get(ch);
            }
            // If the frequency is odd
            else{
                // Add if it is the first odd character
                if(output % 2 == 0){
                    output += map.get(ch);
                }
                // If we already added the odd character,add the new odd frequency and remove 1
                // which would make to previously added odd character even
                else{
                    output = output-1+map.get(ch);
                }
            }

        }

        return output;

    }
}