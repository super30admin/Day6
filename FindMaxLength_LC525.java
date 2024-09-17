/*
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the hashmap
 */
package Super30;

import java.util.HashMap;

public class FindMaxLength {

	public static void main(String[] args) {
		int[] arr = new int[] {0, 1};
		System.out.println(findMaxLength(arr));
		
		int[] arr2 = new int[] {0,1,0};
		System.out.println(findMaxLength(arr2));
	}
	
	public static int findMaxLength(int[] nums) {
		//maintain a hashmap with key as currentsum and value as start index
		//current sum -> add 1 for every 0, add -1 for every 1
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		//put a value for sum 0
		map.put(0, -1);
		
		int max = 0;
		int curSum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			//calculate curSum
			if(nums[i] == 0)
				curSum += 1;
			else
				curSum +=  -1;
			
			//if map has curSum, update max length; else put curSum
			if(map.containsKey(curSum)) {
				int start = map.get(curSum);
				int end = i;
				max = Math.max(max, end - start);
			}
			else
				map.put(curSum, i);				
		}
		return max;
	}

}
