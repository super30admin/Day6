// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rSum =0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum=rSum+nums[i];
            int diff = rSum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            if(map.containsKey(rSum)){
                int newCount=map.get(rSum);
                newCount++;
                map.put(rSum,newCount);
            }else{
                map.put(rSum,1);
            }
            
        }
        return count++;
    }
}