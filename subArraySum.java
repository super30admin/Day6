// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count =0;
        int currSum = 0;
        hashMap.put(0,1);
        for(int x:nums){
            currSum+= x;
            int compliment = currSum - k;
            if(hashMap.containsKey(compliment))
                count += hashMap.get(compliment);
            int n = hashMap.getOrDefault(currSum,0);
            hashMap.put(currSum,n+1);
        }
    return count;
    }
}