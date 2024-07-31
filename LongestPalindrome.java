//TC: O(n)
//SC: O(1)
//Approach: Maintain a set to keep track of uniquie characters which do not have a pair to form palindrome. If a repeated character is encountered, increase string length by 2 and remove from the set. Finally any one unpaired char can be added to the longest palindrome string.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet();
        int length = 0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                length +=2;
                set.remove(s.charAt(i));
            } else{
                set.add(s.charAt(i));
            }
        }

        if(!set.isEmpty()) length++;
        return length;
    }
}