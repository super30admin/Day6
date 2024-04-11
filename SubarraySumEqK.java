import java.util.HashMap;

/**
Approach - Running Sum 
HashMap- key -> sum, value: count of such complements (running sum -k)
If Map conains complement then get count of such subarrays with that target increases.
else store/update the running sum/count
Add first value as sum=0 has happended once-> map.put(0,1);


Time Complexiy - O(n), Space Complexity-O(n)
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length ==0) return 0;
        int sum = 0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)) count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    
        return count;
    }
    
}