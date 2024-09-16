// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
/*Approach - here we have maintained the running sum and the index of the first occurrence that running sum
 in the hashmap.At every index i, if element in the array is 0, subtract 1 from the current rsum else if
 it is 1 add 1 to the current rsum. keep updating the  max (max length of the contiguous array) value if there
 is match of rsum in the hmap. max is calculated using the difference between current index of a running sum
  and the index of the first occurrence that running sum. If rsum is not present in hmap insert it.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;

        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int rsum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                rsum=rsum-1;
            else
                rsum=rsum+1;
            if(hm.containsKey(rsum)){
                max=Integer.max(max,i-hm.get(rsum));
            }
            else{
                hm.put(rsum,i);
            }
        }
        return max;
    }
}