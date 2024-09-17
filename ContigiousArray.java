import java.util.HashMap;

public class ContigiousArray {
  
        public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer>map = new HashMap<>();
            int rsum = 0;
            map.put(0,-1);
            int max = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i] == 0)
                {
                    rsum--;
                }
                else{
                    rsum++;
                }
                if(!map.containsKey(rsum)){
                    map.put(rsum, i);
                }
                else{
             int count = i-map.get(rsum);
             max = Math.max(max, count);
    
                }
                
            }
            return max;
        }
        

}
