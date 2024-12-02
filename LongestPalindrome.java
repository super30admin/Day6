// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        boolean flag = false;
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            //System.out.println(entry.getValue());
            if(entry.getValue()%2==1){
                flag = true;
                count+=entry.getValue()-1;
            }
            else{
                count+=entry.getValue();
            }
        }
        if(flag) return count+1;
        else return count;
    }

    public static void main(String [] args){
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("abccccdd"));
        System.out.println(lp.longestPalindrome("a"));
        System.out.println(lp.longestPalindrome("bb"));
    }
}