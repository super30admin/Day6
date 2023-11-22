//TC-O(n)
//SC-O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {

        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum=0;
        for(int i=0;i<nums.length;i++){
            rSum+=nums[i];

            if(map.containsKey(rSum-k)){

                count=count+map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}