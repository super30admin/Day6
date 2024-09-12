//time complexity O(n)
//space complexity O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int rSum = 0; int comp = 0; int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            comp = rSum - k;
            if(map.containsKey(comp)){
                count += map.get(comp);
            }
            if(map.containsKey(rSum)){
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
        }
        return count;
    }
}
