// Time Complexity : O(N) 
// Space Complexity : Amortized O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int count=0;
        for(int i: map.values()){
            if(i%2==0)
                count+= i;
            else
                count+= i-1;
        }
        
            return Math.min(count+1,s.length());
    }
}