//Time Complexity -> o(n)
//Space Complexity -> o(n)
import java.util.*;
class SubArraySum {

 public int subarraySum(int[] nums, int k) {

     HashMap<Integer, Integer> map = new HashMap<>();

     int currentSum = 0;

     int count = 0;

     map.put(0,1);

     for(int i = 0; i < nums.length; i++){

         currentSum += nums[i];

         if(map.containsKey(currentSum - k)){

             count += map.get(currentSum-k);

         }

         if(map.containsKey(currentSum)){

             int newCount = map.get(currentSum);

             newCount++;

             map.put(currentSum,newCount);

         } else {

              map.put(currentSum,1);

         }

     }

     return count;

 }
 public static void main(String args[]) {
	 SubArraySum ob=new SubArraySum();
	int arr[]={1,1,1};
			 System.out.print(ob.subarraySum(arr, 2));
 }

}