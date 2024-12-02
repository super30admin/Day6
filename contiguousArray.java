import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sMap = new HashMap<>();
        int count = 0;
        int max = 0;
        sMap.put(0,-1); //0 gives -1 and 1 gives +1
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count = count - 1;
            }
            else{
                count = count + 1;
            }
            if(sMap.containsKey(count)){
                max = Math.max(max, i - sMap.get(count));
            }
            else{
                sMap.put(count, i);
            }
        }
        return max;
    }
}