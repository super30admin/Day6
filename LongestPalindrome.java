import java.util.*;

//Time Complexity : O(1)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        int length=0,flag=0,val=0;
        HashMap<Character,Integer> map=new HashMap();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char key:map.keySet()){
            if(map.get(key)%2==0)   length+=map.get(key);
            else{
                if(flag==1){
                    length=length+map.get(key)-1;
                }
                if(flag==0){
                    length=length+map.get(key);
                    flag=1;
                }
            }
        }
        return length;
    }
}
