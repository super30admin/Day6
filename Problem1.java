// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem statement: https://leetcode.com/problems/subarray-sum-equals-k/

class Problem1 {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;

        for(int i: nums){
            sum+=i;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }
        }
        return count;
    }
}
