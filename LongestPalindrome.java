// Time Complexity :o(n)
// Space Complexity :o(1) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        //null  
        int result=0;
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(set.contains(ch)){
                result +=2;
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            result++;
        }
        return result;
    }
}