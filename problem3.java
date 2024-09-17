
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Character c : hm.keySet()){
            int characterCount = hm.get(c);
            if(characterCount % 2==0){
                count = count + characterCount;
                hm.put(c,0);
            }
            else{
                count = count + characterCount-1;
                hm.put(c,1);
            }
        }
         for(Character c : hm.keySet()){
             if(hm.get(c)==1)
                 return count+1;
         }
        return count;
    }
}
