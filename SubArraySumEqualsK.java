//time - O(n)
//space - O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        int rsum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            rsum += nums[i];
            int comp = rsum - k;
            if(map.containsKey(comp)){
                result+=map.get(comp);
            }
            map.put(rsum, map.getOrDefault(rsum, 0)+1);
        }

        return result;
    }
}