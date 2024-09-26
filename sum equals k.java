class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        
        if(nums == null || len == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int rsum = 0;
        int count = 0;
        
        map.put(0 , 1);
        
        for (int i = 0; i < len; i++){
            rsum += nums[i];
            if(map.containsKey(rsum - k)){
                count += map.get(rsum - k);
            }
            
            map.put(rsum, map.getOrDefault(rsum , 0) + 1);
        }    
            return count;

    }
}


// Time: O(n)
// Space: O(n)
// Difficulty: Minor syntax error, wrong of input to hashmap first element.