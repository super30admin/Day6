class LongestPalindrome {
   public int longestPalindrome(String s) {
        
        if(s == null || s.equals("")) 
            return 0;
        
       Map<Character,Integer> charCount = new HashMap<>();
       for(Character c : s.toCharArray()) {
           if(charCount.containsKey(c)) {
               charCount.put(c, charCount.get(c)+1);
           } else {
               charCount.put(c, 1);
           }
       }
        
        int resultCount = 0;
        for(Integer count : charCount.values()) {
            if(count % 2 == 0)
                resultCount += count;
            else
                resultCount += (count-1);
        }
        
        if(s.length() > resultCount)
            return (resultCount + 1);
        
        return resultCount;
    }
}