//Problem2 (https://leetcode.com/problems/contiguous-array/)
//
//T: O(N)
//S:O(N)

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i]==0 ? -1 : +1;
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                count = Math.max(count, i - map.get(sum));
            }
        }

        return count;
    }
}