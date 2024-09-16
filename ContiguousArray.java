// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        
        //Created hashmap to maintain rSum and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int max = 0;   //initialized a counter max to store the length of subarray
        int rSum = 0;  //initialized a rSum
        map.put(0, -1); //edge condition to consider the length of balanced subarray(if any) at index 0 and 1
        
        for(int i = 0; i< nums.length; i++){ //iterating over the array
            if(nums[i] == 0){  
                rSum = rSum - 1;         //calculating rSum if the element at i is 0 by adding -1
            } else{ 
                rSum = rSum + 1;        //calculating rSum if the element at i is 1 by adding 1
            }
            
            if(map.containsKey(rSum)){  //check in hashmap if rSum is present
                max = Math.max(max, i - map.get(rSum)); //calculate and compare max length and store the maximum length
            } else{
                map.put(rSum, i);
            }
        }

        
       return max; 
    }
}