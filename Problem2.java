// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;int count=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)) {
                int length= i - map.get(sum);
                count = Math.max(count,length);
            }
            else{
                map.put(sum,i);
            }
        }
        return count;
    }
}