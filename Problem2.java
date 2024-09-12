// Time: O(n), Space: O(n)
//To get start and end
/*       * To reduce O(n^2) time complexity to O(nlonK) or O(nlogn) or O(n)
         * i.e. To reduce nested iteration:
         * Sliding window
         * Hashing
         * Two pointers
         * One more (Search)
         */
// Running Sum pattern : for removing nested iterations

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = 0;
        int runningSum = 0;

        int start = 0;
        int end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                runningSum--; // for every 0 subtract 1 from runningSum
            } else {
                runningSum++;// for every 1 add 1 to runningSum
            }
            if (!map.containsKey(runningSum)) {
                map.put(runningSum, i);// Add runningSum and index to map if not added already
            } else {
                // max = Math.max(max, i - map.get(runningSum)); // Select max value with max &
                // difference between current index and previous runningSum
                // For start and end index of the array along with the max length of Contiguous
                // subarray.
                if (max < i - map.get(runningSum)) {
                    max = i - map.get(runningSum); // if max is smaller than the difference between current index and
                                                   // previous runningSum, assign it to max
                    start = map.get(runningSum) + 1;
                    end = i;
                }
            }
        }
        return max;
    }
}