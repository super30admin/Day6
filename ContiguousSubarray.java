
// Time Complexity: O(n), where n is the length of the input array.
// Space Complexity: O(n), for storing prefix sums in the HashMap.
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No 
class Solution {
    public int findMaxLength(int[] nums) {
        int rsum=0;
        int n=nums.length;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                rsum--;
            }else {
                rsum++;
            }
            if(map.containsKey(rsum)){
                result=Math.max(result,i-map.get(rsum));
            }else{
                map.put(rsum,i);
            }
        }return result;

    }
}