//Time Complexity o(n)
//Space complexity o(1)

import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length() == 0) return 0;
        int result = 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
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