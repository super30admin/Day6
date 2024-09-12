class Solution {

    /**
     Time- o(n) Space -o(n)
     Keep running sum, calculate the compliment at each step- check if present in map is yes get that value and increase count.
     if not add running sum to map and continue untill last element and return count.
     Note: add running sum in map but check compliment as contains key in map.
     if map has compliment then increase rSum count but get compliment add add value to result.
     */
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            //compliment is present or not
            if (map.containsKey(rSum - k)) {
                result = result + map.get(rSum - k);
            }
            if (!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }

        return result;
    }
}
