//Time Complexity -> o(n)
//Space Complexity -> o(n)
import java.util.*;
public class ContiguousSubArray {

 public int findMaxLength(int[] nums) {

     Map<Integer, Integer> map = new HashMap<>();

     int max = 0;

     int zero = 0;

     for (int i = 0; i < nums.length; i++) {

         if (nums[i] == 0) zero++;

         else zero--;

         if (zero == 0) max = i + 1;

         if (!map.containsKey(zero)) map.put(zero, i);

         else max = Math.max(max, i - map.get(zero));

     }

     return max;

 }
public static void main(String args[]) {
	ContiguousSubArray ob=new ContiguousSubArray();
	int arr[]= {0,1};
	System.out.print(ob.findMaxLength(arr));
	
}
}