
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach I implemented the solution using a HashMap for O(1) key lookup and to avoid nested iterations.
// The HashMap stores the running sum as the key and its corresponding index as the value.
// As I traverse the array, I maintain a running sum (rSum), which is decremented when encountering a 0
// and incremented when encountering a 1. If the running sum has been seen before ( it exists in the HashMap),
// it indicates a balanced subarray, so I calculate the maximum length by finding the difference between the current index and the index of the first occurrence of that running sum. This approach allows me to find the maximum length of the contiguous subarray efficiently.
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> sMap=new HashMap<Integer,Integer>();
        int numLenth=nums.length;
        int rSum=0;
        int max=0;
        sMap.put(0,-1);
        for(int i=0;i<numLenth;i++){
           if(nums[i] == 0){
                rSum--;
                
           }else{
                rSum++;
           }
           if(sMap.containsKey(rSum)){
             int sum=i - sMap.get(rSum);
            max = Math.max(max,sum);

           }else{
               sMap.put(rSum,i);
           }
             
           
          
        }
        return max;
    }
}