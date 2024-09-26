class Solution {
    //following a runnins sum technique where count keep track of equal no. of 1 and 0 
    // we store every unique count in hashmap, when same is encounted we subtract from already encountered save that in max and compare
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int count = 0,max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count--;
            }
            else {
                count++;
            }
            if(map.containsKey(count)) {
                max = Math.max(max, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        return max;
    }
}