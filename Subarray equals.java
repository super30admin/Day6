// Time complexity 0(n)
// space complexity 0(n)
// code successfully executed in leetcode
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
            int c = sum -k;
            if(map.containsKey(c)){
                count = count + map.get(c);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
        }
        return count;
        } 
    }