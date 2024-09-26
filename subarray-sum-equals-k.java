//time complexcity: O(n)
//space complexcity: O(n)
//Did it run successfully on leetcode: YES

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int rSum = 0;
        int result = 0;
        map.put(rSum, 1);
        for(int i=0; i<nums.length; i++) {
            int temp;
            rSum = rSum + nums[i];
            temp = rSum - k;
            if(map.containsKey(temp)) {
                result = result + map.get(temp);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return result;
    }
}
