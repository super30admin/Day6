//Time Complexity: O(n).
//Space Complexity: O(n).
//Does this solution run on Leetcode: Yes
//Any problems faced during solving: No



class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1)
            return 1;
        
        HashSet<Character> palindrome = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(palindrome.contains(s.charAt(i)))
            {
                count = count+2;
                palindrome.remove(s.charAt(i));
            }
            else
                palindrome.add(s.charAt(i));
        }
        
        if(!palindrome.isEmpty())
            count++;
        
        return count;
    }
}