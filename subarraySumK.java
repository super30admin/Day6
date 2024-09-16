//Time complexity is o(n) and space is o(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1 && nums[0] != k)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int counter = 0;
        int excess = 0, ps = 0;
        for (int eachNum : nums) {

            ps += eachNum;
            excess = ps - k;
            counter += map.getOrDefault(excess, 0);
            map.put(ps, map.getOrDefault(ps, 0) + 1);

        }
        return counter;
    }
}