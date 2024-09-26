class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet <Character> palindromeMap = new HashSet<>();
        
        int counter = 0;
        char[] charArray = s.toCharArray();
        
        for (char c : charArray) {
            if (!palindromeMap.contains(c)) {
                palindromeMap.add(c);
            }
            else {
                palindromeMap.remove(c);
                counter = counter +2;
            }
        }
        
        if (palindromeMap.size() > 0) {
            counter = counter + 1;
        }
        
        return counter;
    }
}