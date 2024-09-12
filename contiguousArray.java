//Time Complexity : O(N)
//Space Complexity : O(N)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        //if array is null
        if(nums==null||nums.length==0||nums.length==1)
            return 0;
        //initialize hashMap with return type of integer
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        hashMap.put(0,-1);
        int max=0, cnt=0;
        //iterating over the array
        for(int i=0;i<nums.length;i++){
            //if in the array we find 0 then we decrement the count
            if(nums[i]==0)
                cnt--;
            else
                //else increment the count
                cnt++;
            //if the current count is already in the Map
            if(hashMap.containsKey(cnt))
                //we will take compare previous max value and the current length and return max among them
                max=Math.max(max,i-hashMap.get(cnt));
            else
                //add it to the hashMap
                hashMap.put(cnt,i);
        }
        //the length of the contiguous subarray
        return max;
    }
}