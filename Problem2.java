//Leetcode Problem no: 525: Contiguous Array
//https://leetcode.com/problems/contiguous-array/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : was not intuitive for me.


// Your code here along with comments explaining your approach

class Problem2 {
    public int findMaxLength(int[] nums) {
        //map to keep a track of the sum and the index the sum occured at 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum =0; int maxlength = 0;
        for(int i=0;i<nums.length;i++){
            // assign 1 = 1 and 0 to -1, i.e when we get 1 we add 1 to sum and when we get 0 we subtract 1 from sum.
            if(nums[i]==0){
                sum = sum-1;
            }else{
                sum = sum +1;
            }
            //if the map contains the sum already it means that from this point to the point where the sum has occured before, there are 
            //equal number of 1's and 0's ( we started of with one value of sum and we have come back to the same sum). Update the maxlength
            // to the difference in the indices. We keep updating maxlength as and we the sum occurs again and the difference in the indices is 
            // greater than the current maxlength.
            if(map.containsKey(sum)){
                int val = map.get(sum);
                int length = i - val;
                maxlength = Math.max(maxlength, length);
            }else{
                map.put(sum, i);
            }
        }
        return maxlength;
        
    }
}
