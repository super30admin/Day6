//Time complexity:O(n) n->length of nums
//Space complexity:O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum+=nums[i];
            int complement=rSum-k;
            if(map.containsKey(complement)){
                count+=map.get(complement);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}