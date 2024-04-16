// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

public class ContiguousArrayLC525 {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = 0;
        int runSum = 0;
        map.put(0, -1);// index =-1.arrvalue =-1, running sum =0:to handle nums.length =2.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                runSum++;
            } else {
                runSum--;
            }

            if (map.containsKey(runSum)) {
                maxSum = Math.max(maxSum, (i - map.get(runSum)));
            } else {

                map.put(runSum, i);
            }

        }

        return maxSum;

    }

}
