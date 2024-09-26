import java.util.HashMap;

class Solution {

    /*
     * Time - O(n)
     * Space - O(n)
     */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, rsum = 0;
        for (int i=0; i<nums.length; i++) {
            rsum += nums[i];
            if (map.containsKey(rsum - k))
                count += map.get(rsum - k);
            map.put(rsum, map.getOrDefault(rsum, 0) + 1);
        }
        return count;
    }
}