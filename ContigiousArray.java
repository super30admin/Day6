//Time complexity O(N)
//Space complexity is O(N)
//Able to submit leetcode
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int count = 0;
        int result  = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]==0?-1:1);
            if(!map.keySet().contains(count)){
                map.put(count, i);
            }
            else{
                result = Math.max(result, i-map.get(count));
            }
        }
        return result==Integer.MIN_VALUE?0:result;
    }
}