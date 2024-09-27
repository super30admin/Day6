// Time Complexity : O(n)
//Space Complexity: O(n).
//Any issues faced while coding: No


public class  MaxLengthSubArray {
    
    public int findMaxLength(int[] nums) {
        // [0,1,0]
        
        if(nums==null || nums.length==0){
            return 0;
        }
        
        int max=0;
        int rSum=0; 
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                rSum +=1;
            }else{
                rSum -=1;
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,i);
            }else{
                max= Math.max(max,i-map.get(rSum));
            }
        }
        
        return max;
        
    } 
}
