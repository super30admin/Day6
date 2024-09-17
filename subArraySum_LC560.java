/*
 * Time Complexity: O(n)
 * Space Complexity O(n) for hashmap
 * Steps are included in the code
 */

package Super30;

import java.util.HashMap;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1};
		System.out.println(subArraySum(arr, 0));
		
		int[] arr2 = new int[] {1,2,3};
		System.out.println(subArraySum(arr2, 3));

	}
	
	public static int subArraySum(int[] nums, int target) {
		HashMap<Integer, Integer> map =  new HashMap<>();
		
		//put default value
		map.put(0, 1);
		int curSum = 0;
		int count = 0;
		
		for(int i: nums) {
			//calculate curSum
			curSum += i;
			int complement = curSum - target;
			
            //update count if complement is present
			if(map.containsKey(complement))
				count += map.get(complement);
            
			//if sum is present, increase the occurrence bye 1 else put in the map
			if(map.containsKey(curSum))
				map.put(curSum, map.get(curSum) + 1);
			else
				map.put(curSum, 1);
						
		}		
		return count;
	}

}
