// Time Complexity :O(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
/*
1.Hashset creation
2.Traverse through characters to check if char is present or not.
3.Add if not, else increment count by 2 , remove ch
4.If character set is not empty-count ++ for odd occurance of 1 char.
else if empty, then will be even no., no need to do anything.
 */
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashSet<Character> set= new HashSet<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(set.contains(ch))
            {
                count = count+2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
// Your code here along with comments explaining your approach
