// Time Complexity :O(N*N) one nested loop
// Space Complexity :O(1) - no additioanl space
// Did this code successfully run on Leetcode : yes and no  because time limit exceeded for larger set of inputs
// Any problem you faced while coding this :Yes, I could not code up the optimal solution, have the brute force solution here 


// Your code here along with comments explaining your approach


class Solution {
    public int findMaxLength(int[] nums) {
        // brute force way 
        int maxi = 0 ; 
        int zero = 0; 
        int one = 0 ; 
        for (int i = 0 ; i < nums.length; i++){
            for (int j  = i ; j < nums.length; j++ ){
            	//increment countof zero and one with its occurence
                if (nums[j] == 0){
                    zero += 1;
                } else{
                    one += 1;
                }
                if (zero == one){ // if the count is same, 2*zero is the total number of zeroes and ones found with equal count
                    maxi = Math.max(maxi,2*zero);
                }
            }
            zero = 0;  // reset the count of zeroes and ones in each iteration 
            one = 0 ;
        }
        
        return maxi;
    }
}