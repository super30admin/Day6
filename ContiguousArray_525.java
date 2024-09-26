import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class ContiguousArray_525 {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int currentSum=0;
        
        int max=0;
        
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                currentSum = currentSum -1;
            } else {
                currentSum = currentSum +1;
            }
            
            if(map.containsKey(currentSum)){
                int end=i;
                int start = map.get(currentSum);
                
                max = Math.max(max, end - start);
            } else {
                map.put(currentSum,i);
            }
        }
        
        return max;
    }
}