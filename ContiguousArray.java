// Time Complexity : O(n) n is the no of elements in the array
// Space Complexity : O(n) where n is the size of the hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Use a counter : when we encounter a
0 : decrement the count
1 : increment the count
make use of a map to keep track of the indices to find the largest subarray
if we encounter a count that is previously seen, the index between the current
and previously seen count is a continuous subarray
 */

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int count=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]==1?1:-1);
            if(map.containsKey(count)){
                maxlen=Math.max(maxlen,i-map.get(count));
            }
            else {
                map.put(count,i);
            }
        }

        return maxlen;

    }
}
