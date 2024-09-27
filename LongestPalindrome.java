class LongestPalindrome {
    
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    
    public int longestPalindrome(String s) {
        int result = 0;
        if(s == null || s.length() == 0)
            return result;
        
        Map<Character, Integer> map = new HashMap<>();
        boolean odd = false;
        
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        
        for(char c: map.keySet()){
            if(map.get(c) % 2 == 0)
                result += map.get(c);
            else{
                odd = true;
                result += map.get(c)-1;
            }
        }

        return odd ? result+1 : result;
    }
}