//Time complexity: O(N)
//Space complexity: O(N)
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        //Set to store the visited characters
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //if the set contains the current character, means there is a pair of 
            //the current character so we will increment count by 2 and remove the character
            //from set as there can be another pair of the same character
            if(set.contains(c)) {
                count = count + 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            count = count + 1;
        }
        return count;
    }
}