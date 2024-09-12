//Time complexity O(N) Space COmplexity: O(N)
// Ran on leetcode and was accepted
class Solution {
	public int subarraySum(int[] nums, int k) {
        
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{put(0, 1);}};;
		//System.out.println(Arrays.asList(map));
        int sum = 0;
        int res = 0;
        //Iterate over the array
		for (int i = 0; i < nums.length; i++) {
            //Add the value to sum
			sum += nums[i];
            
            //Check and get the value of the key equal to index sum-k
			if (map.containsKey(sum - k)) {
                //calculate the result
				res += map.get(sum - k);
			}
           
            //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
        //return result
		return res;
	}
}