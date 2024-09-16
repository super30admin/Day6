class Solution {
    public int subarraySum(int[] nums, int k) {
        // to track total subarray count
        int count = 0;
        // to check summ of all elments till taht particular index
        int curr_sum = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length ; i++){
            curr_sum += nums[i];
            if(curr_sum == k ) count++ ;
            if(map.containsKey(curr_sum - k)){
                count += map.get(curr_sum - k);
            }
            if(!map.containsKey(curr_sum)){
                map.put(curr_sum, 0);
            }
            map.put(curr_sum,map.get(curr_sum ) + 1);
        }
        return count;
        
    }
}