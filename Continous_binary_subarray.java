import java.util.*;;

class Solution {
    // Running sum problem
    // Time complexity is O(n)
    // Space complexity is O(n)
    public int findMaxLength(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0)
            return -1;
        int max = 0;
        int rSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i<nums.length;i++){
            if(nums[i] == 0){
                rSum+=-1;
            } else {
                rSum+=1;
            }
            if(map.containsKey(rSum)) {
                int temp = i - map.get(rSum);
                max = Math.max(max, temp);
            } else {
                map.put(rSum,i);
            }
        }
        return max;
    }
}