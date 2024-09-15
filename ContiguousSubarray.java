//TC: O(N)
//SC: O(N)

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0; int max = 0;
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                sum -= 1;
            else 
                sum += 1;
            if(map.containsKey(sum)) {
                max = Math.max(max,i - map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        return max;
    }
}