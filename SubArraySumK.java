/**
 Time Complexity - O(n) - n elements
 Space Complexity- O(n) - n elements
 LeetCode - Yes
*/

class SubArraySumK {
    public int subarraySum(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();

         int ans=0,sum=0;
         map.put(0,1);
        for(int num : nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                ans += (map.get(sum-k));
             }
             map.put(sum,map.getOrDefault(sum,0)+1);
         }
         return ans;

}