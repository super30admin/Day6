//Time complexity : O(n)
//Space Complexity : O(1)
// Did the code run in leetcode : yes
class SubArrayElementK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum = 0;
        int cnt = 0;
        map.put(0 ,1);
        for(int i =0; i<nums.length; i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum-k)){
                cnt = cnt + map.get(rsum-k);
            }
            map.put(rsum , map.getOrDefault(rsum ,0) + 1);
        }
        return cnt;
    }
}