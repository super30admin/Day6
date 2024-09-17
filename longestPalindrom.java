//Time Complexity: 0(N)
//Space Complexity: 0(N)

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        HashSet<Character> palindromeMap = new HashSet<>();
        
        for(int i=0;i<s.length();i++) {
            if(palindromeMap.contains(s.charAt(i))) {
                count += 2;
                palindromeMap.remove(s.charAt(i));
            } else 
                palindromeMap.add(s.charAt(i));
        }
        if(!palindromeMap.isEmpty()) 
            count += 1;
        
        return count;
    }
}