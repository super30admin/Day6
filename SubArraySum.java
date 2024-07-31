// The general understanding is that I do a pre-sum , then I add stuff, and the sum matches the sum-k. 
// I am adding the sum in the map. I am comparing the sum-k, if it matches the sum (which I pre-added), I am good !
// Time complexity = O(n)
// Space complexity = O(n)


import java.util.HashMap;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        //{sum: sequence}
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);// dummy sequence -> when the array is [], the no. of sequence is 1.
        int sum=0;
        int ans=0;
        for(int i=0;i< nums.length;i++) {
            // just keep on adding.
            // initially, the sum will be pushed to the map.
            sum+=nums[i];
            // eg- the sum of the array is 13 (pre-summed).
            // The sum of the second array is 20 (so, like if k =7(given)),
            // the between array has sum of 7. (that's our answer)
            // That's why we took the init map.put(0,1). to compare the array starting from 0th index.
            if(map.containsKey(sum-k)) {
                ans+= map.get(sum-k);
            } 
                map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}