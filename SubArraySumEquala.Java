// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {

        //Initialize HashMap
        HashMap<Integer, Integer> map = new HashMap<>(); 

        // Add the Dummy Key Value Pair, not to  miss initial Array example: [3,4] ; if k=7

        //HashMap {{0:1}}
        map.put(0,1);  


        int runningSum = 0;

        // count of sub Array , this our final result
        int count = 0; 

        //looping the nums array length
            for(int i=0;  i< nums.length; i++){ 

                //add all items in Array, one by one and set to running Sum;
                //int [] nums =         {3, 4, 7,   2, -3,  1,  4,  2,  0,  1}
                //runningSum  values =>  3, 7, 14, 16, 13, 14, 18, 20, 20, 21 
                runningSum = runningSum + nums[i]; 
                
                //Increment the count of SubArrays in HashMap  => x+y=z => y=k => z = runningSum

                //{{0:1}}
                if(map.containsKey(runningSum-k)){ // z-y = x
                    count = count+ map.get(runningSum-k);
                }
                if(!map.containsKey(runningSum)){
                    map.put(runningSum, 0);
                }
                map.put(runningSum, map.get(runningSum)+1); 
            }
        return count;
        
        
    }
}