// Contiguous Array

// Time-Complexity- O(n) 
// Space Complexity-O(n) - creating a hashmap to keep track of the count with the indexes
// passed test cases on leetcode-yes
// faced problem-no

class Solution {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]==1) count++;
            else count--;
            
            //if map already has a key with current sum the get the maxlength
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                //adding the current index if current sum does not exist in the hashmap
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
