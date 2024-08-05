//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;

public class ContiguousArray {

    private static int maxLengthOfSubarray(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int runningSum = 0;
        int max = 0;

        if(nums==null){
            return 0;
        }

        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                runningSum--;
            }
            else{
                runningSum++;
            }

            if(!map.containsKey(runningSum)){
                map.put(runningSum, i);
            }
            else{
                max = Math.max(max, i-map.get(runningSum));
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = new int[]{0,1,0};
        int maxLength = maxLengthOfSubarray(nums);
        System.out.println("The maxLength of subarray is: " + maxLength);
    }
}
