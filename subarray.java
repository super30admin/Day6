// Time Complexity :O(n)
// Space Complexity : O(n) as only one hashMap is added extra
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : followed the idea discussed in the class


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        
         HashMap<Integer, Integer> hashMap=new HashMap<>();
        
        int count=0;
        int currentsum=0;
        
        hashMap.put(0,1);
        
        for(int x:nums){
            currentsum += x;
            int diff= currentsum-k;
            
            if(hashMap.containsKey(diff)){
                count+= hashMap.get(diff);
            }
            
            
            if(hashMap.containsKey(currentsum)){
                hashMap.put(currentsum, hashMap.get(currentsum)+1);
            }
            
            else{
                hashMap.put(currentsum,1);
            }
        }
        
        
        return count;
        
        
        
    }
}