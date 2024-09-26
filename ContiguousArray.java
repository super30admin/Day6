// Time Complexity : O(n)
// Space Complexity : O (n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes, calculating max_length is not very intuitive to me. It adds up when I tried on whiteboard.

class ContiguousArray {

    public int findMaxLength(int[] nums) {
    //Create a hashmap to add count and index
     HashMap <Integer, Integer> counts = new HashMap <> ();
     //Start with 0, -1 because we have not added any counts and indices yet.
        counts.put(0,-1);
        int max_length =0;
        int count =0;
        
    for (int i=0; i< nums.length ; i++) {
        //decrease the count if 0 occurs
        if (nums[i] == 0) {
            count -= 1;

        //increase the count if 1 occurs
        }else {
            count += 1;
        }
        
        //if the count exists in hashmap, the calculate max length
        if (counts.containsKey(count)) {
            max_length = Math.max(max_length, i-counts.get(count));
        }

        //otherwise add count and index to the map
        else {
            counts.put(count,i);
        }
    }
        return max_length;
}
}