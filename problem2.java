// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
    1. create a hash map, we are using hashmap to decrease time complexity.
    2. add dummy value to not miss first element.
    3. add 1 to running sum if element is 1 or else add -1 while iterating through
    each element.
    4. if u find a new running sum value which is not in hashmap then add it as key
    and its index as value.
    5. if it already exists, then update max with max of differencew b/w the index
    and previous max.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> storage = new HashMap<> ();
        storage.put(0,-1);
        int max = 0;
        int rsum = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] == 0) rsum -= 1;
            else rsum += 1;
            if(storage.containsKey(rsum)) max = Math.max(max, i - storage.get(rsum));
            else storage.put(rsum, i);
        }
        return max;
    }
}