public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
                len = len + 2;
                hs.remove(c);
            }
            else
            {
                hs.add(c);
            }

        }
        if(!hs.isEmpty()) return len+1;
        return len;
    }
}
