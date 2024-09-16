class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int currSum = 0;
        map.put(0, -1);
        for(int i=0; i<nums.length; i++){
            currSum += (nums[i] == 0) ? 1 : -1;
            if(map.containsKey(currSum)){
                maxLen = Math.max(maxLen, i - map.get(currSum));
            }else{
                map.put(currSum, i);
            }
        }
        return maxLen;
    }
}
//time - O(N)
//space - O(N)