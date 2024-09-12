// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //To get the inital balanced continuous subarray
        int rSum = 0; //For maintaining running sum
        int max = 0; //For maintaining maximum length 
        
        for(int i=0; i < nums.length; i++){
            
            //If 0 is encountered, decrement running sum i.e rSum by 1 and if 1 is encountered increment rSum by 1
            if(nums[i] == 0){
                rSum -=1;       
            }else{
                rSum +=1;
            }
            
            //If map contains rSum key, then get maximum length between the index where rSum occured currently and first time, else create a new key-value pair
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }else{
                map.put(rSum, i);
            }
            
        }
        
        return max;
        
    }
}