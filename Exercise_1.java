// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {


        /** declare hashmap */
        HashMap<Integer,Integer> hmap1 = new HashMap<>();

        /** initialize sum and count */
        int sum = 0;
        int count = 0;

        /** initialize hmap with 0,1 to increment the sum as it iterates the array */
        hmap1.put(0,1);

        for(int i = 0; i< nums.length; i++) {

            sum = sum + nums[i];

            /** if hash map contains sum - k increment the counter */
            if(hmap1.containsKey(sum - k)) {
                count = count + hmap1.get(sum-k);
            }

            /** add the cumulative sum and occurences of sum */

            hmap1.put(sum, hmap1.getOrDefault(sum,0) + 1);

        }


        return count;


    }
}