// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach



class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0; //holds the length of the largest sub array with running sum = 0
        int rSum = 0; //running sum
        map.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0) rSum -=1;
            else rSum+=1;
            if(!map.containsKey(rSum)){ //if running sum doesn't exist in the hashmap, add it along with the index it was found at
                map.put(rSum, i);
             }else{ //if running sum is already present, calculate the length between the current running sum and the earliest one found by subtracting their indices
                int result = i - (map.get(rSum));
                if(result > max) max = result;
            }
        } return max;
    }
}