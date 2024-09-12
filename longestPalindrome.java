class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();

        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);

            if(!set.contains(ch))
            {
                set.add(ch);
            }
            else
            {

                count += 2;
                set.remove(ch);
            }
        }
        if(set.isEmpty() == false)
        {
            count++;
        }

        return count;

    }
}