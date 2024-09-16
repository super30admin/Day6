// Time Complexity: O(n)
// Space Complexity: O(n)
// Program ran successfully on leetcode

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int length = 0; 
        HashSet<Character> charSet = new HashSet();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (charSet.contains(c)){
                length += 2;
                charSet.remove(c);
            }else{
                charSet.add(c);
            }
        }
        if(!charSet.isEmpty()){
            length += 1;
        }
        
        return length;
    }
}