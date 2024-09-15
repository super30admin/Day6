/*
*Time complexity: O(n)
*Space Complexity: O(n)
*Accepted on leetcode
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        //base case
		if(nums == null || nums.length = 0)
			return 0;
		Map<Integer, Integer> map = new HashMap<>();
		int runningSum =0, count =0;
		map.put(0,1);
		for(int num : nums){
			runningSum+=num;
			int compliment = runningSum - k;
			if(map.containsKey(compliment)){
				count += map.get(compliment);
			}
			if(map.containsKey(runningSum)){
				map.put(runningSum, map.get(runningSum) + 1);
			}
			else{
				map.put(runningSum , 1);
			}
		}
		return count;
    
    }
}