// Time Complexity : O(n) n = no.of elements in array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length<1 || nums==null){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int temp=0;
        int len=0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                temp=temp-1;
            }else{
                temp = temp+1;
            }
            if(map.containsKey(temp)){
                len = Math.max(len, i-map.get(temp));
            }else{
                map.put(temp,i);
            }
        }
        return len;
    }
}