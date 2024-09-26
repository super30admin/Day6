// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        
        int currentSum=0;
        
        for(int i=0; i<nums.length; i++){
            currentSum+=nums[i];
            int compliment= currentSum-k;
            if(map.containsKey(compliment)){
                count+=map.get(compliment);
            }
                map.put(currentSum,map.getOrDefault(currentSum,0)+1);
            
        }
        
        return count;
        
    }
}