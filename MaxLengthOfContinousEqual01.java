// Time Complexity : O(n) where n is length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Running sum is not intutive yet, need more practise. Could not identify technique myself.

package Hashing2;

import java.util.HashMap;
/*
Compute running sum array
Create map
If first occurance add to map
If key exists Max(currentindex-index from map, max) = max length of continous equal 0 and 1
 */
class MaxLengthOfContinousEqual01 {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int runningSum=0;
        int maxLength=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                runningSum-=1;
            } else if(nums[i]==1){
                runningSum+=1;
            }
            if(map.containsKey(runningSum)){
                int index = map.get(runningSum);
                int currentDiff = (i-index);
                maxLength = Math.max(maxLength, currentDiff);
            } else {
                map.put(runningSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] nums={0,0,0,1,0,0,1,1,1,0,0,0,0};
        System.out.println(new MaxLengthOfContinousEqual01().findMaxLength(nums));
        int [] nums1={0,1};
        System.out.println(new MaxLengthOfContinousEqual01().findMaxLength(nums1));
        int [] nums2={0,1,0};
        System.out.println(new MaxLengthOfContinousEqual01().findMaxLength(nums2));
    }
}