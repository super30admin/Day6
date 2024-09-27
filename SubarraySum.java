//Time Complexity: O(N)
//Space Complexity:O(N)
class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum = rSum + nums[i];
            int temp = rSum - k;
            if(map.containsKey(temp)){
                count +=  map.get(temp);
            }
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}