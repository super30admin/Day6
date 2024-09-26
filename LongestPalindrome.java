// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public int longestPalindrome(String s) {
        int result=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //check if set contains that character, if yes then increment result by 2 and remove character from set
            if(set.contains(c)){
                result=result+2;
                set.remove(c);
            }else{
                //otherwise add character to set
                set.add(c);
            }
        }
        //if set is not empty , increment result
        if(!set.isEmpty()) result++;
        return result;
    }
}