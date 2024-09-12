import java.util.HashMap;

/**
 * Time: O(n)
 * Space: O(n)
 * LeetCode Accepted: yes
 * Problems faced: Understanding algorithm
 */
public class SubArraySum {
	public static int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 1);
		int count=0, runningSum = 0, diff;
		for(int i=0; i<nums.length; i++) {
			//step-1: Calculate running sum
			runningSum+=nums[i];
			//step-2: If difference b/w runningSum and k exists in HashMap, increment count by 1
			diff = runningSum-k;
			if(hm.containsKey(diff)) {
				count = count + hm.get(diff);
			} 
			//step-3: If runningSum does not exist in hm put it with value 1, else increment the value by 1
			if(hm.containsKey(runningSum)) {
				hm.put(runningSum, hm.get(runningSum)+1);
			} else {
				hm.put(runningSum, 1);
			}
		}
		return count;
    }
	public static void main(String[] args) {
		int[] nums = {3,4,7};
		int k = 7;
		System.out.println(subarraySum(nums, k));
	}

}
