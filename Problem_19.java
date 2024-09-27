// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Done on fact that in order to be a palindrome a String should have each character even number of times except one character which can be used once.
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }
        System.out.print(map);
        int count=0;
        for(char c :map.keySet()){
            int i=map.get(c);
            if(i%2==0){
                count+=i;
            }else if(i>1 && (i-1)%2==0){
                count+=i-1;
            }
        }
        if(s.length()>count)
        return count+1;
        return count;
    }
}