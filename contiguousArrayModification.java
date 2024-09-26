/**
 * Returns the subarray with equal number of 0 and 1s.
 */
import java.util.HashMap;

public class contiguousArray {

    public static void main(String[] args){

        int[] subarray = findMaxArray(new int[]{ 1, 1, 1});
        System.out.println();
        if(subarray == null || subarray.length == 0) System.out.print("No solution");;
        for(int i = 0; i<subarray.length; i++){
            System.out.print(" " + subarray[i]);
        }
    }

    public static int[] findMaxArray(int[] nums) {

        if(nums == null || nums.length == 0) return new int[]{};  //return an empty array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int rSum = 0;
        int max = 0, low = 0, high = 0 ;

        for(int i = 0; i < nums.length; i++){
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
                low = map.get(rSum) + 1;
            }
            else{
                map.put(rSum, i);
            }
        }
        //System.out.println("max: " + max);
        high = max;
        //System.out.println("low: "+ low + " high: " + high);
        int k = 0;
        int[] result =  new int[max];
        for(int j = low; j<high; j++){

            result[k] = nums[j];
            k++;
        }
        for(int i = 0; i<result.length; i++){
            System.out.print(" " + result[i]);
        }
        return result;

    }
}
