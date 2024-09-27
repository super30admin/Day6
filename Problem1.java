// Time Complexity : O(N) - for loop to iterate through array
// Space Complexity : O(N) - Hashmap 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//  Hashmap to store sum and no. of sub arrays
// if hashmap contains complement add the corresponding value to the previous count
// if hasmap doesnt contain sum add with value 1 and increase on every next iteration if the same sum is found


class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        h.put(0,1);
        
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            int comp = sum -k;
            if(h.containsKey(comp)){
                count+=h.get(comp);
            }
            
            if(!h.containsKey(sum)){
                h.put(sum,1);
            }else{
                h.put(sum,h.get(sum) +1);
            }
            
            
        }
        
        return count;
    }
}