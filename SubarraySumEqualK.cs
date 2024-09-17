// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/subarray-sum-equals-k/submissions/

public int SubarraySum(int[] nums, int k) {
    if(nums == null || nums.Length == 0)
        return 0;

    Dictionary<int, int> map = new Dictionary<int, int>();
    //this is to handle case where tow element becomes target e.g. [3, 4] = 7
    map.Add(0, 1);
    int runningSum = 0;
    int totalLength = 0;

    for(int i = 0; i < nums.Length; i++)
    {
        runningSum += nums[i];

        //whicever array are on, we check the different is present in hashmap
        //it means, we seen that sum before for subarray, which tells, how many times we seen that 
        //each current sum will give u subarray, then we can add number of array we seen so far.
        int currentSum = runningSum - k;
        if(map.ContainsKey(currentSum))
            totalLength += map[currentSum];
        
        if(map.ContainsKey(runningSum))
            map[runningSum] += 1;
        else
            map.Add(runningSum, 1);
    }

    return totalLength;

}