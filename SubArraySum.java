// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :



public class SubArraySum {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,1);
            int rsum=0;
            int max=0;
            for(int i=0; i<nums.length; i++){
                rsum = rsum+ nums[i];
                if(map.containsKey(rsum-k)) max+=map.get(rsum-k);
                if(!map.containsKey(rsum)) map.put(rsum,0);
                map.put(rsum,map.get(rsum)+1);
            }
            return max;
            
        }
    }
    
