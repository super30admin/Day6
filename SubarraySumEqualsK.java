//Time Complexity: O(N);
//Space Complexity: O(N);
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0; int sum = 0;

        for(int i = 0 ;i<nums.length;i++){
            sum = sum + nums[i];
            if(map.containsKey(sum - k)){
                count=count + map.get(sum - k);
            }
            int freq= map.getOrDefault(sum,0);
            map.put(sum,freq+1);
        }
        return count;
    }
}