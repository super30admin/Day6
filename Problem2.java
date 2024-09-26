// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        //Maintain a current sum using a HashMap
        //Add 1 to sum if nums[i] is 1 and subtract 1 when it is 0
        //Check if running sum exists in HashMap
        //If yes then check and update the max by subtracting the value from current index
        //If no then update the HashMap by putting key as running sum and value as index
        int rsum = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        //Running sum is 0 at index -1
        map.put(0,-1);

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
                rsum+=1;
            else
                rsum-=1;
            if(map.containsKey(rsum))
            {
                int length = i-map.get(rsum);
                if(max<length)
                    max=length;
            }
            else
            {
                map.put(rsum,i);
            }
        }

        return max;
    }

}