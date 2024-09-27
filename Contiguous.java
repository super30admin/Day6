/*Time complexity : O(n)
Space complexity :O(n)
Approach: 
-adding(+1 )to count if we encounter 0 and (-1) from count if we encounter 1
-when count reaches 0 that means the elements have equal 0's and 1's till that i(so max will be i+1 the length)
-and for rest of the count value, we store it in hashmap with its index(i) as value and if we encounter
the same count again that means the elapsed elements have equal number of 0's and 1's and we update our max
accordingly
*/
import java.util.HashMap;
import java.util.Map;

public class Contiguous{
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0,max = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1)count--;
            else count++;
            if(count == 0) max= i+1;
            if(map.containsKey(count)){
                max = Math.max(max,i-map.get(count));
            }
            else{
                map.put(count,i);
            }
        }
        
        return max;
    }

    public static void main(String args[]){
        System.out.println(findMaxLength(new int[]{1,0,1,1,1,1,0,0,0}));
    }
}