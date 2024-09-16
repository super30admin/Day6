// Time Complexity :O(n)
// Space Complexity :O(n)
import java.util.HashMap;

public class FindMaxLength {

        public int findMaxLength(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            hm.put(0, -1);
            int maxlen = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==1)
                    count+=1;
                else
                    count-=1;
               
                if (hm.containsKey(count)) {
                    maxlen = Math.max(maxlen, i - hm.get(count));
                } else {
                    hm.put(count, i);
                }
            }
            return maxlen;
        }
    
    
}
