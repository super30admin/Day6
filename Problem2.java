//https://leetcode.com/problems/contiguous-array/

//Time complexity : O(N)
//Space complexity : O(N)
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> s = new HashMap<>();
        s.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            sum += (num == 0 ? -1 : 1);
            if(s.containsKey(sum)){
                max = Math.max(max, i-s.get(sum));
            }else{
                s.put(sum,i);
            }
        }
        return max;
    }
}