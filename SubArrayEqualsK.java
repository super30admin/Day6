/*
Time Complexity : O(n)
Space Complexity : O(n) case = [1,2,3]
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length = 0){
            return 0;
        }
        int running_sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            running_sum+=nums[i];
            if(map.containsKey(running_sum-k)){
                count+=map.get(running_sum-k);
            }
            map.put(running_sum,map.getOrDefault(running_sum,0)+1);
        }
        return count;
    }
}