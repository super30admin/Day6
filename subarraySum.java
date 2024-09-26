// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

// Used a hashset for this
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int rsum = 0;
        int count =0;
        int val = 0;
        mp.put(0,1);
        for(int i=0;i<nums.length; i++ ){
            rsum = rsum + nums[i];
            if(mp.containsKey(rsum - k)){
                count = count +  mp.get(rsum - k);
            }
            mp.put(rsum, mp.getOrDefault(rsum, 0) + 1);
            
            
        }
        return count;
        
    }
}