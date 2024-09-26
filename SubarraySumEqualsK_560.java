import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class SubarraySumEqualsK_560 {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        int count = 0;
        
        int currentSum =0;
        
        map.put(0,1);
        
        for(int x:nums){
            currentSum = currentSum+x;
            int compliment = currentSum - k;
            
            if(map.containsKey(compliment)){
                count = count + map.get(compliment);
            }
            
            if(map.containsKey(currentSum)){
                map.put(currentSum,map.get(currentSum)+1);
            } else {
                map.put(currentSum,1);
            }
        }
        
        return count; 
    }
}