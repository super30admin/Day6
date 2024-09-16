//Time Complexity: 0(N)
//Space Complexity: 0(N)
//Runtime: 17 ms, faster than 92.81% of Java online submissions for Contiguous Array.
//Memory Usage: 48.9 MB, less than 28.83% of Java online submissions for Contiguous Array.

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int prefixSum= 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
          
            prefixSum += ((nums[i] * 2) -1);
            
            if(map.containsKey(prefixSum)){
                int index= (map.get(prefixSum));
                max = Math.max(max, i - index);
            }else{
                map.put(prefixSum, i);
            }
            
        }
        return max;
        
    }
}
