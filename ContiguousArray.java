// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1); //base case to initialize map with rsum 0 at index -1
        int rsum = 0;
        int maxlen = 0; int count =0;
        for(int i = 0; i <nums.length;i++){
            if( nums[i] == 1){
                rsum += 1; // add if 1 
            }else{
                rsum -= 1;// sub 1 if 0 from rsum
            }
            if(map.containsKey(rsum)){
                maxlen = Math.max(maxlen, i - map.get(rsum));// get max index len b/w same sum
            }else{
                map.put(rsum, i);
            }
            
        }
        return maxlen;
    }
}