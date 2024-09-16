// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int rSum=0;
        int maxLength=0;
        
        map.put(0,-1);
        
        for(int i=0; i< nums.length; i++){
            
            if(nums[i] == 1){
                rSum += 1;
            }
            else{
                rSum -= 1;
            }
            
            if(!map.containsKey(rSum)){
                map.put(rSum,i);
            }
            else{
                maxLength = Math.max(maxLength, i - map.get(rSum));
            }
            
        }
        
        return maxLength;
        
        
        
        
    }
}