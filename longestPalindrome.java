//TC: O(N) SC: O(1)
class Solution {
    public int longestPalindrome(String s) {

        int l = s.length();
        HashSet<Character> hs= new HashSet<>();
        int result =0;
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
                result+=2;
                hs.remove(c);
            }
            else
                hs.add(c);
        }


        if(!hs.isEmpty())
            result+=1;

        return result;
    }
}