// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0, sum = 0;
        map.put(0, 1);

        for (int n : nums) {
            sum += n;

            int compliment = sum - k;

            if (map.containsKey(compliment))
                count += map.get(compliment);

            if (!map.containsKey(sum))
                map.put(sum, 0);

            map.put(sum, map.get(sum) + 1);

        }

        return count;

    }
}
