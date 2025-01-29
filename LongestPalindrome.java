class LongestPalindrome {
    public int longestPalindrome(String s) {
        int res=0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
                res+=2;
                hs.remove(c);
            }
            else{
                hs.add(c);
            }
        }
        if(!hs.isEmpty())
        res+=1;
        return res;
    }
}

//Time Complexity: O(n), Where n is the length of the input string s.
//Space Complexity: O(n), Where n is the number of unique characters in the input string s.

