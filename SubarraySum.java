//Time Complexity:  O(n)
//Space Complexity: O(n)
//Leetcode : Yes

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //First integer is current cummulative sum, 
        //Second is the no. of times the integer occurs
        HashMap<Integer, Integer> arr_sums = new HashMap();
        arr_sums.put(0,1); //Initiate i.e sum of 0 has occured once.
        int  sum = 0;
        int count = 0;
        
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            
           // To check if the sum ocurs in the array of size k
            if(arr_sums.containsKey(sum-k)){
                count += arr_sums.get(sum-k);
            }
            
            arr_sums.put(sum, arr_sums.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}