// Time Complexity : O(n * sizeofmap)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : This solution doesn't feel right even though it works


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] arr = s.toCharArray();
        
        for(Character ch : arr){
          map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        int countEvens = 0;
        int countOdds = 0;
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int sum = entry.getValue();
            if(sum%2==0){
                countEvens+=sum;
            }
            else{
                countOdds+=sum-1;
            }
        }
        
    return countEvens == arr.length?countEvens:countOdds+countEvens+1;        
    }
}