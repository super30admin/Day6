import java.util.HashMap;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain a hashmap of character in a string and its frequency
// Count if there are even number of chars and 1 count of character to form the longest palindrome

public class LongestPalindrome {
        public int longestPalindrome(String s) {
            HashMap<Character,Integer> hmap = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(hmap.containsKey(s.charAt(i))){
                    hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
                }else{
                    hmap.put(s.charAt(i),1);
                }
            }
            int len =0;
            boolean odd=false;
            for(Character ch : hmap.keySet()){
                if(hmap.get(ch) %2 ==0){
                    len =  len + hmap.get(ch);
                }else{
                    len = len + hmap.get(ch)-1;
                    odd =true;
                }
            }
            if(odd){
                len+=1;
            }
            return len;
        }

}
