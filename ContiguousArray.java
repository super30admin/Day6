// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int findMaxLength(int[] nums) {

        //map of sum at that index vs index
        HashMap<Integer, Integer> map = new HashMap();

        int runningSum = 0;
        int maxLen = 0;

        //handle edge case becuase in prefix sum we always start from one index behind 0
        //otherwise the case will be missed where first element is included in the subarray
        //because when we count len between 2 indices, first index is excluded and second index is included
        map.put(0, -1);

        for(int i=0; i<nums.length; i++)
        {
            //find runningSum till current index
            if(nums[i]==0)
                runningSum-=1;
            else
                runningSum+=1;

            //map already conatins this sum, balanced sub array found
            if(map.containsKey(runningSum))
            {
                //if current subarray len is greater than max, replace max
                if(i-map.get(runningSum) > maxLen)
                    maxLen = i-map.get(runningSum);
                //else do nothing, don't replace index or form a list if indices, we keep the first occurence index because we want the max length
            }
            //this sum has occured for the first time
            else
                map.put(runningSum, i);
        }

       return maxLen;

    }
}
