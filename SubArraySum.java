import java.util.HashMap;
public class SubArraySum {
	    public int subarraySum(int[] nums, int k) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        int n = nums.length, count = 0, currSum = 0;
	        hm.put(0,1);
	        for(int i = 0; i < n; i++){
	            currSum += nums[i];
	            if(hm.containsKey(currSum-k)){
	                count += hm.get(currSum - k);
	            }
	            hm.put(currSum, hm.getOrDefault(currSum,0) + 1);
	        }
	        System.out.println(hm);
	        return count;
	    }
}

//Time Complexity  - O(n)
//space Complexity = O(n)
