//Time complexity: O(N)
//Space complexity:O(N) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Subarray {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int count = 0;
        map.put(0, 1);
        int sum = 0;
                
        for(int i : nums) {
            sum += i;            
            if( map.containsKey(sum-k) )
                count += map.get(sum-k);            
            map.put(sum, map.getOrDefault(sum, 0) + 1);            
        }
        
        return count;        
    }
}

