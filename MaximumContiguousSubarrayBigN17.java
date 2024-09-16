import java.util.HashMap;
// Time complexity is O(n) as we are iterating only one time
// Space complexity is O(n^2) as we have both key and value are integer which can go upto n so n*n = n^2
// this solution is passed on leetcode

public class MaximumContiguousSubarrayBigN17 {

	public int findMaxLength(int[] nums) {
		if(nums.length <=1 || nums == null) {
			return 0;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		int max = 0;
		int rSum = 0;
		map.put(0, -1);
		for (int i = 0; i<nums.length; i++) {
			if(nums[i]==0) {
				rSum+= -1;
			}
			else {
				rSum+=1;
			}
			if(!map.containsKey(rSum)) {
				map.put(rSum, i);
			}
			else {
				int index = i - map.get(rSum);
				max = Math.max(max, index);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumContiguousSubarrayBigN17 max = new MaximumContiguousSubarrayBigN17();
		int [] nums = {0,1,0};
		int result = max.findMaxLength(nums);
		System.out.println(result);
	}

}
