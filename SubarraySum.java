/* Time Complexity: O(n)
 * Space Complexity:O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0;
        int result = 0;
        for(int i =0; i < nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum - k)){
                result += map.get(rSum - k);
            }
            
            if(map.containsKey(rSum)){//O(1)
                map.put(rSum, map.get(rSum) + 1); //O(1)
            } else {
                map.put(rSum, 1);
            }
        }
        return result;
    }
}
