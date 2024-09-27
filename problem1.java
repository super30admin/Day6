class Solution {
    //Brute force
//time: O(N^2), Space: O(1)

    public int subarraySum(int[] nums, int k) {

        int curr=0;
        for(int i=0; i<nums.length; i++){
        int sum=0; //sum takes care of continuous subarrays 
            for(int j=i; j<nums.length; j++){
              
                sum+=nums[j];
                
                if(sum==k) curr++;
            }
            
        }
        
        return curr;
    }
}