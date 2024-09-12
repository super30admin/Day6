//Time Complexity: O(n)
//Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No




class ContiguousArray
 {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0) return 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        //use running sum, add 1 for every subtract running sum and for 0 seen increment sum by 1
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1)
                sum--;
            else
                sum++;
            if(map.containsKey(sum)){ // check if the sum is in map
                max = Math.max(max, i - map.get(sum)); // if yes get the respective index and subtracr from i to get the max
            }
            else
                map.put(sum, i); //if map doesnt contians the sum then insert
        }
        return max; // return max
    }
}
