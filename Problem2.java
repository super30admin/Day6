import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n) ; where n is number of elements in array
// Space Complexity : O(n); worst case array may have all 1s or all 0s and map will have to maintain.
public class Problem2 {
	public int findMaxLength(int[] nums) {
		if(nums==null || nums.length==0) return -1;
		
		Map<Integer, Integer> map= new HashMap<>();
		map.put(0, -1); //to handle edge case for beginning of array
		int runningSum=0;
		int maxLength=0;
		
		for(int i=0; i<nums.length; i++) {
			//Decrease by 1 if 0, else increase by 1. 
			if(nums[i] == 0) {
				runningSum--;
			}else {
				runningSum++;
			}
			
			//Check if subarray here has equal 0 and 1's. 
			//If runningSum has happened before, means we found balanced array from first index of this runningSum till current.
			if(map.containsKey(runningSum)) {
				maxLength= Math.max(maxLength, i-map.get(runningSum));
			}else {
				map.put(runningSum, i);
			}
		}
		
		return maxLength;
	}

	public static void main(String[] args) {
		Problem2 obj= new Problem2();
		int[] nums= {0,1,0,1,1,0};
		System.out.println("Max length of contiguous subarray: "+obj.findMaxLength(nums));
	}

}
