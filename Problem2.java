// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Problem statement: https://leetcode.com/problems/contiguous-array/

class Problem2{
        public int findMaxLength(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,-1);
            int rSum = 0;
            int len=0;

            for(int i=0;i<nums.length;i++){
                if(nums[i] == 0){
                    rSum--;
                }else{
                    rSum++;
                }

                if(map.containsKey(rSum)){
                    len = Math.max(len, i - map.get(rSum));
                }else{
                    map.put(rSum, i);
                }
            }
            return len;
        }
}

