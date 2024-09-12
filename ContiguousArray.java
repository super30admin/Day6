import java.util.HashMap;

// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int max = 0;
        int currentsum = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            //adding one to currentsum if 1 comes and sutracting 1 if 0 comes
            if(nums[i]==0){
                currentsum=currentsum-1;
            }else{
                currentsum=currentsum+1;
            }
            
            //if the current sum is alrady present in the hashmap, we will get its starting index 
            if(map.containsKey(currentsum)){
                int end = i;
                int start = map.get(currentsum);
                max = Math.max(max,end-start);
            }
            else{
                //if the currentsum is not present in the hashmap, we add its index
                map.put(currentsum,i);
            }
            
        }
        return max;
        
    }
}