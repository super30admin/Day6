import java.util.HashMap;
//Time complexity is O(n) as we are iterating only one time
//Space complexity is O(n^2) as we have both key and value are integer which can go upto n so n*n = n^2
//this solution is passed on leetcode

public class KContinuousSubarraysBigN16 {
	public int subarraySum(int[] nums, int k) {
		// edge case:
		if (nums.length == 0 || nums == null) {
			return 0;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int rSum = 0;
		int compliment = 0;
		map.put(0,1);
		for (int i = 0; i < nums.length; i++) {
			rSum += nums[i];
			compliment = rSum - k;
			if (map.containsKey(compliment)) {
				count += map.get(compliment);
			}
			if (!map.containsKey(rSum)) {
				map.put(rSum, 1);
			} else {
				map.put(rSum, map.get(rSum) + 1);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		KContinuousSubarraysBigN16 ksum = new KContinuousSubarraysBigN16();
		int[] nums = {1,1,1};
		int k =2;
		int result =ksum.subarraySum(nums, k);
		System.out.println(result);
	}

}
