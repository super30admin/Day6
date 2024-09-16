//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int count = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // just because we want to track where sub array count is 0
        map.put(0,-1);
        
        for(int i=0; i<nums.length; i++){
           if(nums[i] == 0){
               count-=1;
           }
            else{
                count+=1;
            }
            //subtracting the current index with the previous index value and find max
            if(map.containsKey(count)){
                max = Math.max(max, i-map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        System.out.println(findMaxLength(nums));
    }
}