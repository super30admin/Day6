// Time Complexity : O(n) - where n is the number of elements in the subarraysum
// Space Complexity : O(n) - hashmap space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Same use the running sum approach by tweaking it according to the problem. Find the surrent sum, get the complemet. If complement exsists in the hashmap, add the value assosciates in the hashmap to the count. Always add the Sum obtained at each point to the hashmap.If it is already there increase the occurence,Return the final count.


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        Map<Integer,Integer> hmap=new HashMap<>();
        int rSum=0;
        int count=0;
        hmap.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum+=nums[i];
            int complement=rSum-k;
            if(hmap.containsKey(complement)){
                count+=hmap.get(complement);
            }
            if(!hmap.containsKey(rSum)){
               hmap.put(rSum,0); 
            }
            hmap.put(rSum,hmap.get(rSum)+1);
            
        }
        return count;
    }
}