// Time Complexity :O(N) where n is the length of the string
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:if the value is 0 we do -1 and if it is 1 we add 1 as we traverse through the array.
// Also store the sum as key and the index of the occurence as value. update the max value, whenever the sum is already present, to the max length.
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums== null || nums.length==0)
            return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;int rsum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i]==0?-1:1;
            if(map.containsKey(rsum))
                max=Math.max(max,i-map.get(rsum));
            else
                map.put(rsum,i);
        }
        return max;
    }
}