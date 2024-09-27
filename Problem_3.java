//Time complexity-O(n)
//Space complexxity-O(n)
//Tried using array for maintaining O(1), but this solution in class is more cleaner
class Solution {
    public int longestPalindrome(String str) {
        
        int count=0;
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(s.contains(ch))
            {
                count+=2;
                s.remove(ch);
            }
            else
            {
                s.add(ch);
            }
        }
        return s.isEmpty()? count: count+1;
        
    }
}
