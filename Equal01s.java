/*Time Complexity: O(n) one pass through the array.
 * Space complexity: O(n) we are storing the sum of the numbers, so it depends on the input size.
 * leetcode : yes
 * Any Problems : nope
*/
import java.util.HashMap;
class Equal01s {
    public int findMaxLength(int[] nums) {
        int result = 0;
        //used a hashmap to maintain the sum and its earliest index it has occured.
        HashMap<Integer, Integer> hmap = new HashMap<>();
        //this is to manage the edge case where the subarray starts at the starting index
        hmap.put(0, -1);
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i] == 0 ? -1 : 1;
            //if the map contains the sum, means we have a perfectly blanced subarray with equal number of 1's and 0's.
            //so just update the result with the maximum length using current index and the stored index.
            if(hmap.containsKey(sum))
                result = Math.max(result, i - hmap.get(sum));
            //else just put an entry with its index
            else
                hmap.put(sum, i);
               
        }
        return result;
    }
}