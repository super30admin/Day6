import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n) ; where n is number of elements in array
// Space Complexity : O(n)
public class Problem1 {
	public int subarraySum(int[] nums, int k) {
		if(nums==null || nums.length==0) return -1;
		
		Map<Integer, Integer> sumMap= new HashMap<>();
		sumMap.put(0, 1); 
		int runningSum=0;
		int count=0;
		
		for(int i=0; i<nums.length; i++) {
			runningSum+=nums[i];			
			
			//if same sum occurred, increment count by frequency of earlier sum
			if(sumMap.containsKey(runningSum-k)) {
				count+=sumMap.get(runningSum-k);
			}
			
			//store frequency of running sum
			sumMap.put(runningSum, sumMap.getOrDefault(runningSum, 0)+1);
		}
		
		return count;
	}

	public static void main(String[] args) {
		Problem1 obj= new Problem1();
		int[] nums= {1,2,3};
		int k=3;
		System.out.println("Total number of subarrays whose sum is "+k+" := "+obj.subarraySum(nums, k));
	}
}
