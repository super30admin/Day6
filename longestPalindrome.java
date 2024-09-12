/*
Run time complexity - O(N) as we traverse the entire string once to determine the length
Space compleity - O(1) as we will not exceed the size of 26 at a given time so constact space
*/
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0)
            return 0;
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            Character c= s.charAt(i);
            if(set.contains(c))
            {
                count=count+2;
                set.remove(c);
            }
            else
            {
                set.add(c);
            }
        }
        return set.size()>0?count+1:count;       
    }
}
