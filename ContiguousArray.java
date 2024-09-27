// Time Complexity : O(n) where n is the length of array
// Space Complexity : O(n) where n is the length of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : initialization confusion

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        Map<Integer,Integer> map = new HashMap();
        map.put(0,-1); //initialize
        int max = 0, sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum--;
            } else{
                sum++;
            }
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}