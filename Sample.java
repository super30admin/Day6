import java.util.*;

/**
 *         ***************** Please review this commented out approach also ****************
 * // Time Complexity : O(n^2)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this : No
 * // Your code here along with comments explaining your approach
 * It checks every element with every other element in the array but taking its sum. If sum == k then counter will be incremented. Example: i=0, j=i, in the first iteration
 * sum+= nums[j++]. If this point in time the sum is equal to k, counter will be incremented, else j will be incremented.
 */

/** ************** The hashMap approach *****************
 * // Time Complexity : O(n)
 * // Space Complexity : O(n) because using hashmap to maintain sum
 * // Did this code successfully run on Leetcode : yes
 * // Any problem you faced while coding this : Could not think of this approach without looking up the solution
 *
 * // Your code here along with comments explaining your approach
 * 
 */
class problem16 {
    public int subarraySum(int[] nums, int k) {


//         int counter =0;
//         int sum = 0;
//         for(int i=0; i<nums.length; i++){
//                 sum = 0;

//             for(int j=i; j < nums.length; j++){

//                    sum = sum + (nums[j]);
//                  if(sum == k){
//                        counter ++;
//                     }
//                 // System.out.println(sum);

//             }
//         }

//         return counter;

        int counter = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // Initially we assume that we have seen a sum of 0 one time
        for(int i: nums){
            sum+=i; // current Sum is incremented to the aggregation of elemens in Nums
            if(map.containsKey(sum-k)){ // if sum - k has been seen before, that means we have a sub array that sums to K
                counter += map.get(sum-k);
                // map.put(sum,1);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // else we put the current aggregated sum in the map. getOrDefault used to update the record of Sum if seen in more than one place

        }
        return counter;
    }
}

/**
         /Time Complexity:O(n)
         // Space Complexity : O(n) because we are using hashmap to store aggregated sum
         // Did this code successfully run on Leetcode : Yes
         // Any problem you faced while coding this : Yes, could not think of the optimized solution without looking it up
 */
class problem17 {
    public static int findMaxLength(int[] nums) {


        int sum=0;
        int max_sub_array=0;
        Map<Integer, Integer> map = new HashMap<>(); // a map to store [sum, and index where we encountered that sum]
        map.put(0,-1); // Initially assume that we have not seen a sum of 0, put it to -ve value for the edge case where the first element would be 0 in nums.
        for(int i=0;i<nums.length; i++){
            if(nums[i]==0){ // if we see 0, deduct -1 from the current sum
                sum+=-1;
            }else{
                sum+=nums[i]; // else if it is 1, add 1 in the sum
            }

            if(map.containsKey(sum)){ // check if sum exists in the map, if so, check its index. That index = current index will give the length of the longest subarray
                max_sub_array = Math.max(max_sub_array,i-map.get(sum)); // update max sub array length in case we see a bigger one
            }else{
                map.put(sum, i); // else put that sum in the map with the current index
            }
        }
        return max_sub_array; 
    }


}
