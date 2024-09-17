//0(n) time and space complexities
//passed all leetcode cases
//used approach discussed in class

class Solution {
    public int findMaxLength(int[] nums) {
        //edge
        if(nums == null || nums.length ==0) return 0;
        int rsum = 0;
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            rsum = nums[i]==0 ? rsum-1: rsum+1;
            if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }else {
                max = Math.max(max,i- map.get(rsum));
            }
        }
        return max;
    }
}