//Time Complexity: 0(N)
//Space Complexity: 0(N)

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rSum = 0; int count = 0;
        
        for(int i=0;i<nums.length;i++) {
            rSum += nums[i];
            
            if(map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            } 
            if(!map.containsKey(rSum))
                map.put(rSum, 1);
            else
                map.put(rSum, map.get(rSum)+1);
        }
        return count;
    }
}