class Solution {
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0, count = 0;
        // this is important, same as the function in Leetcode 560
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count = count - 1;
            }else{
                count = count + 1;
            }
            if(map.containsKey(count)){
                maxLen = Math.max(maxLen, i - map.get(count));
            }else{
                map.put(count, i);
            }
        }
        return maxLen;
    }
}