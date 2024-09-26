/*

Thought Process: Understanding to solve it using HashMap is something tricky. Need more practice.

    Logic is to find difference between sum[i] and sum[j] to be equal to k. When we find it get the sum[j]-k occurence and add to count.
    
T.C -> O(N) where N is the length of nums

S.C -> O(N) where N is the length of nums and is the max size of HashMap in worst scenario


*/

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n : nums){
            sum += n;
            if(map.containsKey(sum-k))
                count += map.get(sum-k);
            // Mistakes Commited -> Was writing this put statement above if
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}