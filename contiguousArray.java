// TC : O(N)
// SC : O(N)

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.length == 1) return 0;
        map.put(0, -1);
        int count=0, result =0;
        
        for(int i=0; i< nums.length; i++){
            
            count = nums[i]== 0 ? count+1 : count-1;
            
            if(map.containsKey(count)){
                result = Math.max( result, i - map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        return result;
    }
}
