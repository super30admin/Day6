// Time Complexity : O(n) - where n is the length of the nums array.
// Space Complexity : O(n) - a case where there are all one's in the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We use the running sum approach. Edge case check we use (0,-1).
//We check a point were the sum has occurred again and subtract the current index with the index at which the first occurence of the sum happens(3-3-> 0 the curr subarray is valid ) we check for the sum at that place.

class Solution {
    public int findMaxLength(int[] nums) {
       if(nums==null || nums.length==0) return 0;
        Map<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum= nums[i]==0 ? sum-1 : sum+1;
            if(hmap.containsKey(sum)){
                int currlen=i-hmap.get(sum);
                if(currlen>max) //or Math.max()
                    max=currlen;
            }
            else
                hmap.put(sum,i);
        }
         return max;  
       }
    }