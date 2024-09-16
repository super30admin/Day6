// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : underatanding the concept

class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum = 0; 
        int res = 0;    
        HashMap<Integer, Integer> map = new HashMap<>(); //store running sum, frequency
        map.put(0,1);   //initializing map so that we don't miss the pair occuring at 0th index
        
        for (int i = 0; i < nums.length; i++) {
            rsum += nums[i];    // running sum
            
            if (map.containsKey(rsum-k)) {  // if map contains the complement of target k
                res+= map.get(rsum-k);  // pair(s) found. update result
            }
            if(!map.containsKey(rsum)){ //if new rsum occurs
                map.put(rsum,0);    //create entry for new rsum
            }    
            
            map.put(rsum,map.get(rsum)+1);  // update rsum & its frquency            
        }
        
        return res;
    }
}
