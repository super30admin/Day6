
//Time Complexity : O(n)
//Space Complexity : O(n) because of hashmap

package Interview;

import java.util.HashMap;

public class SubarraySum {
	
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		System.out.println(getsubarraySum(nums, 2));

	}

	public static int getsubarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums ==null){
            return 0;
        }
        //first ineteger would be running sum and second would the frequency of  running sum
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 0;
        int rSum = 0;
        map.put(0,1);
        for(int i = 0 ; i< nums.length;i ++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum-k)){
                cnt = cnt + map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum ,0) + 1);
        }
        return cnt;

    }
}
