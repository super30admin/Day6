import java.util.HashMap;


class Solution {
    public int findMaxLength(int[] nums) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int val = 0;
        map.put(0,0);
        
        int max = 0;
            
            for(int i=0;i< nums.length ;i++){
                if(nums[i] == 1){
                    val++;
                }
                else{
                    val--;
                }
                if(!map.containsKey(val))
                    map.put(val,i+1);
                else {
                    if(i-map.get(val) > max){
                        max = i+1 - map.get(val);
                    }
                }
                }
                
                
            
                return max;
        
    }
}