class Solution {
    public int longestPalindrome(String s) {
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(1) 
        if(s==null)
        {
            return 0;
        }

        HashSet<Character> map = new HashSet<>();
        int count = 0;

        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);
            if(map.contains(c))
            {
                count+=2;
                map.remove(c);
            }
            else {
                map.add(c);
            }
        }
        if(map.isEmpty())
        {
            return count;
        }
        else {
            return count+1;
        }
    }
}
