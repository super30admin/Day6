//Time complexity: O(n)
//Space complexity: O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //map to store running sum as key and the index as which the running sum was encountered first as value
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rSum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            //if the element is 0, decrement the running sum by 1.
            if(nums[i] == 0) {
                rSum--;
            }
            //if the element is 0, increment the running sum by 1.
            else {
                rSum++;
            }
            //if the running sum has happened before
            if(map.containsKey(rSum)) {
                //we can take the max between the current max and the current index - previous index of running sum.
                //i.e the subarray between those index is surely balanced.
                max = Math.max(max, i - map.get(rSum));
            }
            else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}