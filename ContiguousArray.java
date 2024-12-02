// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : -

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i< nums.length; i++){
            sum = nums[i] == 0 ? sum - 1 : sum + 1;
            if(map.containsKey(sum)){
                int cur = i - map.get(sum);
                if(maxLength < cur)
                    maxLength = cur;

            } else {
                map.put(sum, i);
            }
        }
        return maxLength;


    }
}