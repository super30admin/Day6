
//Time Complexity: O(n)
//Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i]; // calculate running sum
            if(map.containsKey(sum - k)){ // check if running - target is present in map
                count = count + map.get(sum - k); // if yes get the count of this value and add it count
            }
            map.put(sum,map.getOrDefault(sum,0) +1); // else insert this sum in the map
        }
        return count;
    }
}
