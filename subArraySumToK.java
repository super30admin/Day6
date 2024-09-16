// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        // to consider the pair from index 0
        hm.put(0,1);
        int count=0;
        int resultingSum = 0;
        for(int i=0;i<nums.length;i++) {
            resultingSum += nums[i];
            int curr = resultingSum-k;
            //checking if resultingSum - k already exisits,
            // for instance, [3,4,7,2,-3,1]
            //resulting sum until element 1 is 14,
            //also resulting sum until 7 is 14
            // elements between the index 3 of element 7 and index 5 of element 1 form a subarray
            // whose sum is equal to k, if k=7
            // so take the occurence stored in that key, and update the count
            if(hm.containsKey(curr)) {
                count = count + hm.get(curr);
            }
            // if same occurence of resulting sum is there twice,
            //then update the value of resulting sum by 1
            // which would eventually give us two sub arrays by default
            hm.put(resultingSum, hm.getOrDefault(resultingSum,0)+1);
        }
        return count;
    }
}
