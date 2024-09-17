// Time Complexity :O(n)
// Space Complexity : O(n) as only one hashMap is added extra
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : followed the idea discussed in the class


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        
        int max=0;
        int currentsum=0;
        hashMap.put(0,-1);
        
        for(int x=0; x<nums.length; x++){
            if(nums[x]==0){
                currentsum +=1;
            }else{
                currentsum -=1;
            }
            if(hashMap.containsKey(currentsum)){
                int end=x;
                int start= hashMap.get(currentsum);
                max=Math.max(max, end-start);
            }else{
                hashMap.put(currentsum,x);
            }
        }
        return max;
    }
}