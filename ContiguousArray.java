/*Approach: 
1. Following the running sum approach, we will decrement the max length value by 1 if we encounter 0. And we will increment the value by 1 if 
we encounter a 1. 
2. By this logic, the final sum should be 0 for the array to be continous with equal number of 0 and 1.
3. We will track the current sum of the elements in a variable rsum. 
4. Everytime we come accross a current sum value that has not been encountered before, we add it to a hashmap. Key being the current sum, 
value being the index.
5. The moment our current sum becomes a value that it has reached before (z=y, meaning x=0 [a contigous array with equal 1s and 0s]), 
it would mean that the legth of the array between the index where rsum was reached 1st and the 2nd time is array we are looking for.  
6. We keep track of the length of these subarrays between the points of same values of rsum, and return the max value.
Time complexity: O(N)
Space complexity: O(N)
*/
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        /*If we don't put this is the hashmap, 1st element will always be ignored.
          Example: [0,1] or [1,0,0,1] will fail. Because we are calculating substring from 1st index (ignoring 0th index). 
          [1,0,1] would succeed. Because subarray starts from index 1st index.
          Adding -1 for 0 index will add one to the length while calculating: (i-map.get(recursiveSum)) whenever rsum will become 0.
        */
        map.put(0,-1);
        int recursiveSum = 0;
        int maxLength = 0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]==0)
                recursiveSum=recursiveSum-1;
            else
                recursiveSum=recursiveSum+1;
            if(!map.containsKey(recursiveSum))
                map.put(recursiveSum,i);
            else
                maxLength=Integer.max(maxLength,(i-map.get(recursiveSum)));
        }
        return maxLength;
    }
}