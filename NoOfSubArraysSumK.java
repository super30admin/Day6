import java.util.HashMap;
/*Time Complexity: O(n) one pass through the array.
 * Space complexity: O(n) we are storing the prefixsum of the numbers, so it depends on the input size.
 * leetcode : yes
 * Any Problems : nope
*/
public class NoOfSubArraysSumK {
    public int subarraySum(int[] nums, int k) {
        //used hashmap to store the current sum and the no of times it has previously occurred
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int result = 0;
        //this is to manage the edge case where the subarray starts from the initial index
        hmap.put(0, 1);
        int preSum = 0;
        for(int i=0; i<nums.length; i++)
        {
            preSum += nums[i];
            //if map contains its compliment sum that was formed after removing k from it before then just add that to the resul
            if(hmap.containsKey(preSum-k))
                result += hmap.get(preSum-k);
            //everytime put the sum to the map by incrementing its previous count.
            hmap.put(preSum, hmap.getOrDefault(preSum, 0)+1);
        }
        return result;
    }

}
