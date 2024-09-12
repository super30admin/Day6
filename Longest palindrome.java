// Time complexity - 0(n)
// space complexity - 0(1)
// Code successfully executed in leetcode
class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> map = new HashSet<>();
        int count=0;
        for(int i=0;i < s.length();i++){
           char c = s.charAt(i);
            if(map.contains(c)){
                map.remove(c);
                count+=2;
            } else {
               map.add(c); 
            }
         }
        if(!map.isEmpty()) count++;
            return count;

    }  
    }



