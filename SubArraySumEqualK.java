// Time Complexity : O(n^2) without hashing and O(n) with hashing.
// Space Complexity : O(n) - with hashing.
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class SubArraySumEqualK {
	public int subarraySum1(int[] nums, int k) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    result++;
                }
            }
        }
    return result;
    }
    public int subarraySum(int[] nums, int k) {
        int result = 0, sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                result += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    return result;
    }
}