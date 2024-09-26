// Time Complexity :O(n) n is size of the array
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

//Created the hashmap to store prefix sum and no of times it occured. so while inserting the element we keep on checking if there is a sum which when subtracted from the sum till then will gives a target. 
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
        h.put(0,1); 
        int sum =0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(h.containsKey(sum-k)){
                count = count + h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
