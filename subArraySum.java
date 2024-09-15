Time Complexity-O(n)
Space Complexity-(n)

Leetcode Submission-Successful

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums==null || nums.length==0) return 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int runningSum=0;
        int count=0;
        map.put(0,1);
        for(int num:nums)
        {
            runningSum+=num;
            int comp=runningSum-k;
            if(map.containsKey(comp))
                count+=map.get(comp);
            map.put(runningSum,map.getOrDefault(runningSum,0)+1);
        }
        return count;
    }
}
