/*
Time Complexity-->
O(n)
Space Complexity-->
O(n)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int r_sum = 0;
        int count = 0;
        int v = 0;
        int diff = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            r_sum+=nums[i];   // y = z-x
            
            diff = r_sum-k;
            //System.out.println(diff);
            if (map.containsKey(diff)){
                v = map.get(diff);
                count+=v;
                
                
                
            }//if
            map.put(r_sum, map.getOrDefault(r_sum,0)+1);
        }
        
        return count;
        
    }
}