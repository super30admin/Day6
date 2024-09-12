/*Time Complexity : Brute Force O(n^3), Hashing O(n)- each number is traversed only once.
Space Complexity : O(n) as we are using HashMap and map can contain upto n distinct entries in the worst case.
Your code here along with comments explaining your approach
---Brute Force-----
1. consider every possile subarray of given numbers, we would find sum of each of those subarray and check for the equality of the sum obtained with the given sum k. And we would increment the counter used to store the result.

--Hashmap Approach
1. I would be using the intution that if the running sum (sum[i]) upto two indices are same that means sum of elements lying between those indices i and j will be 0
2. So here we want to subarray with sum k so if difference (runningSum-k) upto two indices is same that means sum of elements lying between those indices i and j will be k
3. So we would use hashmap which will store the runningSum at every index i along with the number of times the same sum occured. 
4. So we keep adding entry in the hashmap everytime we encounter a new runningSum, or else we would be just increasing the count for the runningSum
5. Also we will check how many times runningSum-k has occured already, and that will determine how many subarrays with sum equals to k has occured till index i and we will increment by same amount.
*/
public class Solution {
    public int subarraySum(int[] nums, int k) {
        //edge case
        if(nums == null || nums.length == 0)
            return 0;
        //hashmap to store (runningSum , number of occurences of runningSum till i)
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int runnningSum=0, count=0;
        for(int i=0; i< nums.length; i++){
            runnningSum+= nums[i];
            //check how many times runningSum-k has occured already to determine how many subarrays 
            //with sum equals to k has occured till the current index
            if(map.containsKey(runnningSum-k))
               count += map.get(runnningSum-k);
            
            //Add entry in the map as we encounter a new runningSum, or just increase the count for the runningSum
            map.put(runnningSum, map.getOrDefault(runnningSum, 0)+1);
        }
        return count;
    }
}


