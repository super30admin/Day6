// Before Class 
// Time Complexity : O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Used one for loop and one while loop to iterate over the elements 
// Looping over each element and checking if the sum is equal to k the increase the count by 1

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k) count ++;
            int j = i;
            int current  = nums[j];
            //System.out.println(" value of j outside :"+ j);
            while(j<nums.length-1){
                current = current + nums[j+1];
                //System.out.println("Value of j in while loop: "+ j);
                if(current == k){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}

//After Class
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Initialize the hashmap to store the key i.e Running Value and value as the frequency of that running value 
// looping over the elements and creating running values as well as checking if the current running value rSum minus k (rSum-k) is already present in the HashMap 
// if yes then update the count based on the value of the rSum-k 
// Add newly generated rSum in HashMap, if already present increase count by 1 else create new entry with value 1 
// One main important check to make is that enter O as key and 1 as value so that it handles the edge case by letting the code know that we also have an value rSum such that rSum - k might me equal to 0 then consider whole array as subarray

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int count = 0;
        int rSum = 0;
        for(int i=0;i<nums.length;i++){
            rSum += nums[i];
            if(hm.containsKey(rSum - k)){
                count += hm.get(rSum-k);
            }
            if(hm.containsKey(rSum)){
                hm.put(rSum, hm.get(rSum)+1);
            }else{
                hm.put(rSum, 1);
            }
            
        }
        return count;
    }
}


