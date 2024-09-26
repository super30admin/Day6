/*
In this we are asked to find out the longest continuous subarray consisiting equal numbers of 1's and equal number of 0's.
Approach: we make use of a new concept i.e. RUNNING SUM.
*/
// Time Complexity : O(n) // Iterate the loop n times(length of array)
// Space Complexity : O(n) // Hashmap of n size
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){return 0;}
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count = count - 1;
            }
            else{
                count = count + 1;
            }
            if(!map.containsKey(count)){
                map.put(count,i);
            }
            else{
                max = Math.max(i-map.get(count), max);
            }
            }
            return max;
        }
    }