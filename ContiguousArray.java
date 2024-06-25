//Time Complexity : O(N)
//Space Complexity : O(N);
// Did this code successfully run on Leetcode :

// Your code here along with comments explaining your approach
class ContiguousArray {

    public int findMaxLength(int[] nums) {

        int maxLength = 0;
        int preSum = 0;

        if(nums==null && nums.length ==0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                preSum-= 1;

            else
                preSum+= 1;

            if(map.containsKey(preSum)){
                maxLength = Math.max(i- map.get(preSum), maxLength);
            }

            else {
                map.put(preSum, i);
            }
        }

        return maxLength;

    }
}