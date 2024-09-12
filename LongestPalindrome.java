import java.util.*;

// Time Complexity : O(N) - traversing the array once
// Space Complexity : O(N) - use of a HashMap

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        boolean odd = false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        
        for(Character ch : map.keySet()){
            if(map.get(ch) % 2 == 0){
                result+=map.get(ch);
            }
            else{
                result+= map.get(ch) - 1;
                odd = true;
            }
        }
        if(odd) result++;
        return result;
    }
}