// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum=0;
        int result=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for (int i=0;i<n;i++){
            rsum+=nums[i];
            if(map.containsKey(rsum-k)){
                result+=map.get(rsum-k);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }
            else{
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return result;
    }
}