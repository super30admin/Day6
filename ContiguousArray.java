// Time Complexity : O(n) single iteration over all elements
// Space Complexity : O(n) because HashMap used to store the n occurances for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        //null check
        if(nums.length == 0 || nums == null) return 0;
        
        int max = 0;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); //for storing first occurances of running sum digit
        
        map.put(0, -1);//initializing map with -1 index to avoid error at 1st subarr
        
        for( int i = 0; i < nums.length; i++ ) {
            if(nums[i] == 0) { //if the encountered element is zero
                count = count - 1; //decrementing the counter
            }
            else { //else the element must be 1
                count = count + 1; //incrementing the counter
            }
            
            if(map.containsKey(count)) { //map already has key stored (1st occurance)
                max = Math.max(max, (i - map.get(count)) ); //maximum between earlier max and the distance between current index and 1st occurance
            }
            else {
                map.put(count, i); //storing the 1st occurance inside map
            }
                               
        }
        
        return max;
    }
}