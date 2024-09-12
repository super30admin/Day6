//Time Complexity: O(n)
//Space Complexity: O(1)
//409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxValue = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!set.contains(ch))
                set.add(ch);
            else{
                maxValue += 2;
                set.remove(ch);
            }
        }

        if(!set.isEmpty())
            maxValue+=1;
        return maxValue;
    }
}