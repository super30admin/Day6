//Leetcode Problem no: 560: Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : was not intuitive for me. Class helped me understand better


// Your code here along with comments explaining your approach


class Problem1 {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0 || nums == null){
            return 0;
        }
        int sum =0; int count = 0;
        //map to store the sum at each index and its count of occurance.
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            //if the map contains the difference to reach the target value, get the count of the calculated difference. 
            if(map.containsKey(sum-k)){
                count = count + map.get(sum-k);
            }
            //if the sum at that particular index is not stored in the map, store it with count 1. If it is stored, update its count value by 1
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
}